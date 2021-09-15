package req_4;
public class Enrolment {
    private Student student;
    private Course course;
    private int attendanceMark;
    private float midtermMark;
    private float finalMark;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAttendanceMark() {
        return attendanceMark;
    }

    public void setAttendanceMark(int attendanceMark) {
        this.attendanceMark = attendanceMark;
    }

    public float getMidtermMark() {
        return midtermMark;
    }

    public Enrolment(Student student, Course course, int attendanceMark, float midtermMark, float finalMark) {
        this.student = student;
        this.course = course;
        this.attendanceMark = attendanceMark;
        this.midtermMark = midtermMark;
        this.finalMark = finalMark;
    }

    public Enrolment() {
    }

    public void setMidtermMark(float midtermMark) {
        this.midtermMark = midtermMark;
    }

    public float getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(float finalMark) {
        this.finalMark = finalMark;
    }

    public static void main(String[] args) {
       Student student1 =new Student("01","Andrew Garfield");
       Student student2 =new Student("02","Tobey Maguire");
       Student student3 =new Student("03","Tom Holland");
       Course sad= new Course("System Analysis and Design","SAD");
       Course wpr= new Course("Web Programming ","WPR");
       Course se1= new Course("SE1","Software Engineering 1");
       Enrolment enrolment1= new Enrolment(student1,sad,8,60,55);
       Enrolment enrolment2= new Enrolment(student2,wpr,6,90,80);
       Enrolment enrolment3= new Enrolment(student3,se1,6,40,90);
       printReport(enrolment1);
       printReport(enrolment2);
       printReport(enrolment3);

    }
    public static void printReport(Enrolment enrolment){
        System.out.println("Student "+enrolment.getStudent().getStudentName()+" whose id is "+enrolment.getStudent().getStudentId()+
                "\ngot attendance mark ="+enrolment.getAttendanceMark()+", midterm = "+enrolment.getMidtermMark()
                +" and final = "+enrolment.getFinalMark()+" .Overall is "
                +(double) (enrolment.getAttendanceMark()+ enrolment.getMidtermMark()*3+ enrolment.getFinalMark()*6)/10);
    }
}
