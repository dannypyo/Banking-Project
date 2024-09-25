public class Main {
    public static void main(String[] args) {
        Savings jorgeSavings = new Savings("Jorge", "05/17/2000", 31293201, 1000, 1.14);
        jorgeSavings.useInterestRate();
        jorgeSavings.withdraw(200);
        System.out.println(jorgeSavings);
        Checking jorgeChecking = new Checking("Jorge", "05/17/2000", 3213923, 100000);
        System.out.println("\n" + jorgeChecking);
    }
}