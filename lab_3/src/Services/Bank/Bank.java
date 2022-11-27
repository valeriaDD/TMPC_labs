package Services.Bank;

public class Bank {

    AccountManager accountManager = new AccountManager();

    public void pay(int accountNr) {
        if (accountManager.hasSufficientCredit(accountNr)) {
            System.out.println("Payment Successful!");
        } else {
            System.out.println("No sufficient credit!");
        }
    }
}
