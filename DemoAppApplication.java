package com.example1.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; //work only when you create the object

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoAppApplication.class, args);

		Dev obj =context.getBean(Dev.class);

		obj.Build();
	}


}



// Laptop.java

package com.example1.demoApp;

import org.springframework.stereotype.Component;

@Component //which tell to the IOC to create the object of this class also
public class Laptop {
    public void compile(){
        System.out.println("this is the method of the Laptop class ");
    }
}

