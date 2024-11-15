package FILE_WRITE;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args){
            //throws IOException {
        String fileName = "write file.txt";

        try(FileWriter writer =  new FileWriter(fileName)){
            writer.write("package FILE_READER;\n" +
                    "\n" +
                    "import java.io.BufferedReader;\n" +
                    "import java.io.FileReader;\n" +
                    "import java.io.IOException;\n" +
                    "\n" +
                    "public class Reader {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        String filename = \"java file.txt\";\n" +
                    "\n" +
                    "//        try(FileReader reader = new FileReader(filename)){\n" +
                    "//            int read = 0 ;\n" +
                    "//\n" +
                    "//            do {\n" +
                    "//                read = reader.read();\n" +
                    "//                System.out.print((char) read);\n" +
                    "//            }while(read != -1);\n" +
                    "\n" +
                    "        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){\n" +
                    "            String line;\n" +
                    "            while ((line = reader.readLine()) != null) {\n" +
                    "                System.out.println(line);\n" +
                    "            }\n" +
                    "\n" +
                    "        }catch (IOException exception){\n" +
                    "            System.out.printf(\"exception %s\",exception.getMessage());\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n");
            for(int i = 0 ; i<1000 ; i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("file written successfully");
        }catch (IOException exception){
            System.out.printf("exception occurred %s\n",
                    exception.getMessage());
        }
    }
}
