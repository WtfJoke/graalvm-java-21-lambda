package io.github.wtfjoke;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PersonHandler implements RequestHandler<Object, String> {

	static {
		System.setProperty("software.amazon.awssdk.http.service.impl",
				"software.amazon.awssdk.http.urlconnection.UrlConnectionSdkHttpService");
	}

	@Override
	public String handleRequest(Object event, Context context) {
		return "hi";
	}
}