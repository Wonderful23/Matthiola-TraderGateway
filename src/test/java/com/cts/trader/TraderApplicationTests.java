package com.cts.trader;

import com.cts.trader.model.Future;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TraderApplication.class)
public class TraderApplicationTests {
    
	@Test
	public void contextLoads() {
		System.out.println("contextLoads");
	}
	
}
