package ru.vlsu.springintegration.serviceactivator;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldPrintServiceActivator {

	@ServiceActivator
	public Message<String> handleMessage(Message<String> message) {
		System.out.println(message.getPayload());
		return message;
	}
}
