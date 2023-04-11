package java0411.staticsample;

public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();
        studentHide.setStudentId(1111111);
        studentHide.setStudentName("박성수");
        studentHide.setStudentDepart("인공지능");
        studentHide.setStudentAddress("경기 과천시 과천동");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());

        StudentHide studentHide2 = new StudentHide();
        studentHide2.setStudentName("이순신");

        System.out.println(studentHide2.toString());
    }
}
