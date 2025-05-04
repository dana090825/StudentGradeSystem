import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Teacher t1 = new Teacher("고진영", "영어", "고진영theacher@gmail.com");
        t1.introduce();

        Student s1 = new Student("이다연", "1408", "dlekdus8");
        s1.setScore("수학", 96);
        s1.setScore("컴구", 90);

        Student s2 = new Student("김수인", "1401", "rlatndls1");
        s1.setScore("수학", 95);
        s1.setScore("컴구", 88);

        students.add(s1);
        students.add(s2);

        System.out.println("\n성적 확인을 위해 이름과 학번을 입력해주세요:");
        String inputName = scanner.nextLine();
        String inputID = scanner.nextLine();

        System.out.println("비밀번호를 입력하세요:");
        String inputPassword = scanner.nextLine();

        boolean found = false;
        for(Student student : students) {
            if (student.hasName(inputName) && student.hasID(inputID) && student.checkPassword(inputPassword)) {
                System.out.println("본인인증에 성공하셨습니다!\n");
                student.introduce();
                student.printScores();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("이름이나 비밀번호가 틀렸습니다. 다시 한번 입력해주세요.");
        }
    }
}