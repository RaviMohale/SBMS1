package com.ravi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.ravi.binding.Country;

@Configuration
public class RedisConfig {
	
	
	@Bean
	public JedisConnectionFactory jedisConn() {
		JedisConnectionFactory  jedis = new JedisConnectionFactory();
		/*
		 * //jedis server properties
		 *  //for same machine redis property not required
		 * jedis.setHostName(null); 
		 * jedis.setPort(0);
		 */
		
		
		return jedis;
	}
	
	@Bean
	public RedisTemplate<String,Country> redisTemplete(){
		
		RedisTemplate<String,Country> rt = new RedisTemplate<>();
		rt.setConnectionFactory(jedisConn());
		return rt;
		
		
	}

}
