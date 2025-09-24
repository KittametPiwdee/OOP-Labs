public class AccountTest {
  public static void main(String[] args) {
    Account a1 = new Account("Camen", 100);
    System.out.println("Account Name : "+a1.getName());
    System.out.println("Account Balance : "+a1.getBalance());

    
    a1.setName("Kamen");
    a1.deposit(1000);
    
    System.out.println("Account Name : "+a1.getName());
    System.out.println("Account Balance : "+a1.getBalance());
    
    //Test Balance & Deposit < 0
    System.out.println("================================================");

    Account a2 = new Account("Sorn",-50);

    System.out.println("Account Name : "+a2.getName());
    System.out.println("Account Balance : "+a2.getBalance());

    a1.deposit(-100);

    System.out.println("Account Name : "+a1.getName());
    System.out.println("Account Balance : "+a1.getBalance());
  }  
}
