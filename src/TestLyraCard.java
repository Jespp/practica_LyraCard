
public class TestLyraCard {

	public static void main(String[] args) {
		System.out.println("OUTPUT1\n");
		
		LyraCard cardOfPekka=new LyraCard(10.00,31,12,2030);
		System.out.println("money on the card "+cardOfPekka.balance());
		boolean succeeded=cardOfPekka.pay(8);
		System.out.println("money taken: " + succeeded );
		System.out.println("money on the card " + cardOfPekka.balance() );
		succeeded = cardOfPekka.pay(4);
		System.out.println("money taken: " + succeeded );
		System.out.println("money on the card " + cardOfPekka.balance() );
		
		System.out.println("\nOUTPUT2\n");
		
		
		Dish burger= new Dish("Cheese Burger");
		Dish chips= new Dish("Fries");
		Dish fruit= new Dish("Banana");
		Dish steak= new Dish("Roastbeef");
		Dish potatoes= new Dish("Smashed potatoes");
		Dish brownie= new Dish("Chocolate brownie");
		
		Menu economicalMenu= new Menu("Economical",2.5);
		economicalMenu.addDish(burger);
		economicalMenu.addDish(chips);
		economicalMenu.addDish(fruit);
		
		Menu gourmetMenu= new Menu("Gourmet",4.0);
		gourmetMenu.addDish(steak);
		gourmetMenu.addDish(potatoes);
		gourmetMenu.addDish(brownie);
		
		CashRegister unicafeExactum = new CashRegister(1,5,2030);
		double theChange = unicafeExactum.payWithCash(10, economicalMenu);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payWithCash(5, economicalMenu);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payWithCash(4, gourmetMenu);
		System.out.println("the change was " + theChange );
		System.out.println( unicafeExactum );
		
		System.out.println("\nOUTPUT3\n");
		
		CashRegister unicafeExactum2 = new CashRegister(1,5,2030);
		double theChange2 = unicafeExactum2.payWithCash(10, economicalMenu);
		System.out.println("the change was " + theChange2 );
		
		
		LyraCard cardOfJim = new LyraCard(7,1,1,2020);
		
		boolean succeeded2 = unicafeExactum2.payWithCard(cardOfJim, gourmetMenu);
		System.out.println("payment success: " + succeeded2);
		
		succeeded2 = unicafeExactum2.payWithCard(cardOfJim, gourmetMenu);
		System.out.println("payment success: " + succeeded2);
		
		succeeded2 = unicafeExactum2.payWithCard(cardOfJim, economicalMenu);
		System.out.println("payment success: " + succeeded2);
		System.out.println( unicafeExactum2 );
		
		
		
		System.out.println("\nOUTPUT4\n");
		
		CashRegister unicafeExactum3 = new CashRegister(5,2,2022);
		System.out.println( unicafeExactum3 );
		LyraCard cardOfJim2 = new LyraCard(2,5,2,2022);
		System.out.println("the card balance " + cardOfJim2.balance() + " euros");
		boolean succeeded3 = unicafeExactum3.payWithCard(cardOfJim2, gourmetMenu);
		System.out.println("payment success: " + succeeded3);
		unicafeExactum3.loadMoneyToCard(cardOfJim2, 100);
		succeeded3 = unicafeExactum3.payWithCard(cardOfJim2, gourmetMenu);
		System.out.println("payment success: " + succeeded3);
		System.out.println("the card balance " + cardOfJim2.balance() + " euros");
		System.out.println( unicafeExactum3 );
		
	}

}
