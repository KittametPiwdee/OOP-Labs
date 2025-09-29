package Lab2.Q1;

public class CardUtilTest {
    public static void main(String[] args) {
        Card c = new Card(Rank.ACE,Suit.SPADES);
        System.out.println(CardUtil.isHighestCard(c));
        CardUtil.printCard(c);
        
        System.out.println();
        
        Card d = new Card(Rank.KING, Suit.HEARTS);
        System.out.println(CardUtil.isHighestCard(d));
        CardUtil.printCard(d);
    }
}
