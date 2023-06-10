package Day2324252627;

public class Card {
    
    private colorEnum color;
    private rankEnum rank;

    public Card(colorEnum color, rankEnum rank) {
        this.color = color;
        this.rank = rank;
    }

    public void setColor(colorEnum color) {
        this.color = color;
    }
    public void setRank(rankEnum rank) {
        this.rank = rank;
    }

    public colorEnum getColor() {
        return color;
    }
    public rankEnum getRank() {
        return rank;
    }
}
