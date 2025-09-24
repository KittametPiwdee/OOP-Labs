public class AccountList {
    private Account[] accounts;
    private int count;

    public AccountList(int length) {
        this.accounts = new Account[length];
        this.count = 0 ;
    }

    public boolean appendAccount(Account account) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                count++;
                return true;
            }
        }
        return false;
    }

    public Account getAccount(int idx) {
        if(idx < 0){
            System.out.println("Index is negative");
            return null;
        }
        if(idx >= count){
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
        return accounts[idx];
    }
}
