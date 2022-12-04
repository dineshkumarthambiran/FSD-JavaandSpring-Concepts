package org.NWSpringdemo.BeanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hostel implements InitializingBean,DisposableBean {

	String hosName;
	String location;
	@Override
	public String toString() {
		return "Hostel [hosName=" + hosName + ", location=" + location + "]";
	}
	public Hostel(String hosName, String location) {
		super();
		this.hosName = hosName;
		this.location = location;
	}
	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hostel destroyed");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hostel initiated");
	}
	
	
	
}
