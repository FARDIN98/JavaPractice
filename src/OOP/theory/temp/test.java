package OOP.theory.temp;

 class test {
    int a,b;
    test (int i, int j) {
        a = i;
        b=j;
    }
    test (int i) {
        b = i;
    }
    test incr() {
        test temp1 = new test (a+b+2);
        return temp1;
    }
    test incr2() {
        test temp2 = new test (b+7, 2);
        return temp2;
    }
    test incr3() {
        test temp3 = new test (b+7);
        return temp3;
    }
     public static void main(String[] args) {
         test ob1 = new test(3,5);
         test ob2, ob3;
         ob2 = ob1.incr() ;
         ob3 = ob2.incr2();
         System.out.println("ob2.b: " + ob2.b);
         System.out.println("First:= ob3.a: "+ob3.a);
         System.out.println("First:= ob3.b: "+ob3.b);
         ob3=ob1.incr();
         System.out.println("Second:= ob3.b: "+ob3.b);
         System.out.println("Second:= ob3.a: "+ob3.a);
         ob3=ob1.incr3();
         System.out.println("Second:= ob3.a: "+ob3.b);
         System.out.println("Addition: "+ (ob2.a + ob2.b+
                 10 + ob3.a + ob3.b + ob1.a) );
     }
 }

