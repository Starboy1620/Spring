package com.Darshan.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // To work with Spring Container we need to use Application Container 
    								// which is subset off BeanFactory as we know Spring Container objects, configures and assembles their dependencies

    	Vehicle vehicle = (Vehicle) context.getBean("bike");
    	
    }
}
