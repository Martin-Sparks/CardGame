import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public int getCardsCount(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }
    
    public Card deal(){
        return this.cards.remove(0);
    }

    public void fill(){
        for ( SuitType suit: SuitType.values() ) {
            for ( RankType rank: RankType.values() ) {
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
//        System.out.println(this.cards);
    }
}
