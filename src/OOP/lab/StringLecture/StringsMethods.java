package OOP.lab.StringLecture;

public class StringsMethods {
    public static void main(String[] args) {
        String a = "  Hello   ";
        String b = "hello";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.concat(b));
        char c = 'w';
        System.out.println("I won't do it");
        //to prevent single quote to be a special meaning we use '
        System.out.println("This class is so \"good\"!");
        c = a.charAt(3);
        System.out.println(c); //output: l
        System.out.println(a.contains("ell"));  //true
        System.out.println(a.startsWith("He")); //true
        System.out.println(a.endsWith("o"));    //true

        if (a.equalsIgnoreCase(b)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equal");
        }   //output: equals

        System.out.println(a.indexOf("ll"));  //output: 2

        String d = a.replace("ell", "ipp");
        System.out.println(d);  //Hippo

        //use trim() function to ignore whitespace
        String e = a.trim();
        System.out.println(e);  //output: Hello *no space printed*

        String f = "   ";
        //first we used trim() to ignore whitespace. after that we isEmpty() boolean method to check whether its true or not
        System.out.println(f.trim().isEmpty());

        String g = "Fardin, 3.58, 011201131";
        String[] arr = new String[3];
        arr = g.split(", ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        /*output: Fardin
                  3.58
                  011201131 */

    }
}
