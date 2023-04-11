package java0411.staticsample;

public class StudentNumber {
    public static int serialNam = 1000;
    public int studentId;
    private String studentName;
    private String address;

    public StudentNumber() {
        serialNam++;
        studentId = serialNam;
    }
    public  String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }

}
