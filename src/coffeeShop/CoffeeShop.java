package coffeeShop;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import worker.CoffeeAttendant;

public class CoffeeShop {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer("vikas", "Mocha");
		Customer c = new Customer("Anitha", "chocolate");
		List<Customer> list = new ArrayList<>();
		list.add(customer);
		list.add(c);
		CoffeeAttendant worker = new CoffeeAttendant(list);
		
		worker.takeOrder(customer);
		worker.takeOrder(c);
		worker.prepareDrink(customer.getDrinkOrdered());
		worker.prepareDrink(c.getDrinkOrdered());
		worker.callOutCompletedOrders();
		
		

	}
}
