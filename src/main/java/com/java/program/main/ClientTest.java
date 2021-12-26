package com.java.program.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.program.model.Address;
import com.java.program.model.Employee;
import com.java.program.model.Message;

public class ClientTest {
	public static void main(String[] args) {
		//BeanFactory
//        BeanFactory beanFactory = null;
//        try {
//        	Resource resource = new ClassPathResource("ApplicationContext.xml");
//			beanFactory = new XmlBeanFactory(resource);
//			Message message = (Message) beanFactory.getBean("message");
//			System.out.println("id   " + message.getMessageId() + "      message  " + message.getMessage());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		
		
		//ApplicationContext
		ApplicationContext applicationContext = null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			Employee employee = (Employee) applicationContext.getBean("employee");
			System.out.println(employee);
			
			Address address = employee.getAddress();
			System.out.println(address);
			
//			Address address = (Address) applicationContext.getBean("address");
//			System.out.println(address);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(applicationContext != null)
				((AbstractApplicationContext) applicationContext).close();
		}

	}

}
