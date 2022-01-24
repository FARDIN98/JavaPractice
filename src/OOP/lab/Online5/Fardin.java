package OOP.lab.Online5;

import java.util.ArrayList;
import java.util.Scanner;

public class Fardin {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            String lnput = sc.nextLine();
            String[] space = lnput.trim().split(" ");

            String str = "";
            for (int j = 0; j < space.length; j++) {
                str = str.concat(space[j].charAt(0) + ".");
            }

            list.add(str);
            i++;
        }

        for (String st : list) {
            System.out.println(st);
        }
    }
}
