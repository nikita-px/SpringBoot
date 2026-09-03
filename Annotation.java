package niki.com.example.demo11;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// Now both the Laptop and the Desktop class having the same interface having the same method
//to avoid this we can used the another annotation
@Component
@Primary // which mostly prefer the and the the important to the this class only 
@Qualifier("laptop") //otherwise you can also used the @Qualifier annotation and in which you can mentioned the 
//name of the class which you wanted to give most important properties ...

public class Laptop implements Computer {
    public void compile(){
        System.out.println("compling the Laptop method ");
    }
}


//Desktop.java

package niki.com.example.demo11;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile()
    {
        System.out.println("compling the Laptop method with desktop ......");
    }
}
