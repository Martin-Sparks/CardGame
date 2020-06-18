import java.util.ArrayList;

public class Deck {
    private ArrayList<Cards> cards;

    public Deck(){
        this.cards = new ArrayList<Cards>();
    }

    public int getCardsCount(){
        return this.cards.size();
    }



}
