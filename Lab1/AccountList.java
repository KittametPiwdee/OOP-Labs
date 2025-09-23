public class AccountList {
    private Account[] accounts;

    public AccountList(int length) {
        this.accounts = new Account[length];
    }

    public boolean appendAccount(Account a){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i]==null){
                accounts[i]=a;
                return true;
            }
        }
        return false;
    }

    public Account getAccount(int idx){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i]==accounts[idx]){
                
            }
        }
    }
}
