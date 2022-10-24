public class Check {

    private double balance = 0;
    private String checkNumber;

    public Check(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void plusBalance(double balance) {
        this.balance += balance;
    }

    public void minusBalance(double balance) {
        this.balance -= balance;
    }
}
