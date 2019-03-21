package com.lq.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 * Redis 自动配置类
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 18:06
 * 人求上进先读书
 */
@Configuration
@ConditionalOnClass(Jedis.class)
// 开启使用映射实体对象 （RedisProperties注意这里是自定义的这个类，不要导错包）
@EnableConfigurationProperties(RedisProperties.class)
// 存在对应配置信息时初始化该配置类
@ConditionalOnProperty
        (
                // 存在配置前缀redis
                prefix = "redis",
                // 开启
                value = "enabled",
                // 缺失检查
                matchIfMissing = true

        )
public class RedisAutoConfiguration {

    @Bean
    // 没有Jedis 这个客户端对象才加载到IOC容器中
    @ConditionalOnMissingBean
    public Jedis jedis(RedisProperties redisProperties) {
        return new Jedis(redisProperties.getHost(), redisProperties.getPort());
    }
}
