package lr8;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Users\\Максим\\IdeaProjects\\lrs\\MyFile1.txt");
            out = new FileWriter("C:\\Users\\Максим\\IdeaProjects\\lrs\\MyFile2.txt");

            int oneByte;
            while((oneByte = in.read()) != -1){
                out.write((char) oneByte);
                System.out.print((char) oneByte);
            }
        }catch (IOException e){
            System.out.println("Ошибка!!!!");
        }finally {
            in.close();
            out.close();
        }
    }
}
