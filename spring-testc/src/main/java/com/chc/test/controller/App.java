package com.chc.test.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(CityService.class));
	}
}
