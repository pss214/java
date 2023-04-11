package java0411.staticsample;

public class Student {
    public static int serialnum = 1000;
    public int studentId;
    public String studentname;
    public int grade;
    public String address;
    public String getStudentname(){
        return studentname;
    }
    public void setStudentname(String name){
        studentname = name;
    }


}
