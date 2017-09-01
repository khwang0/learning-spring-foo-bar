package org.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        Foo f = (Foo) SpringApplication.run(Application.class, args).getBean("foo");
        f.printFoo();
        f.printFoo();

    }

}

