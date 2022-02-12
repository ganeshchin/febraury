package logicsnew.Account;

public class BankAccount {

	String name;
	int no;
	int phone;
	double balance;
	
	
	double withdraw(double required) {
		double ret=0;
	
		if(required<= balance) {
			ret=required;
			balance=balance-required;
		}
		return ret;
	}
	
	void deposit(double amount) {
		balance =balance+amount;
		return;
		}
		double getbalance(){
			return balance;
		}
	}
	

