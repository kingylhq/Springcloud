package com.lq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 * 消费者
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 15:35
 * 人求上进先读书
 */
@Component
// 订一起该类需要监听的队列，队列名称
@RabbitListener(queues = "rabbitmqQueueName")
public class Receiver {

    // 注解含义：指定对消息的处理
    @RabbitHandler
    public void process(String message) {
        System.out.println("receive mesage ："+message);
    }
}
