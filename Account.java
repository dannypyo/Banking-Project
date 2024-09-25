abstract class Account { //Abstract blueprint for other accounts (Parent Class)
    private int accountNumber;
    private String dateOfBirth;
    private int balance;
    private String accountHolder;
    public void withdraw(int withdrawInCents) { // Withdraw
        this.balance -= withdrawInCents;
    }
    public void deposit(int depositInCents) { // Deposit
        this.balance += depositInCents;
    }
    public int getAccountNumber() { // Get Account Number
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) { // Set Account Number
        this.accountNumber = accountNumber;
    }
    public int getBalanceInCents() { // Get Balance
        return balance;
    }
    public void setBalance(int balanceInCents) { // Set Balance
        this.balance = balanceInCents;
    }
    public String getAccountHolder() { // Get Account Holder
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) { // Set Account Holder
        this.accountHolder = accountHolder;
    }
    public void setDateOfBirth(String dateOfBirth) { // Set Date of Birth
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() { // Get Date of Birth
        return dateOfBirth;
    }
}
