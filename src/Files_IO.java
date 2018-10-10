import java.io.*;
import java.util.Scanner;

public class Files_IO {
    public static void main(String args[]){
            File file = new File("C:\\Users\\vmirzac\\Desktop\\test.txt");

            String pathname;
            File file2 = new File("C:\\Users\\vmirzac\\Desktop\\Hello1.txt");
            try {


                PrintWriter output = new PrintWriter(file);
                output.println("Victor");
                output.println(32);
                output.close();
                file.getName();
                System.out.println("public String getName() : " + file);
                file.getParent();
                System.out.println("public String getParent() : " + file);
                file.getParentFile();
                System.out.println("public String getParentFile() : " + file);
                file.getPath();
                System.out.println("public String getPath() : " + file);
                file.isAbsolute();
                file.canRead();
               file2.createNewFile();
               FileWriter writer = new FileWriter(file2);
               writer.write("This is an example of mine");
               writer.flush();
               writer.close();

               //Create a file Reader object
                FileReader fr = new FileReader(file2);
                char []a = new char[50];
                fr.read(a); //reads the content of the array

                for(char c : a){
                    System.out.print(c);
                    fr.close();
                }




                boolean exists = file.exists();
                System.out.println(exists);

                System.out.println(file);
            }catch (IOException ex){
                System.out.println(ex);
            }
         try {
             Scanner input = new Scanner(file);
             String name = input.nextLine();
             int age = input.nextInt();

             System.out.printf(name, age);

         }catch (FileNotFoundException ex){
             System.out.println(ex);
         }


    }}

