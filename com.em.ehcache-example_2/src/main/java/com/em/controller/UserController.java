package com.em.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Users;
import com.em.service.UsersService;

@RequestMapping(value="/rest")
@RestController
public class UserController {
	
		@Autowired
		private UsersService usersService;
	
		@RequestMapping(value="/dropdown/{id}")
		public Optional<Users> getUserbyId(@PathVariable final Long id) throws InterruptedException{
		return usersService.getUserbyId(id);
	}
}
