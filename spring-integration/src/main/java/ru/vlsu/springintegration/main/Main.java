package ru.vlsu.springintegration.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vlsu.springintegration.converter.TempConverter;

/**
 * Created by p.golovkin on 07.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");
        // Simple Service
        TempConverter converter =
                ctx.getBean("simpleGateway", TempConverter.class);
        System.out.println(converter.fahrenheitToCelcius(68.0f));
        // Web Service
        converter  = ctx.getBean("wsGateway", TempConverter.class);
        System.out.println(converter.fahrenheitToCelcius(68.0f));
    }
}
