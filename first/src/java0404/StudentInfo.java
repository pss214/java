package java0404;

public class StudentInfo {
    int studentId;
   private String studentName;
   private String grade;
    public int getStudentId() {
        return this.studentId;
    }
    public void setStudentId(int studentId) {
       if(studentId < 10000){
           this.studentId = 10000;
       }else {
           this.studentId = studentId;
       }
   }
   public  String getStudentName(){
       return studentName;
   }
   public void setStudentName(String studentName) {

       this.studentName = studentName;
   }
}
