package JavaApplicationStructure;

// Classes are blueprint
public class Account {
//  Properties of the class
    private String owner;
    private double balance;
    private double minimumBalance;

//  Void means it's not returning anything
    public void deposit(double amount){
//  Implementation

    }

    public void withdraw(double amount){
//    Implementation
    }

    public double calculateCreditWorthiness(){
        return 100;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
