package com.em.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users  implements Serializable {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 565765430013818090L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		private String name;
		private String salary;
		public Users(String name, String salary) {
			super();

			this.name = name;
			this.salary = salary;
		}
		
		public Users() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}
