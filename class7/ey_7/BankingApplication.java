package ey_7;

class Cutomer{
	int amount = 1000;
	
	
	public synchronized void withdraw(int amount) {
		System.out.println("User has come to withdraw amount" + amount);
		
		if(this.amount<amount) {
			System.out.println("Less balance, waiting to deposit... ");
			
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw Completed");
	}
	public synchronized void deposit(int amount) {
		System.out.println("User has come to deposit");
		this.amount+=amount;
		System.out.println("Deposit completed for amount"+ amount);
		notify();
	}
}
public class BankingApplication {
	public static void main(String[] args) {
		final Cutomer c1= new Cutomer();
		new Thread() {
			public void run() {
				c1.withdraw(15000);
				
			}
			
		}.start();
		new Thread() {
			public void run() {
				c1.deposit(10000);
				
			}
		}.start();
	}

}


