package com.rays.ioc;

//Setter Injection
public class Order1 {
	
	public Payment payment;
	public Inventory inventory;
	
	
		public void setPayment(Payment payment) {
		this.payment = payment;
	}
		public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
		
		public void bookATicket(int items) {
			
			int price = 10;

			double totalAmount = items * price;

			double updatedBalance = payment.makePayment(totalAmount);

			int updatedStock = inventory.sold(items);
			
			System.out.println("Ticket are booked");
			System.out.println("Total Amount Paid: " + totalAmount);
			System.out.println("Remaining Balance: " + updatedBalance);
			System.out.println("Updated Stock: " + updatedStock); 
			
			



	
	
	
		}
}
