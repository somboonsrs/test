package com.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Application;
import com.em.service.ApplicationService;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private ApplicationService applicationService;

	@RequestMapping("/apps")
	public Iterable<Application> getAllApplication() {
		return applicationService.getAllApplication();
	}

	@RequestMapping(method=RequestMethod.POST,value="/apps/add") 
	public void addApplication(@RequestBody Application application){ 
		applicationService.addApplication(application); 
	 }
	
	@RequestMapping(method=RequestMethod.DELETE,value="/apps/del") 
	public void delApplication(@RequestBody Application application){ 
		applicationService.delApplication(application); 
	 }
	
	@RequestMapping(method=RequestMethod.PUT,value="/apps/update") 
	public void updateApplication(@RequestBody Application application){ 
		applicationService.updateApplication(application); 
	 }
	


}
