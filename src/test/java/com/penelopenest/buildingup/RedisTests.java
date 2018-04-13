package com.penelopenest.buildingup;

import com.penelopenest.buildingup.domain.Customer;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author penelopeWu
 * @version 1.0
 * @date 2018-04-13 0:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class RedisTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Customer> redisTemplate;


    @Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("penelope", "Good");
        Assert.assertEquals("Good", stringRedisTemplate.opsForValue().get("penelope"));
    }


    @Test
    public void test2() throws Exception {


        // 保存对象
        Customer user = new Customer("超人", 20);
        redisTemplate.opsForValue().set(user.getName(), user);

        user = new Customer("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getName(), user);

        user = new Customer("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getName(), user);

        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());


    }
}
