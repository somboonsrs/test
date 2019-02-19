package com.em.entity;



public class MovieCatalog {
	
	
	private String name;
	private String desc;
	private int rating;
	
	public String getName() {
		return name;
	}
	
	public MovieCatalog() {
		
	}
	
	public MovieCatalog(String name, String desc, int ratting) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = ratting;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRatting() {
		return rating;
	}
	public void setRatting(int ratting) {
		this.rating = ratting;
	}


	@Override
	public String toString() {
		return "MovieCatalog [name=" + name + ", desc=" + desc + ", ratting=" + rating + "]";
	}
}
