public class DeckTester {
    public static void main(String[] args) {
        String[] ranks = {"ace", "two", "seven", "four", "eight", "three", "two", "nine"};
        String[] suits = {"diamond" , "clover", "diamond", "spade", "heart", "heart", "spade", "clover"};
        int[] values = {1, 2, 7, 4, 8, 3, 2, 9};

        Deck deck = new Deck(ranks, suits, values);
        System.out.println(deck.deal());
        System.out.println(deck.size());
        System.out.println(deck.deal());
        System.out.println(deck.size());
        System.out.println(deck.isEmpty());
        deck.shuffle();
        System.out.println(deck.size());
        System.out.println(deck);
    }
}
