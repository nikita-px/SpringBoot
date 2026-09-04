package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // BeanFactory ------------->
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj= (Dev) context.getBean("dev");

        System.out.println(obj.age); //---------> acess the default value of the age from the dev class 
        //obj.build();

        // now to create the Spring configuration ---------> just simply create the  folder of name resources
        // RC on the main
        // new ---> Directory---->name as the res
        // res----->RC --------> click on the file ------>  name it as the ----> spring.xml
        //where we have to write the some connfiguration here
        //for this configuration  ---> Every class which manage by the Spring are called as the ----> Bean
        // that thinks you have to define in the Spring.xml file



//        Now here you have to write the code for that bean factory
//
//                html tag are undestand by the browser
//                but in xml you can used your own tag



    }


}

// Spring.xml file 
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->


    <bean id="dev" class="org.example.Dev">
    </bean>

    <!--this is the class of the laptop  -->

    <bean id="laptop" class="org.example.Laptop">
    </bean>

</beans>

  //pom.xml file 

  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>mySpringBootApplication</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>

        <!-- Source: https://mvnrepository.com/artifact/org.springframework/spring-context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>7.0.8</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>

    <properties>
        <maven.compiler.source>25</maven.compiler.source>
        <maven.compiler.target>25</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>

  //Dev.java 

  package org.example;

public class Dev {


    int age;
    //constructor

    public Dev(){
        System.out.println("this is the constructor of the class Dev ");
    }

    //method
    public void build(){
        System.out.println("working project of the dev class ...");
    }
}


  
