import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasArrayListOfCards(){
          assertEquals(0, deck.getCardsCount());
    }


//    @Test
//    public void canAddCard(){
//
//    }
}
