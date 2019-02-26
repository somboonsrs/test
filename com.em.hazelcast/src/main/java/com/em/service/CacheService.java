package com.em.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;

@Service
public class CacheService {

	
	@Autowired
	private HazelcastInstance hazelcastInstance;
	
	
	@Cacheable(value="product",key="#id")
	public void add(Integer id, String name) {	
		Map<Integer,String> mapProduct=hazelcastInstance.getMap("product");
		mapProduct.put(id, name);
		mapProduct.put(id+1, name+"test");
		System.out.println("size : "+mapProduct.size());
	}

}
