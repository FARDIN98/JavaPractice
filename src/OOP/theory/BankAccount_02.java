package OOP.theory;

import java.util.Random;

public class BankAccount_02 {
    //Instance Variable
    public String name;
    public String id;
    public double balance;

    //Constructor with no perameter
//    public BankAccount(){
//        id = new Random().nextInt(99999) + "";
//        //name and balance will get default value
//    }

    //Constructor with perameter
    public BankAccount_02(String _name, String _id, double _balance){
        name = _name;
        id = _id;
        balance = _balance;
    }

    public static void main(String[] args) {
        BankAccount_02 ba = new BankAccount_02("Fardin", "011201131", 1000.15);
        System.out.println(ba.name);
        System.out.println(ba.id);
        System.out.println(ba.balance);
    }
}
