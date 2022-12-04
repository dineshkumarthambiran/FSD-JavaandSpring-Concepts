package org.NWSpringdemo.BeanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class School {
	
	String schName;
	String location;
	public School(String schName, String location) {
		super();
		this.schName = schName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "School [schName=" + schName + ", location=" + location + "]";
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@PostConstruct
	
	public void initschool() {
		System.out.println("School initiated");
	}
	
	@PreDestroy
	
	public void destroyschool() {
		System.out.println("School destroyed");
	}

}
