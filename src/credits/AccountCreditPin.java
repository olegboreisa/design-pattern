package credits;

public class AccountCreditPin {

    private final int pin = 1234;

    public int getPin() {
        return pin;
    }

    public boolean validateLogin(int enteredPin) {
        if (enteredPin == getPin()) {
            return true;
        }
        return false;
    }
}
