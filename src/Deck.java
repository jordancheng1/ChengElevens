public class Deck {
    private Card[] cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) {
        
    }

    public Card deal() {
        return cards[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void shuffle() {

    }

    public int size() {
        return size;
    }

    public String toString() {

    }

}
