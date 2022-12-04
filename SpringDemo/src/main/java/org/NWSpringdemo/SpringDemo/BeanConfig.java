package org.NWSpringdemo.SpringDemo;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
	
	@Bean
	
	public Car getcarbean() {
		return new Car("volvo",2000,"black");
	}
	

}
