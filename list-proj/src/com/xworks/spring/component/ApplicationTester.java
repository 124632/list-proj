package com.xworks.spring.component;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTester {
	public static void main(String[] args) {
		String xmlFile="resource/Spring.xml";
		
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFile);
		
		JavaArrayList refOfList=container.getBean(JavaArrayList.class);
		
		JavaMap refOfMap=container.getBean(JavaMap.class);
	}

}
