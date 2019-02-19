package com.em.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.em.entity.Dropdown;
import com.em.entity.Province;
import com.em.entity.Users;
import com.em.repository.DropdownRepository;
import com.em.repository.UsersRepository;
@Transactional 
@Service
public class DropdownService {

	
	@Autowired
	private DropdownRepository dropdownRepository;
	
	@Cacheable(value="dropdownCache",key="#id")
	public Optional<Dropdown> getDropdown(String id) throws InterruptedException {
		System.out.println(".................. get  dropdown id : "+id);
		TimeUnit.SECONDS.sleep(10);
		return dropdownRepository.findById(id);
	}
			
}
