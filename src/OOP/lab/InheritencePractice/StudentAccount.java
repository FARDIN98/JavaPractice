
package OOP.lab.InheritencePractice;

public class StudentAccount extends SavingsAccount{
    @Override
    public void printBalance(){
        System.out.println("You have a student savings account with a balance of: " + balance);
    }
}
