import java.util.HashMap;

public class Student extends Person {
    private String studentID;
    private String password;
    private HashMap<String, Integer> scores = new HashMap<>();

    public Student(String name, String studentID, String password) {
        super(name);
        this.name = name;
        this.studentID = studentID;
        this.password = password;
    }

    public void setScore(String subject, int score) {
        scores.put(subject, score);
    }

    public void printScores() {
        System.out.println(name + "학생의 성적");
        for(String subject : scores.keySet()) {
            System.out.println(subject + " : " + scores.get(subject));
        }
    }

    public boolean hasStudent(String inputName, String inputID, String inputPassword) {
        return this.name.equalsIgnoreCase(inputName) && this.studentID.equalsIgnoreCase(inputID) && this.password.equalsIgnoreCase(inputPassword);
    }

    @Override
    //override : 직접 구현한 것
    public void introduce() {
        System.out.println("학생 : " + name + "\n");
    }
}
