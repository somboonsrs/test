package com.em.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dropdown  implements Serializable  {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 5516374157272915585L;
		@Id
		private String id;
		private String description;
		
		public Dropdown() {
			
		}
				
		public String getId() {
			return id;
		}
		
		
		public void setId(String id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		@Override
		public String toString() {
			return "Dropdown [id=" + id + ", description=" + description + "]";
		}


		public Dropdown(String id, String description) {
			super();
			this.id = id;
			this.description = description;
		}
}
