package credits;

public class AccountCreditAmount {

    private double amount = 100.00;

    public boolean validateSubscription(double subscriptionPay) {
        if (amount - subscriptionPay >= 0.00) {
            System.out.println("Successfully subscribed");
            System.out.println("Your credit amount decreased to: " + (amount - subscriptionPay));
            amount -= subscriptionPay;
            return true;
        }
        System.out.println("Not enough credits. Required: " + subscriptionPay + ";\nCurrent: " + amount);
        return false;
    }
}
