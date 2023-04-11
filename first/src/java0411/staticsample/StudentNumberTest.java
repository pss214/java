package java0411.staticsample;

public class StudentNumberTest {
    public static void main(String[] args) {
        StudentNumber studentLee = new StudentNumber();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNam);
        System.out.println(studentLee.getStudentName()+" 학번:"+studentLee.studentId);

        StudentNumber studentHong = new StudentNumber();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNam);
        System.out.println(studentHong.getStudentName()+" 학번:"+studentHong.studentId);
    }
}
