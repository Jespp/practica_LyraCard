
public class CashRegister {
	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	private MyDate today;
	
	public CashRegister(int day, int month, int year) {
		this.cashInRegister=1000.00;
		this.economicalSold=0;
		this.gourmetSold=0;
		this.today= new MyDate(day,month,year);
	}
	
	public double payEconomical(double cashGiven) {
		if(this.cashInRegister>=cashGiven) {
			this.cashInRegister+=2.5;
			this.economicalSold++;
			return cashGiven-2.5;
		}
		return cashGiven;	
	}
	
	public double payGourmet(double cashGiven) {
		if(this.cashInRegister>=cashGiven) {
			this.cashInRegister+=4.0;
			this.gourmetSold++;
			return cashGiven-4.0;
		}
		return cashGiven;	
	}
	
	public boolean payEconomical(LyraCard card) {
		if(card.pay(2.5)) {
			this.cashInRegister+=2.5;
			this.economicalSold++;
			return true;
		}
		return false;
	}
	
	public boolean payGourmet(LyraCard card) {
		if(card.pay(4)) {
			this.cashInRegister+=4.0;
			this.gourmetSold++;
			return true;
		}else {
		return false;
		}
	}
	
	public void loadMoneyToCard(LyraCard card, double sum) {
		if (card.getExpirationDate().dateComparison(today)) {
			card.loadMoney(sum);
			this.cashInRegister+=sum;
			System.out.println(sum+" loaded succefully");
		}else {
			System.out.println("The card is out of date");
		}
	}
	
	public String toString() {
		return "money in register: "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	}
	
	

}
