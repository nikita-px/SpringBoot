// To acess the private value from the other class to the main class 

// Fpr which you have to create the getter and setter for that 

//Dev.java ------> file 

package org.example;

public class Dev {


    int age =31; //assign the value here
    //constructor

    public Dev(){
        System.out.println("this is the constructor of the class Dev ");
    }

    //method
    public void build(){
        System.out.println("working project of the dev class ...");
    }
}

//main.java -----------> file 

public class Main {
    static void main() {

        // BeanFactory ------------->
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj= (Dev) context.getBean("dev");

        obj.setAge(87); //------------> you can set the value 

        System.out.println(obj.getAge()); // ------------> This Function is used to get the value 
    }
}
