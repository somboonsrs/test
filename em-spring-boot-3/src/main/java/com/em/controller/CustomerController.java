package com.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Application;
import com.em.entity.Customer;
import com.em.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
		
	
	@Autowired 
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.POST,value="/apps/{id}/cust/add") 
	public void addCustomer(@RequestBody Customer customer,@PathVariable Long id){ 
		customerService.addCustomer(customer,id); 
	 }
	
	@RequestMapping("/apps/cust")
	public Iterable<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	
	/*
	 * @RequestMapping(method=RequestMethod.DELETE,value="/apps/{id}/cust/del/{id}")
	 * public void delCustomer(@RequestBody Application application){
	 * customerService.delCustomer(application); }
	 * 
	 * @RequestMapping(method=RequestMethod.PUT,value="/apps/{id}/cust/update/{id}")
	 * public void updateCustomer(@RequestBody Application application){
	 * customerService.updateCustomer(application); }
	 */
}
