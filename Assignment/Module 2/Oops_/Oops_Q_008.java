package Oops_;

// • Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//   $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are 
//   subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//   method by creating an object of each of the three classes.


abstract class bank
{
	abstract void getbalance();
	
}
class BankA extends bank 
{ 
	private int balance=100;
	//@override
	void getbalance()
	{
		System.out.println("balance in bank A...$"+balance);
	}
}

class BankB extends bank
{
	private int balance=150;
	//@override
	void getbalance()
	{
		System.out.println("balance in bank B...$"+balance);
	}
}
class BankC extends bank
{
	private int balance=200;
	//@override
	void getbalance()
	{
		System.out.println("balance in bank C...$"+balance);
	}
}
public class Oops_Q_008 
{
	public static void main(String[] args)
	{
		bank BankA = new BankA();
		bank BankB = new BankB();
		bank BankC = new BankC();
		BankA.getbalance();
		BankB.getbalance();
		BankC.getbalance();
	}
}
