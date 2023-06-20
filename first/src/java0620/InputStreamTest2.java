package java0620;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./first/src/java0620/data/input.txt")){
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
