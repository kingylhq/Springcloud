package com.lq.test;

import com.lq.mq.Sender;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 16:28
 * 人求上进先读书
 */
public class RabbitMqTest extends BaseTest {

    @Resource
    Sender sender;

    @Test
    public void rabbitMqTest() {
        sender.send();
    }
}
