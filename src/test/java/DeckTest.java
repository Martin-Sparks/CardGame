import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DeckTest {
    private Deck deck;
    private Card card1;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void hasArrayListOfCards(){ 
        assertEquals(0, deck.getCardsCount());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card1);
        assertEquals(1, deck.getCardsCount());
    }

    @Test
    public void canFillTheDeck(){
        deck.fill();
        assertEquals(52, deck.getCardsCount());
    }

    @Test
    public void canGetCards(){
        deck.fill();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canDealCard(){
        Card card = new Card(SuitType.HEARTS, RankType.TWO);
        deck.addCard(card);
        assertEquals(card, deck.deal());
        assertEquals(0, deck.getCardsCount());
    }

    @Test
    public void shuffleDeck(){
        deck.fill();
        Card card1 = deck.getCards().get(1);
        deck.shuffleDeck();
        Card card2 = deck.getCards().get(1);
//        System.out.println(card1.getSuit());
//        System.out.println(card1.getRank());
//        System.out.println(card2.getSuit());
//        System.out.println(card2.getRank());
        assertFalse(card1.getSuit() == card2.getSuit());
        assertFalse(card1.getRank() == card2.getRank());
    }
}
