
package bank;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Bank implements BankInterface {
	private List<Customer> customers;
	private List<Employee> employees;
	private double fundsOnHand;

	public Bank(double fundsOnHand) {
		// Code deleted
	}

	static String formatCurrency(double amount) {
		return NumberFormat.getCurrencyInstance().format(amount);
	}


	public int addCustomer(String name, String phone, boolean checking, boolean savings) {
		return 0;
	}


	public void addEmployee(String name, String phone, double salary) {

	}


	public AccountInterface getCheckingAccount(int customerId) {
		return null;
	}


	public AccountInterface getSavingsAccount(int customerId) {
		return null;
	}


	public void monthly() {

	}
}
