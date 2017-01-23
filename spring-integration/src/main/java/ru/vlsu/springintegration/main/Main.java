package ru.vlsu.springintegration.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by p.golovkin on 07.01.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");
        Message<String> message = MessageBuilder.withPayload("hello world!").build();
        MessageChannel inChannel = (MessageChannel) ctx.getBean("helloWorldInChannel");
        inChannel.send(message);

    }
}
