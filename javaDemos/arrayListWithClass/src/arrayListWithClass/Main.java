package arrayListWithClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer alper = new Customer(4,"Alp","D");
		customers.add(alper);
		
		customers.add(new Customer(1, "Alper" , "A"));
		customers.add(new Customer(2, "Efe" , "B"));
		customers.add(new Customer(3, "Dað" , "C"));
		
		//customers.remove(alper);
		
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}

	}

}
