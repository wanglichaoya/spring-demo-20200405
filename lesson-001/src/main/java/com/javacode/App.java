package com.javacode;

import com.javacode.demo01.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.say();

    }
}
