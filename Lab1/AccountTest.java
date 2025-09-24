public class AccountTest {
  public static void main(String[] args) {
    Account a1 = new Account("Camen", 100);
    System.out.println(a1.getName());
    System.out.println(a1.getBalance());

    a1.setName("Kamen");
    a1.deposit(1000);

    System.out.println(a1.getName());
    System.out.println(a1.getBalance());
  }  
}
