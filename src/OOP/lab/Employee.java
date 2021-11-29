/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
        Name        Year of joining        Address
        Robert            1994                64C- WallsStreat
        Sam                2000                68D- WallsStreat
        John                1999                26B- WallsStreat*/

package OOP.lab;
import java.util.Scanner;
class Employee {

    String name,address;

    int yoj;


    public void getInfo(String name, int yoj, String address)

    {

        this.name = name;

        this.yoj = yoj;

        this.address = address;

    }

    public void printInfo()

    {

        System.out.println(name  + "\t\t"  + "\t\t" + yoj + "\t\t\t" +address);

    }



    public static void main(String[] args){

        String [] name = new String[3];

        int [] yoj = new int[3];

        String [] address = new String[3];



        for (int i = 0; i <3; i++)

        {

            System.out.println("\n---Enter the " +(i+1)+"st Employee Information: ---");

            Scanner sc = new Scanner(System.in);



            System.out.print("Enter the name of Employee: ");
            sc.useDelimiter("\n");

            name[i]=sc.next();

            System.out.print("Enter Year of Joining: ");

            yoj[i]=sc.nextInt();

            System.out.print("Enter Address: ");
            sc.useDelimiter("\n");

            address[i]=sc.next();

        }



        Employee em1 = new Employee();

        em1.getInfo(name[0], yoj[0], address[0]);



        Employee em2 = new Employee();

        em2.getInfo(name[1], yoj[1], address[1]);



        Employee em3 = new Employee();

        em3.getInfo(name[2], yoj[2], address[2]);



        System.out.println("Name \t\tYear Of Joining \t\tAddress");

        em1.printInfo();

        em2.printInfo();

        em3.printInfo();


    }

}