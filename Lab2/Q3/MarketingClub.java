package Lab2.Q3;

public class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String c,int m,int b){
        super(c, m);
        this.budget = b;
    }

    public boolean useBudget(int b){
        if(this.budget - b >= 0){
            this.budget -= b;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int determineBudget(){
        if(this.budget > 1000){
            return 0;
        }else{
            return super.determineBudget();
        }
    }
}
