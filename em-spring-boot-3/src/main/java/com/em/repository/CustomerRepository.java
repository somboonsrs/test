package com.em.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Application;
import com.em.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
