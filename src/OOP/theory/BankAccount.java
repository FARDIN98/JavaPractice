package OOP.theory;

public class BankAccount {
    //Instance variable
    public String name;
    public String id;
    public double balance;

    //Methods
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if(amount < balance){
            balance = balance - amount;
        }
    }

    public static void main(String[] args) {
        //Creating Object
        BankAccount acc1 = new BankAccount();
        acc1.name = "Fardin";
        acc1.id = "011201131";
        acc1.balance = 10001;
        System.out.println(acc1.name);
        System.out.println(acc1.id);
        System.out.println(acc1.balance);
    }
    /* Output: Fardin
               011201131
               10001.0 */
    //Output: null this is default value
            //null
            //0.0
}

