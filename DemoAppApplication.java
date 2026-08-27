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

// Dev.class
package com.example1.demoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Dev {
@Autowired  //Dev object is dependent on the laptop then autowire help it to connected with the @Autowired Annotation ...
    private Laptop laptop;
    public void Build(){
        laptop.compile();
        System.out.println("this is the method of dev class");
    }
}

