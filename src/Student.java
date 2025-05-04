import java.util.HashMap;

public class Student extends Person {
    private int studentID;
    private String password;
    private HashMap<String, Integer> scores = new HashMap<>();

    public Student(String name, int studentID, String password) {
        super(name);
        this.studentID = studentID;
        this.password = password;
    }

    public void setScore(String subject, int score) {
        scores.put(subject, score);
    }

    public void printScores() {
        System.out.println(name + "의 성적");
        for(String subject : scores.keySet()) {
            System.out.println(subject + " : " + scores.get(subject));
        }
    }

    public boolean hasName(String inputName) {
        return this.name.equalsIgnoreCase(inputName);
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    @Override
    public void introduce() {
        System.out.println("저는 학생 " + name + "입니다.");
    }
}
