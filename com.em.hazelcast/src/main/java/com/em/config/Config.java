package com.em.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@Component
public class Config {
		
		@Bean
		public HazelcastInstance getHazelcastInstance() {
			return Hazelcast.newHazelcastInstance();
		}
}
