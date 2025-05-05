public class Teacher extends Person{
    private String subject;
    public String teacherEmail;

    public Teacher(String name, String subject, String teacherEmail) {
        super(name);
        this.subject = subject;
        this.teacherEmail = teacherEmail;
    }

//    public int complaint(int complaintAnswer) {
//        if (complaintAnswer == 1) {
//            System.out.println(t1.teacherEmail());
//        }
//    }
//
//    public String printTeacherEmail() {
//        return teacherEmail;
//    }
//
//    public String getSubject() {
//        return subject;
//    }

    @Override
    public void introduce() {
        System.out.println( subject + " : " + name + "선생님");
    }
}
