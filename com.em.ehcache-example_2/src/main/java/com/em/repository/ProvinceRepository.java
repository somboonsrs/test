package com.em.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String>{
	public List<Province> findByDropdownId(String dropdownId);	
}