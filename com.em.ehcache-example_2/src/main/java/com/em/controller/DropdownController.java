package com.em.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Province;
import com.em.service.ProvinceService;


@RequestMapping(value="/rest/dropdowns")
@RestController
public class DropdownController {
			
		@Autowired
		private ProvinceService provinceService;
		
			
		@RequestMapping(value="/province/{id}")
		public List<Province> getDropdownProvince(@PathVariable(name="id")String id){
			List<Province> provinceList=provinceService.getDropdownProvince(id);
			return provinceList;
		}
		
}
