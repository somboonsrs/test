package com.em.comtroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.em.service.CacheService;
import com.hazelcast.core.HazelcastInstance;

@RestController
public class HomeController {
	
	@Autowired
	private CacheService cacheService;
	@Autowired
	private HazelcastInstance hazelcastInstance;
	
	@RequestMapping(method=RequestMethod.POST ,value="/em/{id}/{name}")
	public void add(@PathVariable final Integer id,@PathVariable final String name) {
		cacheService.add(id,name);
	}
	
	
	@RequestMapping(value="/em")
	public void get() {
		Map<Integer, String> map=hazelcastInstance.getMap("product");
		for(String s:map.values()) {
			System.out.println("Key : "+ s);
		}
	}
	
}
