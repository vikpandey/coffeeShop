package customer;

public class Customer implements WaitingCustomer {

	private String name;
	private String drinkOrdered;
	
	public Customer(String name, String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}

	@Override
	public void orderReady(String preparedDrink) {
		if(drinkOrdered.equals(preparedDrink)) {
			exitStore();
		}
	}
	
	private void exitStore() {
		System.out.println("got my ordered drink :- "+ name + ":- " + drinkOrdered);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setDrinkOrdered(String drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}

}
