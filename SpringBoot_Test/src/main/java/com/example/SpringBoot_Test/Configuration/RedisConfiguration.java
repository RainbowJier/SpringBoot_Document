package com.example.SpringBoot_Test.Configuration;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Description：TODO
 * @Author： 30218
 * @Data： 2024/4/1 14:06
 */
@Configuration
public class RedisConfiguration {
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {

        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        // Convert Java object into JSON format for storage in Redis.
        FastJsonRedisSerializer fastJsonRedisSerializer = new
                FastJsonRedisSerializer(Object.class);

        // Set the serializer for key to StringRedisSerializer.
        template.setKeySerializer(new StringRedisSerializer());
        // Set the serializer for value to FastJsonRedisSerializer.
        template.setValueSerializer(fastJsonRedisSerializer);


        // For hash type data, set the serializer for key to StringRedisSerializer.
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(fastJsonRedisSerializer);

        template.afterPropertiesSet();
        return template;
    }
}