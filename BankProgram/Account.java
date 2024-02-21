import java.util.Scanner;

public class Account {
	String name;
	int accountnumber;
	double balance;
	double amount;
	
	Scanner scan = new Scanner(System.in);

	Account(int acctnum, double balance, String name) {
		this.accountnumber = acctnum;
		this.balance = balance;
		this.name = name;
	}
	
	void setaccountname(String name) {
		this.name = name;
	}
	void setaccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	void setbalance(double balance) {
		this.balance = balance;
	}
	
	int getaccountnumber() {
		return accountnumber;
	}
	double getbalance() {
		return balance;
	}
	String getname() {
		return name;
	}
	
	public void deposit(double amount){
		
		balance+=amount;
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Account Name: " + name);
		System.out.println("New Balance: " + balance+" \n");
	}
	
	public void withdraw(double amount){
		balance-=amount;
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Account Name: " + name);
		System.out.println("New Balance: " + balance+" \n");
		
		
	}
	
	public void displayAccount() {
		
		System.out.println("------------------------------------");
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Account Name: " + name );
		System.out.println("Account Balance: " + balance);
		System.out.println("------------------------------------");

		
	}
	
	
}
