package OOP.theory.ExceptionHandling;

public class TestException {
    public static void main(String[] args) {
//        int d = 0, a;
//        a = 43/ d;
//        System.out.println("This will not be printed");
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at OOP.theory.ExceptionHandling.TestException.main(TestException.java:6)
         */
        int d=0;
        try{ //monitor a block of code
            int a = 43/ d;
            System.out.println("This will not be printed");
        //catch divide-by-zero-error
        }catch (ArithmeticException ex){
            System.out.println("Exception message " + ex.getMessage());
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
        /*Output: Exception message / by zero
                  Division by zero
                  After catch statement */
    }
}
