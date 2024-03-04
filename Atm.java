import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initial_Balance) 
    {
        balance = initial_Balance;
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;            
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } 
        else 
        {
            System.out.println("insufficient balance or Invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance = balance + amount;            
            System.out.println("Deposit successful !!. Current balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(30000.0); // Initial balance of $1000

        while (true) 
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) 
            {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Have a nice day");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}