package ex02_Enum;

import java.util.Arrays;
import java.util.List;

public enum CreditCard {
	SHINHAN("신한", Arrays.asList("Mr.Life 카드", "Deep Dream 카드", "Deep Oil 카드")),
	KB("국민", Arrays.asList("톡톡D 카드", "티타늄 카드", "다담 카드")),
	NH("농협", Arrays.asList("올바른 FLEX카드", "테이크5카드", "NH올원 파이카드"));
	
	// Enterprise, cards
	private String enterprise;
	private List<String> cards;
	
	private CreditCard(String enterprise, List<String> cards) {
		this.enterprise = enterprise;
		this.cards = cards;
	}
	
	public List<String> getCards() {
		return cards;
	}
}
