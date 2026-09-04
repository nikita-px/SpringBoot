//Spring.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->


    <bean id="dev" class="org.example.Dev">
<!--        <property name="age" value="36"/>-->

        <property name="laptop" ref="lap"/>

<!--        <constructor-arg value="50"/>-->
    </bean>

    <!--this is the class of the laptop  -->

    <bean id="lap" class="org.example.Laptop">
    </bean>

</beans>

  //Dev.java

  

