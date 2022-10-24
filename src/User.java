public class User {

    private String firstName;
    private String lastName;

    private Card card;
    private Check check;

    private Transaction transaction;

    User(){}

    public User(String firstName, String lastName, String cardNUmber, String PIN, String checkNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = new Card(cardNUmber, PIN);
        this.check = new Check(checkNumber);
        this.transaction = new Transaction();
    }

    public Card getCard() {
        return card;
    }

    public String getCardNumber(Card card) {
        return card.getCardNumber();
    }

    public String getPIN(Card card) {
        return card.getPIN();
    }

    public Check getCheck() {
        return check;
    }

    public void setBalance(Check check, int sum){
       check.plusBalance(sum);
    }

    public double getBalance(Check check){
        return check.getBalance();
    }

    public Transaction getTransaction(){
        return transaction;
    }

    public void info(Transaction transaction, String massage){
        transaction.transactionInfo(massage);
    }

    public void getinfo(Transaction transaction){
        transaction.getInfo();
    }
}
