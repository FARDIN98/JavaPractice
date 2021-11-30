package OOP.lab.InheritencePractice;

public class BankAccount {
    public double balance;

    public BankAccount(){
        this.balance = 0;
    }

    public void printBalance(){
        System.out.println("You have a normal account with a balance of: " + balance);
    }


}
