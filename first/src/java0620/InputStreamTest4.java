package java0620;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamTest4 {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("./first/src/java0620/data/reader.txt")){
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("end");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
