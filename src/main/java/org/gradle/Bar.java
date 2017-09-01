package org.gradle;

import org.springframework.stereotype.Component;

@Component //Allow the component to be scanned.
public class Bar {
	private int counter = 0;
    public String getName() {
    	counter++;
        return "Bar" + counter;
    }
}
