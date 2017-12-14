package com.boleto.http;

import java.io.UnsupportedEncodingException;
import java.net.URI;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;

/**
 * This class is responsible for creating the proper 
 * request using PUT, POST or GET
 * 
 * @author Marcos
 *
 */
public class HttpMethodFactory {

	public HttpRequestBase buildRequest(APIMethod method, URI uri, String credentials, String payload) throws UnsupportedEncodingException {
		
		HttpRequestBase request = null;
		switch(method) {
			case PUT:
				request = new HttpPut(uri);
				addPayload(request, payload);
				break;
			case POST:
				request = new HttpPost(uri);
				addPayload(request, payload);
				break;
			default:
				request = new HttpGet(uri);
				break;
		}
		
		HttpHeadersHelper.addHeaders(request, credentials);
		return request;
	}
	
	/**
	 * Add the payload to the request
	 * 
	 * @param request
	 * @param payload
	 * @throws UnsupportedEncodingException
	 */
	private void addPayload(HttpRequestBase request, String payload) throws UnsupportedEncodingException {
		StringEntity entity = null;
		if (payload != null) entity = new StringEntity(payload);

		if (request instanceof HttpPut) {
			((HttpPut) request).setEntity(entity);
		} else if (request instanceof HttpPost) {
			((HttpPost) request).setEntity(entity);
		}
	}
}
