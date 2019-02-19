package com.em.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Province;
import com.em.entity.Users;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, String>,JpaRepository<Province, String>{
		
}