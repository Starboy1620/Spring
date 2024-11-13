package com.Darshan.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // To work with Spring Container we need to use Application Container 
		// which is subset off BeanFactory as we know Spring Container objects, configures and assembles their dependencies

        TCSCoders tcs = (TCSCoders) context.getBean("tcsCoders");
        tcs.code();  // for Singleton Scope here Container will by default create only one object everytime   
        
        TCSCoders tcs2 = (TCSCoders) context.getBean("tcsCoders");
        tcs2.code(); // for Prototype Scope as in that every time we call getBean() new object will created 
        
        
        
        tcs.getYearsOfExperience();
        
        tcs.code();
    }
}
