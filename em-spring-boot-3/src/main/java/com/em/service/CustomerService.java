package com.em.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Application;
import com.em.entity.Customer;
import com.em.repository.CustomerRepository;

@Service
public class CustomerService {

	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	
	@Autowired
	private CustomerRepository customerRepository;
	public void addCustomer(Customer customer,Long id) {
		customerRepository.save(customer);
	}
	public Iterable<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	/*
	 * public void delCustomer(Application application) {
	 * customerRepository.deleteById(application.getId()); }
	 * 
	 * public void updateCustomer(Application application) {
	 * customerRepository.save(application); }
	 */

}
