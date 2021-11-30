
package OOP.lab.InheritencePractice;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount normalAccount = new BankAccount();
        normalAccount.addMoney(500);
        normalAccount.printBalance();
        
        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.addMoney(200);
        savingsAccount.printBalance();
        
        BankAccount studentAccount = new StudentAccount();
        studentAccount.addMoney(300);
        studentAccount.printBalance();
    }
}
