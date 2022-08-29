package credits;

public class AccountFacade {

    private int enteredPinCode;
    private double newsPaperCreditPrice;

    private AccountCreditPin accountCreditPin;
    private AccountCreditAmount accountCreditAmount;

    public AccountFacade(int enteredPinCode, double newsPaperCreditPrice) {
        this.enteredPinCode = enteredPinCode;
        this.newsPaperCreditPrice = newsPaperCreditPrice;
        this.accountCreditPin = new AccountCreditPin();
        this.accountCreditAmount = new AccountCreditAmount();
    }

//  Facade Design Pattern (Structural)
    public boolean subscribe() {
        if (accountCreditPin.validateLogin(enteredPinCode)) {
            return accountCreditAmount.validateSubscription(newsPaperCreditPrice);
        }
        System.out.println("Pin code of account was incorrect!");
        return false;
    }

    public int getEnteredPinCode() {
        return enteredPinCode;
    }

    public void setEnteredPinCode(int enteredPinCode) {
        this.enteredPinCode = enteredPinCode;
    }

    public AccountCreditPin getAccountCreditPin() {
        return accountCreditPin;
    }

    public void setAccountCreditPin(AccountCreditPin accountCreditPin) {
        this.accountCreditPin = accountCreditPin;
    }

    public AccountCreditAmount getAccountCreditAmount() {
        return accountCreditAmount;
    }

    public void setAccountCreditAmount(AccountCreditAmount accountCreditAmount) {
        this.accountCreditAmount = accountCreditAmount;
    }
}
