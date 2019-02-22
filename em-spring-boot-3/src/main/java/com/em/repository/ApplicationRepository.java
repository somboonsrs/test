package com.em.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long>{

}
