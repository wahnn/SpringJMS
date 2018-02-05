package com.jsm.test;

import com.jms.service.CustomerService;
import com.jms.service.ProducerService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jms.Destination;


public class JmsTest {


    @Test
    public void producerTest(){

        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-core.xml"});
        ProducerService producerService = (ProducerService)springContext.getBean("producerServiceImpl");
        CustomerService customerService = (CustomerService)springContext.getBean("customerServiceImpl");

        Destination destination = (Destination)springContext.getBean("queueDestination");
        producerService.sendMessage("测试消息队列");
        customerService.receive(destination);
    }
}
