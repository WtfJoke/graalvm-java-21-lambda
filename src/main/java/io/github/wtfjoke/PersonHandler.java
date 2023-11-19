package io.github.wtfjoke;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PersonHandler implements RequestHandler<Person, String> {
	@Override
	public String handleRequest(Person event, Context context) {
		System.out.println("Event: " + event.toString());
		return "Hi " + event.name() + ", you are " + event.age() + " years old!";
	}
}