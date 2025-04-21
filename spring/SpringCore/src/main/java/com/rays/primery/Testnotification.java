package com.rays.primery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testnotification {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Primery.xml");
		NotificationService notificationService =(NotificationService) context.getBean("notification");
		notificationService.sendNotification("Hello,Spring!!!!");
	}

}
