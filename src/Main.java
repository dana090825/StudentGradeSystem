import java.util.ArrayList;
//배열 사용을 위한 라이브러리
import java.util.Scanner;
//키보드 입력 받기를 위한 라이브러리

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Teacher t1 = new Teacher("이경희", "국어", "고은영theacher@gmail.com");
        t1.introduce();

        Teacher t2 = new Teacher("고진영", "수학", "고은영teacher@gmail.com");
        t2.introduce();

        Teacher t3 = new Teacher("오상진", "과학", "오상진teacher@gmail.com");
        t3.introduce();

        Teacher t4 = new Teacher("민병욱, 권현진", "컴구", "민병욱teacher@gmail.com, 권현진teacher@gmail.com");
        t4.introduce();

        Teacher t5 = new Teacher("전호연", "프밍", "전호연teacher@gmail.com");
        t5.introduce();

        Teacher t6 = new Teacher("오정숙", "사회", "오정숙teacher@gmail.com");
        t6.introduce();

        Student s1 = new Student("이다연", "1408", "dlekdus8");
        s1.setScore("수학", 96);
        s1.setScore("컴구", 90);
        s1.setScore("국어", 88);
        s1.setScore("과학", 90);
        s1.setScore("사회", 86);
        s1.setScore("프밍", 95);
        students.add(s1);

        Student s2 = new Student("김수인", "1401", "rlatndls1");
        s2.setScore("수학", 95);
        s2.setScore("컴구", 88);
        s2.setScore("국어", 87);
        s2.setScore("과학", 83);
        s2.setScore("사회", 93);
        s2.setScore("프밍", 77);
        students.add(s2);

        while(true){
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
}