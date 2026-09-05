// Desktop.java -------->file 
package org.example;

public class Desktop implements Computer{
    //create the two method

    public Desktop (){
        System.out.println("this is the Desktop Constructor ......");
    }

    public void complie(){
        System.out.println("this the compile method of the Desktop.........");
    }
}

//Laptop.java --------> file 

package org.example;

public class Laptop implements Computer{

    //constructor

    public Laptop(){
        System.out.println("this is the constructor of the class Laptop ");
    }

    // method
public void compile(){
    System.out.println("this is the method of the Laptop Class .... ");
}
}


//Dev.java ----------> file 
package org.example;

public class Dev implements Computer {

  private Laptop laptop;
  private Computer com;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    //method
    public void build(){
        System.out.println("working project of the dev class ...");
        laptop.compile(); //-----------> calling the method of the laptop method
    }

    @Override
    public void compile() {

    }
}

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

        //System.out.println(obj.getAge()); //---------> acess the default value of the age from the dev class
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
//                html tag are understand by the browser
//                but in xml you can used your own tag

         // Now when you have to the inject some value with the help of the Spring Boot
        // Then you have to make changes in the spring.xml
        // in the class bean tag where you can define itt properties and then assign the value
        // it has to attribute which is the name and the value

    }
}

//Spring.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->


    <bean id="dev" class="org.example.Dev" autowire="byName"> // you can autowire the object by using the autowire attribute 
<!--        <property name="age" value="36"/>-->

        <property name="com" ref="com"/>


<!--        <property name="laptop" ref="lap"/>-->
<!--        here is the property of the reference is given-->

<!--        <constructor-arg value="50"/>-->
    </bean>

    <!--this is the class of the laptop  -->

    <bean id="lap" class="org.example.Laptop">
    </bean>

    <bean id="com" class="org.example.Computer">

    </bean>

</beans>



