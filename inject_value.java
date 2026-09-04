//Main.java

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    static void main() {

        // BeanFactory ------------->
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj= (Dev) context.getBean("dev");
        
        System.out.println(obj.getAge());
    }
}

//Spring.xml

