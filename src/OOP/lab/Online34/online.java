package OOP.lab.Online34;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class online {
    public static void main(String[] args) {
        Person [] persons = new Person[10];
        int numberOfPersons = 0;
        File fileObj = new File("E:\\Java\\src\\OOP\\lab\\Online34\\students1.txt");
        try{
            Scanner reader = new Scanner(fileObj);
            while(reader.hasNextLine()) {
                String data1, data2, data3;
                data1 = reader.nextLine();
                data2 = reader.nextLine();
                data3 = reader.nextLine();

                Person person = new Person(data1, data2, data3);
                persons[numberOfPersons++]= person;
            }
            reader.close();
            int i = 0;
            while( i < 10){
                System.out.println(persons[i].getName());
                System.out.println(persons[i].getAge());
                System.out.println(persons[i].getCgpa());
                i++;
            }
        } catch(Exception ex){
                ex.printStackTrace();
            }
        }

        //ct3 finishes
        File std2 = new File("E:\\Java\\src\\OOP\\lab\\Online34\\students2.txt");
        File hons = new File("E:\\Java\\src\\OOP\\lab\\Online34\\honors.txt");

//        try{
//            if(hons.createNewFile()){
//                System.out.println("File created successfully at: " +hons.getAbsolutePath());
//            }
//            else{
//                System.out.println("Problems creating file");
//            }
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }

        //read file from student2 using file reader & buffer reader
//        try{
//            FileReader fread = new FileReader(std2);
//            BufferedReader bread = new BufferedReader(fread);
//            String line = bread.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = bread.readLine();
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
    }
//}

