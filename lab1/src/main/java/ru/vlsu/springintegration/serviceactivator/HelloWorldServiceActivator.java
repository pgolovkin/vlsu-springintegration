package ru.vlsu.springintegration.serviceactivator;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceActivator {

	@ServiceActivator
	public void handleMessage(Message<String> message) {
		System.out.println(message.getPayload());
	}
}
