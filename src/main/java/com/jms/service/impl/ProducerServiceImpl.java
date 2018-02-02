package com.jms.service.impl;

import com.jms.service.ProducerService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * 发送消息
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Resource
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String msg) {
        System.out.println("向队列"+destination+"发送消息");
        jmsTemplate.convertAndSend(destination,msg);
    }

    public void sendMessage(String msg) {
        System.out.println("向队列"+jmsTemplate.getDefaultDestination().toString()+"发送消息");
        jmsTemplate.convertAndSend(msg);
    }
}
