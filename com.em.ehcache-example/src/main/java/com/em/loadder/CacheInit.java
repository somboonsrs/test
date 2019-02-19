package com.em.loadder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Component;

import com.em.entity.Dropdown;
import com.em.entity.Province;
import com.em.entity.Users;
import com.em.repository.DropdownRepository;
import com.em.repository.ProvinceRepository;
import com.em.repository.UsersRepository;

@Component
public class CacheInit implements  CommandLineRunner {

	
	@Autowired
	private EhCacheCacheManager ehCacheCacheManager;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private DropdownRepository dropdownRepository;
	
	@Autowired
	private ProvinceRepository provinceRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(".................. cache users data is started.....");
	     Iterable<Users> userList = usersRepository.findAll();
	     userList.forEach(Users -> ehCacheCacheManager.getCache("usersCache").put(Users.getId(), Users));
	        
		System.out.println(".................. cache province data is started.....");
		Iterable<Province> provinceList = provinceRepository.findAll();
		provinceList.forEach(Province -> ehCacheCacheManager.getCache("provinceCache").put(Province.getId(), Province));
		        
		System.out.println(".................. cache users dropdown is started.....");
		Iterable<Dropdown> dropdownList = dropdownRepository.findAll();
		dropdownList.forEach(Dropdown -> ehCacheCacheManager.getCache("dropdownCache").put(Dropdown.getId(), Dropdown));
		
	}

}
