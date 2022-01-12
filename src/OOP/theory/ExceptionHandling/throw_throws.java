package OOP.theory.ExceptionHandling;

public class throw_throws {
    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }catch(Exception ex){
            System.out.println("Exception");
        }
    }
}
