package lesson10.exercise_1;
import java.util.*;
import java.util.stream.*;

public class Problem1 {
		

	//A list of Customers whose checking account balance is > 50, sorted by customer's last name
	public static List<Customer> specialAccounts(List<Account> accounts) {
		if(accounts == null || accounts.size() == 0) return null;
		return accounts.stream().filter(a -> a.getBalance() > 50)
				 .map((Account a) -> a.getCustomer())
	             .sorted(Comparator.comparing((Customer c) -> c.getLastName()))
	             .collect(Collectors.toList());
	}
	
	public static List<Customer> zeroAccounts(List<Account> accounts) {
		return accounts.stream().filter(a -> a.getBalance() == 0)
				 .map((Account a) -> a.getCustomer())
	             .sorted(Comparator.comparing((Customer c) -> c.getLastName()))
	             .collect(Collectors.toList());
				             
	}
}
