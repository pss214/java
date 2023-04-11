package java0411.staticsample;

public class StudentHide {
    private int studentId;
    private String studentName;
    private String studentDepart;
    private String studentAddress;
    private String studentTelNo;
    private String studentMobile;

    public StudentHide() {

    }

    public String getStudentTelNo() {
        return studentTelNo;
    }

    public void setStudentTelNo(String studentTelNo) {
        this.studentTelNo = studentTelNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepart() {
        return studentDepart;
    }

    public void setStudentDepart(String studentDepart) {
        this.studentDepart = studentDepart;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }
    @Override
    public String toString() {
        return "StudentHide{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepart='" + studentDepart + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
