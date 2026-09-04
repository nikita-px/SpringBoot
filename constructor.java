//Main.java

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

        System.out.println(obj.getAge()); //---------> acess the default value of the age from the dev class
    }
}

//Dev.java 

package org.example;

public class Dev {


    private int age=90; //assign the value here
    //constructor

    public Dev(){
        System.out.println("this is the constructor of the class Dev ");
    }

    public Dev(int age) { //here is the parameterized constructor are created 
        //and it value ia assign in the spring.xml file underthe attribute the constructor-arg
        this.age = age;
        System.out.println("age value by the constructor injection");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method
    public void build(){
        System.out.println("working project of the dev class ...");
    }
}

//Spring.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->


    <bean id="dev" class="org.example.Dev">
<!--        <property name="age" value="36"/>-->

        <constructor-arg value="50"/>
    </bean>

    <!--this is the class of the laptop  -->

    <bean id="laptop" class="org.example.Laptop">
    </bean>

</beans>


