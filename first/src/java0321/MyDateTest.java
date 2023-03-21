package java0321;

public class MyDateTest {
    public static void main(String[] args) {
        MyData myData = new MyData();
        //myData.day = 31;
        myData.setDay(31);
        int day = myData.getDay();
        System.out.println(day);

    }

}
