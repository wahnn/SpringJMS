package com.jms.service;


import javax.jms.Destination;

/**
 * 生产者
 */
public interface ProducerService {

    /**
     * 想指定队列发送消息
     * @param destination
     * @param msg
     */
    void sendMessage(Destination destination, String msg);

    /**
     * 向默认队列发送消息
     * @param msg
     */
    void sendMessage(String msg);
}
