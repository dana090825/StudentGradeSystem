public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void introduce() {
        System.out.println( subject + " : " + name + "선생님");
    }
}
