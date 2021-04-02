import java.util.ArrayList;

public class Person {
	private String name;
	private ArrayList<LyraCard> cards;
	
	public Person(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<LyraCard> getCards() {
		return cards;
	}

	public void addCard(LyraCard card) {
		this.cards.add(card);
	}
	

}
