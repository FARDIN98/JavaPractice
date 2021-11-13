package OOP;

public class Method_01 {

    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x+y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public void getInfo(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1 = logic(a1, b1);
        /*Calling a method
        * A method can be called by creating an object of the class
        * in which the method exists followed by the method call*/
        //Another way of calling method by creating object
        Method_01 obj = new Method_01();
//        git check
        obj.getInfo();
        System.out.println(c);
        System.out.println(c1);
    }
}
