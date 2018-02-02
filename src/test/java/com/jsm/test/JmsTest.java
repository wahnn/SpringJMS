package com.jsm.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JmsTest {


    @Test
    public void producerTest(){
        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-core.xml"});
    }
}
