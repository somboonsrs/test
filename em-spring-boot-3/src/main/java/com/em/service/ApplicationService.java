package com.em.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Application;
import com.em.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;
	
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	
	public Iterable<Application> getAllApplication() {
		return  applicationRepository.findAll();
	}

	public void addApplication(Application application) {
		application.setCreatedDate(timeStamp);
		applicationRepository.save(application);
	}

	public void delApplication(Application application) {
		applicationRepository.deleteById(application.getId());	
	}
	
	public void updateApplication(Application application) {
		applicationRepository.save(application);	
	}

	
			
}
