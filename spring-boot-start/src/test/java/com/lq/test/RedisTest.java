package com.lq.test;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 14:08
 * 人求上进先读书
 */
public class RedisTest extends BaseTest {

    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @Test
    public void getSetKey() {
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set("name", "李谦");

        System.out.println("姓名："+ops.get("name"));
    }



}
