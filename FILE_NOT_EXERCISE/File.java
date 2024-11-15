package FILE_NOT_EXERCISE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String filename = sc.nextLine();

        try (FileReader reader= new FileReader(filename)){
            int read ;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        }catch (FileNotFoundException exception){
            System.out.printf(" %s not found \n",filename);
        } catch(IOException exception){
            System.out.printf("exception occurred %s \n",exception.getMessage());
        }
    }
}
