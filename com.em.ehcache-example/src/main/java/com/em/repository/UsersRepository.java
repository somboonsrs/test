package com.em.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.em.entity.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long>,JpaRepository<Users, Long>{
}