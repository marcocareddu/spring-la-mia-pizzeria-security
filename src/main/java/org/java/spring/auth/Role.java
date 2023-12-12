package org.java.spring.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Role {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	private String name;
	
	public Role(){}
	public Role(String name){
		setName(name);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
