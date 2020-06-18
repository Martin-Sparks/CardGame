public class Cards {
    private SuitType suit;
    private RankType rank;

    public Cards(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public RankType getRank(){
        return this.rank;
    }

    public int getValueFromRankEnum(){
        return this.rank.getValue();
    }
}
