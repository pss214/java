package java0620;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("./first/src/java0620/data/output.txt")){
            fos.write(65);
            fos.write(66);
            fos.write(67);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력 완료");
    }
}
