package com.em.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Dropdown;
import com.em.entity.Province;
import com.em.entity.Users;
import com.em.service.DropdownService;
import com.em.service.ProvinceService;
import com.em.service.UsersService;

@RequestMapping(value="/rest")
@RestController
public class DropdownController {
	
		@Autowired
		private DropdownService dropdownService;
		
		@Autowired
		private ProvinceService provinceService;
		
		
	
		@RequestMapping(value="/dropdowns/{id}")
		public Optional<Dropdown> getDropdown(@PathVariable final String id) throws InterruptedException{
		return dropdownService.getDropdown(id);
		}
		
		@RequestMapping(value="/dropdowns/province/{id}")
		public List<Province> getProvinceList(@PathVariable String id){
		return provinceService.getAllProvince(id);
		}
		
}
