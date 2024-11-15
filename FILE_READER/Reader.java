package FILE_READER;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String filename = "java file.txt";

//        try(FileReader reader = new FileReader(filename)){
//            int read = 0 ;
//
//            do {
//                read = reader.read();
//                System.out.print((char) read);
//            }while(read != -1);

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException exception){
            System.out.printf("exception %s",exception.getMessage());
        }
    }
}
