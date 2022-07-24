public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double value = 2.60;
        this.balance -= this.balance - value >= 0 ? value : 0;
    }

    public void eatHeartily() {
        double value = 4.60;
        this.balance -= this.balance - value >= 0 ? value : 0;
    }

    public void addMoney(double amount) {
        if(amount < 0) {
            return;
        }
        if(this.balance + amount > 150) {
            this.balance = 150;
            return;
        }
        this.balance += amount;
    }
}
