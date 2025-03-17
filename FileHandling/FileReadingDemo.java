package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingDemo {

    public static void main(String[] args) {
        try{
            File file=new File("../../Desktop/iam.txt");
            FileWriter writer=new FileWriter(file,true);
            writer.write("Hello i am appensdsddssdded\n");
            writer.close();
            System.out.println("appended successfully");
            Scanner sc=new Scanner(file);
            while (file.canExecute()){
                String data=sc.nextLine();
                System.out.println(data);
            }

        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
