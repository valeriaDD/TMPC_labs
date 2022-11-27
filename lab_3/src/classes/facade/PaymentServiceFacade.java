package classes.facade;

import Interfaces.facade.PaymentService;
import Services.Bank.AccountManagerProxy;
import Services.Bank.AccountState;
import Services.Bank.Bank;

public class PaymentServiceFacade implements PaymentService {
    private int accountNr;
    AccountManagerProxy manager;
    Bank bank;


    public PaymentServiceFacade(int accountNr) {
        this.accountNr = accountNr;

        Bank bank = new Bank();
        AccountState manager = new AccountManagerProxy();
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    public void pay() {
        if (this.manager.hasSufficientCredit(this.accountNr)){
         bank.pay(this.accountNr);
        } else {
            System.out.println("No account found!");
        }
    }
}
