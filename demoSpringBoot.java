//HomeController.java 

package com.example_of_simple_web_app.demos_simple_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // which is used to help to provide  the service to navigate the content to the server
public class HomeController {
    @RequestMapping("/") // which is used to handel the http request
    public String greet(){
        return "hello ! Nikita ";
    }

    @RequestMapping("/about") // which can be execute when their is the--------> localhost:8081/about----> written in the url
    public String about(){
        return "we can Educate the people!!!!";
    }
}

//LoginController.java

package com.example_of_simple_web_app.demos_simple_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login") // which is execute automatically whe their is the ----> /login will be return in the url

    // Note :
    // That we dont need to tell the main class that when they have to execute which class
    // All this can be handle by the Front Controller -------> itslef 
    public String login(){
        return "This is the Login Page !!";
    }
}


//ProductController.java


package com.example_of_simple_web_app.demos_simple_web.controller;

import com.example_of_simple_web_app.demos_simple_web.model.Product;
import com.example_of_simple_web_app.demos_simple_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping
    public List <Product> getproduct(){
        return service.getProduct();
    }
}


//Product.java

package com.example_of_simple_web_app.demos_simple_web.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

//import lombok.Data;
//import org.springframework.stereotype.Component;
//
//@Data // which is used with the help of lombok dependency ----->
// 1.maven repository
// 2.search for --->lombok
// add dependency in pom.xml
// reload the file
@AllArgsConstructor
@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public Product() {
    }

    public Product(int prodId, int price, String prodName) {
        this.prodId = prodId;
        this.price = price;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}



//ProductService.java


package com.example_of_simple_web_app.demos_simple_web.service;

import com.example_of_simple_web_app.demos_simple_web.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> Products= Arrays.asList(
            new Product(101,"Iphone",900000),
            new Product(102,"Nokia", 80087));
    public List<Product> getProduct(){
        return Products;
    }
}


//DemosSimpleWebApplication.java

package com.example_of_simple_web_app.demos_simple_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosSimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosSimpleWebApplication.class, args);

		//1. Create the HomeControler.java file ===> @RestController at the top of the class ==>@RequestMapping at the top of method
		//2. Add some methods their
		//3. Create the LoginController.java file ===> Same as for the Login also
		//4. Having the function name as login
		//5. Create the ProductController.java
		//6. Create the another file Product.java
		//7. Now Go to maven repository ---> search for lombok ---> and add dependency ---> and reload
		//7. Which contain some variable --- such as productname, price , and product id ---> Add ---> @Data at the top of the class
		//8. Now Create the Another file name as the ProductService
		//9. Create the interface by RC in package add name under which you are creating the package
		//10. and move all the Controller file into pacakage
		//11. now same create the package ---> for the service ---> and move the service file into it
		//12. now create the model --> package ---> and move the Product into it
		//13. Add the content
		//14.
	}

}
