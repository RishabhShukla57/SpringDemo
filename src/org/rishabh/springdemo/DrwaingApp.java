package org.rishabh.springdemo;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrwaingApp {


	public static void main(String [] args){
	
	//Triangle triangle  = new Triangle();
	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	ApplicationContext context =   new ClassPathXmlApplicationContext("spring.xml");
	Rectangle rectangle =  (Rectangle) context.getBean("rectangle");
	rectangle.draw();
	}
}