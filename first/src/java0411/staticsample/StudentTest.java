package java0411.staticsample;

public class StudentTest {
    public static void main(String[] args) {
        Student studentlee = new Student();
        studentlee.setStudentname("이순신");
        System.out.println(studentlee.serialnum);

        studentlee.serialnum++;

        Student studentHong = new Student();
        studentHong.setStudentname("홍길동");
        System.out.println(studentHong.serialnum);
        System.out.println(studentlee.serialnum);

    }
}
