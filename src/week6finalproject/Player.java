package week6finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score ;
	private String name;
	
	public Player( ) {
		setScore(0) ;
		}
	public Player(String newName) {
		name = newName ;
		setScore(0) ;
	}
	public void describe () {
		System.out.printf("Player %s has this cards: \n" , name);
			for(Card card : hand) {
				card.describe();
			}
}
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	}
	

