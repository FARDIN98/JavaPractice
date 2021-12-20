package Java_Basic.Learning_Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {
        String[] names = {"Fardin", "Asif", "Shakin", "Riya"};

        for(String x : names){
            System.out.print(x + " ");
        }
        //Output: Fardin Asif Shakin Riya
    }
}
