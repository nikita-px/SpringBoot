package com.example_of_simple_web_app.demos_simple_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosSimpleWebApplication {

    public static void main(String[] args) {
       SpringApplication.run(DemosSimpleWebApplication.class, args);
    }

}

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



