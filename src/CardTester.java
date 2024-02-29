/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card aceDia = new Card("Ace", "Diamonds", 1);
        Card threeDia = new Card("Three", "Diamonds", 3);
        Card twoSpades = new Card("Two", "Spades", 2);
        System.out.println(aceDia);
        System.out.println(threeDia);
        System.out.println(twoSpades);
    }
}