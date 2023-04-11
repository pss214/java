package java0411.staticsample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate(){
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH시mm분ss초"));
        return localDate;
    }
    public static String getCurrentMonth(){
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        return localDate;
    }
    public static String getCurrentDate(String pattern){
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
        return localDate;
    }

}
