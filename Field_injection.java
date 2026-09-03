//Laptop class 

package niki.com.example.demo11;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void Compile(){
        System.out.println("compling the Laptop method ");
    }
}


// Dev class 
package niki.com.example.demo11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Dev {

//    Laptop loptop; // laptop is by default null

//Laptop loptop=new Laptop(); // here is the object is created we dont want this to create the object automatically

  //so to connect the two class automatically we can used
  // |
  // |
  // Autowired annotation
  @Autowired //------------> it Automatically connect the Dev class to the Laptop class

  //And when you are doing this injection here is call field injection with the help of ------> @Autowired

  //
    private Laptop laptop;

    public void build(){

        //call the laptop method here

        laptop.Compile();
        System.out.println("this is the method of the Dev class");
    }
}
