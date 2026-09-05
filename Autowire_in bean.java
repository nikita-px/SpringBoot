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

