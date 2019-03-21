package com.lq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:  测试自定义Redis类
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 18:20
 * 人求上进先读书
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRedisStartApplication.class)
public class RedisTest {

    @Resource
    Jedis jedis;

    @Test
    public void redisTest() {
        jedis.set("lianpo", "廉颇");

        String name = jedis.get("lianpo");

        System.out.println("属性名称："+name);

    }



}
