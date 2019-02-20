package com.em.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Province  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -224011888942733825L;
	@Id
	private String id;
	private String name;
	private String dropdownId;
	
	public Province() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Province(String id, String name,String dropdownId) {
		super();
		this.id = id;
		this.name = name;
		this.dropdownId=dropdownId;
	}
	

	public String getDropdownId() {
		return dropdownId;
	}

	@Override
	public String toString() {
		return "Province [id=" + id + ", name=" + name + ", dropdownId=" + dropdownId + "]";
	}

	public void setDropdownId(String dropdownId) {
		this.dropdownId = dropdownId;
	}
}
