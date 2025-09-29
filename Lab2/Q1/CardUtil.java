package Lab2.Q1;
public class CardUtil {
    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suit HIGHEST_SUITE = Suit.SPADES;

    public static boolean isHighestCard(Card c){
        if(c.getRank()==HIGHEST_RANK && c.getSuit()==HIGHEST_SUITE){
            return true;
        }else{
            return false;
        }
            
    }
    public static void printCard(Card c){
        System.out.println(c.getRank());
        System.out.println(c.getSuit());
    }
}
