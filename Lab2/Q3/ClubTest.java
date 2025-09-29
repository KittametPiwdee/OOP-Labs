package Lab2.Q3;

public class ClubTest {
    public static void main(String[] args) {
        SportsClub sc1 = new SportsClub("Tennis", 10);
        System.out.println("Club Name : "+sc1.getName());
        System.out.println("Club minNumber : "+sc1.minNumMember);

        sc1.changeName("Badminton");
        sc1.addMember(5);

        System.out.println("---------After ChangeName & addMember---------------");
        System.out.println("Club Name : "+sc1.getName());
        System.out.println("Club numMember : "+sc1.numMember);
        System.out.println("Club Budget : "+sc1.determineBudget());
        sc1.advertise();

        System.out.println("=====================================================");
        MarketingClub mc1 = new MarketingClub("MarketingClub",8,2000);
        System.out.println("Club Name : "+mc1.getName());
        System.out.println("Club minMember : "+mc1.minNumMember);
        
        mc1.changeName("MarketingGroup");
        mc1.addMember(2);
        
        System.out.println("---------After ChangeName & addMember---------------");
        System.out.println("Club Name : "+mc1.getName());
        System.out.println("Club numMember : "+mc1.numMember);
        System.out.println("useBudget(1900) : "+mc1.useBudget(1900));
        System.out.println("Club Budget : "+mc1.determineBudget());
        mc1.advertise();

        System.out.println("=====================================================");
        MarketingClub mc2 = new MarketingClub("MarketingClub",10,800);
        System.out.println("Club Name : "+mc2.getName());
        System.out.println("Club minMember : "+mc2.minNumMember);
        
        mc2.changeName("MarketingGroup");
        mc2.addMember(3);
        
        System.out.println("---------After ChangeName & addMember---------------");
        System.out.println("Club Name : "+mc2.getName());
        System.out.println("Club numMember : "+mc2.numMember);
        System.out.println("useBudget(1000) : "+mc2.useBudget(1000));
        System.out.println("Club Budget : "+mc2.determineBudget());
        mc2.advertise();
        System.out.println("=====================================================");
    }
}
