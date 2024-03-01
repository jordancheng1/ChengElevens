import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) {
        for (int i = 0; i < ranks.length; i++) {
            cards.add(new Card(ranks[i], suits[i], values[i]));
        }
        size = cards.size();
    }

    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return cards.get(size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void shuffle() {
        size = cards.size();
    }

    public int size() {
        return size;
    }

    public String toString() {
        return cards.toString();
    }

}
