package com.boleto.http;

import org.apache.http.client.methods.HttpRequestBase;

public class HttpHeadersHelper {

	private static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";
	private static final String USER_AGENT = "MyApp (mfmc11@hotmail.com)";

	public static void addHeaders(HttpRequestBase request, String credentials) {
		request.setHeader("Content-Type", CONTENT_TYPE_APPLICATION_JSON);
		request.setHeader("User-Agent", USER_AGENT);
		request.setHeader("Authorization", "Basic " + credentials);
	}
}
