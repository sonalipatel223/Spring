package com.rays.primery;

public class TwitterService implements MessageService{

	public void sendMessage(String message) {
		
		System.out.println("Sending twitter:" + message);
		
	}

}
