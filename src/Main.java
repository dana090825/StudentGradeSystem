import java.util.ArrayList;
//배열 사용을 위한 라이브러리
import java.util.Scanner;
//키보드 입력 받기를 위한 라이브러리

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        //왜 배열을 만들었을까?
        Scanner scanner = new Scanner(System.in);
        //Scanner 객체를 생성해서 사용자가 입력한 값을 넣기

        //<선생님 정보를 입력>
        //변수로 여러 명의 선생님을 저장할 수 있음 - Person(추상클래스)에서 만들었던 introduce를 Teacher에 override
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

        //<학생 정보를 입력>
        //학생 변수를 만들어 학생 정보를 입력하고 Student 클래스에 있는 setScore를 이용해 과목과 점수를 저장
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

//        Student s1 = new Student("김예담", "1402", "rladP");
//        s1.setScore("수학", 96);
//        s1.setScore("컴구", 90);
//        s1.setScore("국어", 88);
//        s1.setScore("과학", 90);
//        s1.setScore("사회", 86);
//        s1.setScore("프밍", 95);
//        students.add(s1);
//
//        Student s1 = new Student("이다연", "1408", "dlekdus8");
//        s1.setScore("수학", 96);
//        s1.setScore("컴구", 90);
//        s1.setScore("국어", 88);
//        s1.setScore("과학", 90);
//        s1.setScore("사회", 86);
//        s1.setScore("프밍", 95);
//        students.add(s1);
//
//        Student s1 = new Student("이다연", "1408", "dlekdus8");
//        s1.setScore("수학", 96);
//        s1.setScore("컴구", 90);
//        s1.setScore("국어", 88);
//        s1.setScore("과학", 90);
//        s1.setScore("사회", 86);
//        s1.setScore("프밍", 95);
//        students.add(s1);

        //재입력 및 재획인을 위해 while문을 사용해 반복
        while(true){
            System.out.println("\n성적 확인을 위해 학번을 입력해주세요:");
            String inputID = scanner.nextLine();
            //inputID라는 변수에 사용자가 키보드를 이용해 입력한 문자열을 저장

            System.out.println("성적 확인을 위해 이름을 입력해주세요:");
            String inputName = scanner.nextLine();
            //inputName이라는 변수에 사용자가 키보드를 이용해 입력한 문자열을 저장

            System.out.println("\n본인 인증을 위해 비밀번호를 입력하세요:");
            String inputPassword = scanner.nextLine();
            //inputPassword 변수에 사용자가 키보드를 이용해 입력한 문자열을 저장

            boolean found = false;
            //boolean 타입을 이용하여 본인인증 실패 문구 띄우기
            for(Student student : students) {
                if (student.hasName(inputName) && student.hasID(inputID) && student.checkPassword(inputPassword)) {
                //만약 학생 이름, 학번, 비밀번호가 모두 일치하면
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