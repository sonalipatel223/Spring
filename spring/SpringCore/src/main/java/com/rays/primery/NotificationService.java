package com.rays.primery;

public class NotificationService {
	
	private MessageService messageService;

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void sendNotification(String message) {
		messageService.sendMessage(message);
	}

}
