package com.em.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.em.entity.Users;
import com.em.repository.UsersRepository;
@Transactional 
@Service
public class UsersService {

	
	@Autowired
	private UsersRepository usersRepository;
	
	@Cacheable(value="usersCache",key="#id")
	public Optional<Users> getUserbyId(Long id) throws InterruptedException {
		System.out.println(".................. get  user : "+id);
		TimeUnit.SECONDS.sleep(10);
		return usersRepository.findById(id);
	}
			
}
