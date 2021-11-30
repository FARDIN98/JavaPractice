
package OOP.lab.InheritencePractice;

public class SavingsAccount extends BankAccount{
    @Override
    public void printBalance(){
        System.out.println("You have a savings account with a balance of: " + balance);
    }
}
