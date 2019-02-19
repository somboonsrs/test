package com.em.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Dropdown;
import com.em.entity.Province;
import com.em.entity.Users;

@Repository
public interface DropdownRepository extends CrudRepository<Dropdown, String>,JpaRepository<Dropdown, String>{
		
	@Query(value="SELECT Province FROM Dropdown Dropdown, Province Province WHERE Dropdown.id = Province.dropddownId "
			+ "and Dropdown.id=?1", nativeQuery = true)
	public List<Province> findProvinceByDropdownId(String id);
}
