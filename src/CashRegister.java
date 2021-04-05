
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
	
	public double payWithCash(double cashGiven, Menu menu) {
		if(menu.price<=cashGiven) {
			this.cashInRegister+=menu.price;
			if (menu.type.equals("Economical")) {
			this.economicalSold++;
			}else{ 
				this.gourmetSold++;
			}
			return cashGiven-menu.price;
		}
		return cashGiven;	
	}
	

	public boolean payWithCard(LyraCard card, Menu menu) {
		if(card.pay(menu.price)) {
			if (menu.type.equals("Economical")) {
				this.economicalSold++;
				}else{ 
					this.gourmetSold++;
				}
			return true;
		}
		return false;
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
