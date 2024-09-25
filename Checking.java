public class Checking extends Account{
    public Checking(String accountHolder, String dateOfBirth, int accountNumber, int balance){ // Constructor
        this.setAccountHolder(accountHolder);
        this.setDateOfBirth(dateOfBirth);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    public String toString() {
        return ("Name: " + this.getAccountHolder() +
                "\nDate of Birth: " + this.getDateOfBirth() +
                "\nAccount Number: " + this.getAccountNumber() +
                "\nBalance: " + "$" + (double)this.getBalanceInCents()/100);
    }
}
