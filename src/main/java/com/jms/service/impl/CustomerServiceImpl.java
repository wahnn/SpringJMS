package com.jms.service.impl;

import com.jms.service.CustomerService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private JmsTemplate jmsTemplate;
    /**
     * 接受消息
     * @param destination
     */
    public void receive(Destination destination) {

        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
        try {
            System.out.println("从队列》"+destination.toString()+"成功获取消息》"+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
