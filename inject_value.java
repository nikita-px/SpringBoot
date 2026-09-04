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

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!-- bean definitions here -->
    <bean id="dev" class="org.example.Dev">
        <property name="age" value="36"/>  // where is the property is define here 
    </bean>
    <!--this is the class of the laptop  -->
    <bean id="laptop" class="org.example.Laptop">
    </bean>
</beans>


