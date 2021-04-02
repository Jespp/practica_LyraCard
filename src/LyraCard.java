
public class LyraCard {
	private double balance;
	private MyDate expirationDate;
	
	public LyraCard(double balance, int day, int month, int year) {
		this.balance=balance;
		this.expirationDate= new MyDate(day, month, year);
	}
	
	public double balance() {
		return this.balance;
	}
	
	public MyDate getExpirationDate() {
		return this.expirationDate;
	}
	
	public void loadMoney(double amount) {
		this.balance+= amount;
	}
	
	public boolean pay(double amount) {
		if (this.balance>=amount) {
			this.balance-=amount;
			return true;
		}
		return false;
	}
	
}
