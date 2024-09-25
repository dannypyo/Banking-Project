public class Savings extends Account{
    private double interestRate;
    public Savings(String accountHolder, String dateOfBirth, int accountNumber, int balance, double interestRate){ // Constructor
        this.setAccountHolder(accountHolder);
        this.setDateOfBirth(dateOfBirth);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate() { // Get Interest Rate
        return interestRate;
    }
    public void setInterestRate(double interestRate) { // Set Interest Rate
        this.interestRate = interestRate;
    }
    public void useInterestRate() { // Performs Interest Rate
        this.setBalance((int)(getBalanceInCents() * interestRate));
    }
    public String toString() { // To String
        return ("Name: " + this.getAccountHolder() +
                "\nDate of Birth: " + this.getDateOfBirth() +
                "\nAccount Number: " + this.getAccountNumber() +
                "\nBalance: " + "$" + (double)this.getBalanceInCents()/100 +
                "\nInterest Rate: " + interestRate);
    }
}
