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
import com.em.repository.ProvinceRepository;
import com.em.repository.UsersRepository;
@Transactional 
@Service
public class ProvinceService {

	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Cacheable(value="provinceCache",key="#id")
	public List<Province> getDropdownProvince(String id) {
		System.out.println(".................. get  province ..........");
		List<Province> provinceList=provinceRepository.findByDropdownId(id);
		return provinceList;
	}

			
}
