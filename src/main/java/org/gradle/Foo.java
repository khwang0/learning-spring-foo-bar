package org.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //This annotation allows SpringApplcation to Scan and make it as a bean
public class Foo {
	
	@Autowired   // Without a setter, autowiring this from another Bean
	private Bar p;    
	
	public void printFoo() {
		System.out.println(p.getName());
	}
	
}