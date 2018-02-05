package com.jms.service;

import javax.jms.Destination;

/**
 * 消费者
 */
public interface CustomerService {
    /**
     * 接收消息
     */
    void receive(Destination destination);

}
