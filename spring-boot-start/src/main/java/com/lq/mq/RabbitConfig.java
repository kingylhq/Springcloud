package com.lq.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 * 创建队列的注册中心，注册的IOC容器
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 15:39
 * 人求上进先读书
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue rabbitQueue() {
       return new Queue("rabbitmqQueueName");
    }
}
