package OOP.theory.NestesClass;

//public class NestedClass {
//    private int data =30;
//    class inner {
//        void msg(){
//            System.out.println("data is: " + data);
//        }
//    }
//
//    public static void main(String[] args) {
//        NestedClass outer = new NestedClass();
//        NestedClass.inner in = outer.new inner();
//        in.msg();
//    }
//    //output: data is 30
//}

/*To access inner class member from outer class, you need
to access via object of inner class */
/*
class outerClass{
    public void show(){
        System.out.println("Show method");
        Inner inner = new Inner();
        inner.msg(); //can access private member of inner class
        System.out.println("End of show method");
    }

    class Inner{
        private void msg(){
            System.out.println("Inner Method");
        }
    }

    public static void main(String[] args) {
        outerClass out = new outerClass();
        out.show();
        outerClass.Inner in = out.new Inner();
        in.msg();
    }
    //Output: Show method
    //        Inner Method
    //        End of show method
    //        Inner Method
}  */

// inner class shadowing:
/*
class outer{
    int x = 10;
    class inner{
        int x = 20;
        public void show(int x){
            System.out.println("Parameter is: " + x);
            System.out.println("Inner variable: "+this.x);
            System.out.println("Outer variable: "+outer.this.x);
        }
    }

    public static void main(String[] args) {
        outer out = new outer();
        outer.inner in = out.new inner();
        in.show(30);
    }
    //output: Parameter is: 30
    //        Inner variable: 20
    //        Outer variable: 10
} */

//Anonymous class through concrete class
class a{
    public void show(){
        System.out.println("in A show");
    }
}

class AnonymousExample{
    public static void main(String[] args) {
        a obj = new a()
        {
            public void show()
            {
                System.out.println("i am the best");
            }
        };
        obj.show();
        //output: i am the best
    }
}












