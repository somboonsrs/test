package com.em.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Dropdown;

@Repository
public interface DropdownRepository extends JpaRepository<Dropdown, String>{
		
}
