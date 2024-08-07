package Exception;

//• W.A.J.P to create a custom exception if Customer withdrawamount which is greater than account
//  balance then program will show custom exception otherwise amountwill deduct from account balance.
//  Account balance is: 2000 Enter withdraw amount: 2500


class insufficientBalanceexception extends Exception{
	public insufficientBalanceexception(String message) 
	{
		super(message);
	}
}
class Account{
	private int balance;
	
	public Account(int balance) {
		this.balance=balance;
	}
	public void withdraw(int amount)throws insufficientBalanceexception{
		if(amount>balance) {
			throw new insufficientBalanceexception("sorry,insufficientBalance , you need more"+(amount-balance)+"RS.toperform");
			
			}
		else {
			balance-=amount;
			
			System.out.println("amount withdraw successfully . remaining balance:"+balance);
		}
	}
}

public class Q_007 
{
	public static void main(String[] args)
	{
		Account account = new Account(2000);
		int WithdrawAmount=2500;
	
		try {
			account.withdraw(WithdrawAmount);
		} catch (insufficientBalanceexception e) {
			System.out.println(e.getMessage());
		}
	}
}
