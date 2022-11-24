public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    //assign values to the elements
// String[] suits = new String[4];
// suits[0] = "Clubs";
// suits[1] = "Diamonds";
// suits[2] = "Hearts";
// suits[3] = "Spades";

/* alt method to create an array and initialize elements at the same time
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
Use suit and rank to create a string */

    public String toString() {
        String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

        String s = ranks[card.rank] + " of " + suits[card.suit];
        return s;

        Card card = new Card(11, 1);
        System.out.println(card);
    }
}
