package worker;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import customer.WaitingCustomer;

public class CoffeeAttendant {
	
	private List<Customer> customerList;
	private List<String> completedDrink;
	
	public CoffeeAttendant(List<Customer> customerList) {
		this.customerList = customerList;
		this.completedDrink = new ArrayList<>();
	}
	
	
	public void takeOrder(Customer customer) {
		
		customerList.add(customer);
		System.out.println("coffee worker :- "+ customer.getName() + "  ordred " +
		      customer.getDrinkOrdered());
	}
	
	public void prepareDrink(String drinkToPrepare) {
		double timeTaken = Math.random() * 10;
		
		try {
			Thread.sleep((long)timeTaken*1000);
			completedDrink.add(drinkToPrepare);
		} catch (Exception e) {
			System.out.println("drink not ready...");
		}
	}
	
	public void callOutCompletedOrders() {
		for(String drink : completedDrink) {
			System.out.println("order :- " + drink);
			
			for(Customer customer : customerList) {
				customer.orderReady(drink);
			}
		}
	}

}
