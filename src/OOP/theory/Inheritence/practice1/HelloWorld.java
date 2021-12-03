package OOP.theory.Inheritence.practice1;

class Father{
    private int var1;
    Father(int var1){
        this.var1 = var1;
    }
    public void printVar1(){
        System.out.println(var1);
    }
}

class Son extends Father{
    Son(){
        super(10);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Son s = new Son();
        s.printVar1();
        //output: 10
    }
}
