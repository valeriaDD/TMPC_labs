package Services.Bank;

public class AccountManagerProxy implements AccountState{
    @Override
    public boolean hasSufficientCredit(int accountNumber) {
        // Processing ...
        return true;
    }
}
