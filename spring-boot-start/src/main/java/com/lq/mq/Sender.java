package com.lq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 * 生产者
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 15:30
 * 人求上进先读书
 */
@Component
public class Sender {

    @Autowired
    AmqpTemplate rabbitTemplate;

    public void send() {
        //第一个参数：队列名称 ，第二个参数：发送的消息
        rabbitTemplate.convertAndSend("rabbitmqQueueName", "RabbitMQ Send Message");
    }
}
