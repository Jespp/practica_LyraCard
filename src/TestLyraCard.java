
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
		
		CashRegister unicafeExactum = new CashRegister(1,5,2030);
		double theChange = unicafeExactum.payEconomical(10);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payEconomical(5);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payGourmet(4);
		System.out.println("the change was " + theChange );
		System.out.println( unicafeExactum );
		
		System.out.println("\nOUTPUT3\n");
		
		CashRegister unicafeExactum2 = new CashRegister(1,5,2022);
		double theChange2 = unicafeExactum2.payEconomical(10);
		System.out.println("the change was " + theChange2 );
		
		
		LyraCard cardOfJim = new LyraCard(7,1,1,2030);
		
		boolean succeeded2 = unicafeExactum2.payGourmet(cardOfJim);
		System.out.println("payment success: " + succeeded2);
		
		succeeded2 = unicafeExactum2.payGourmet(cardOfJim);
		System.out.println("payment success: " + succeeded2);
		
		succeeded2 = unicafeExactum2.payEconomical(cardOfJim);
		System.out.println("payment success: " + succeeded2);
		System.out.println( unicafeExactum2 );
		
		
		
		System.out.println("\nOUTPUT4\n");
		
		CashRegister unicafeExactum3 = new CashRegister(5,2,2022);
		System.out.println( unicafeExactum3 );
		LyraCard cardOfJim2 = new LyraCard(2,6,2,2022);
		System.out.println("the card balance " + cardOfJim2.balance() + " euros");
		boolean succeeded3 = unicafeExactum3.payGourmet(cardOfJim2);
		System.out.println("payment success: " + succeeded3);
		unicafeExactum3.loadMoneyToCard(cardOfJim2, 100);
		succeeded3 = unicafeExactum3.payGourmet(cardOfJim2);
		System.out.println("payment success: " + succeeded3);
		System.out.println("the card balance " + cardOfJim2.balance() + " euros");
		System.out.println( unicafeExactum3 );
		
	}

}
