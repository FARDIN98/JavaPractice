package OOP.lab.Files;
/*Homework: How to use buffer writer along with file writer  */
import java.io.*;
import java.util.Scanner;

public class FileLecture {
    public static void main(String[] args) throws IOException {
        File fileObj = new File("E:\\Java\\src\\OOP\\lab\\Files\\myfile.txt");
        //creating file
        /*try {
            if(fileObj.createNewFile()){     //returns boolean value
                System.out.println("File created successfully at: " + fileObj.getAbsolutePath());
            }  else {
                System.out.println("Problem creating file");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/


        //writing in file
        /* try{
            FileWriter writer = new FileWriter(fileObj);
            writer.write("This is a line in my file\n");
            writer.write("Writing more things in my file");
            writer.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }*/

        //print in file. Print writer automatically buffer
        /* try {
            PrintWriter print = new PrintWriter(fileObj);
            print.println("This is the first line in y file\n");
            print.println("Another line");
            print.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        } */

        //Read file
        /* try{
            Scanner freader = new Scanner(fileObj);
            int lineNo = 0;
//            String data1 =  freader.nextLine();  //reads the first line in my file
//            String data2 = freader.nextLine();   //reads the second line in my file
            while (freader.hasNextLine()){
                lineNo++;
                String data = freader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } */

        //using file reader
        /* try{
            FileReader reader = new FileReader(fileObj);
            int i = reader.read();
            while(i != -1){
                System.out.println((char)i);
                i = reader.read();
            }
        }catch(IOException ex){
            ex.printStackTrace();
        } */

        //using buffer reader to make file reader more efficient. Buffer locates in ram.
        try{
            FileReader reader =  new FileReader(fileObj);
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
