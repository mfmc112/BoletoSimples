package com.boleto.http;

import java.io.IOException;
import java.net.URI;
import java.util.Base64;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.boleto.asset.Asset;

public class HttpClient<T extends Asset> {

	private final int TIMEOUT_IN_MILLISECONDS = 15000;
	private HttpMethodFactory factory = new HttpMethodFactory();
	
	public String makeAPICall(APIMethod method, URI uri, String payload) throws Exception {
		String result = null;
		String credentials = retrieveCredentials();
		HttpRequestBase request = factory.buildRequest(method, uri, credentials, payload);

		RequestConfig defaultRequestConfig = RequestConfig.custom().setConnectTimeout(TIMEOUT_IN_MILLISECONDS).setSocketTimeout(TIMEOUT_IN_MILLISECONDS).build();
		final CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();

		try {
			final ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				
				public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
					HttpEntity entity = response.getEntity();
					String result = null;
					if (entity != null) {
						result = EntityUtils.toString(entity, "UTF-8");
						if (response.getStatusLine().getStatusCode() >= 400) {
							throw new HttpResponseException(response.getStatusLine().getStatusCode(), result);
						}
					}
					return result;
				}
			};
			result = httpClient.execute(request, responseHandler);
		} finally {
			httpClient.close();
		}
		return result;
	}


	private String retrieveCredentials() {
		String userName = "774e9e3e204bf5570715033c5dd9ce8ecced56e33cb7acd17188362de54e23ef";
		String password = "x";
		return Base64.getEncoder().encodeToString((userName + ":" + password).getBytes());
	}

}
