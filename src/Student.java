import java.util.HashMap;

public class Student extends Person {
    private String studentID;
    private String password;
    private HashMap<String, Integer> scores = new HashMap<>();

    public Student(String name, String studentID, String password) {
        super(name);
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

    public boolean hasName(String inputName) {
        return this.name.equalsIgnoreCase(inputName);
    }

    public boolean hasID(String inputID) {
        return this.studentID.equalsIgnoreCase(inputID);
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    @Override
    public void introduce() {
        System.out.println("학생 : " + name + "\n");
    }
}
