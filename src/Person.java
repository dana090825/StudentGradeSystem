//추상 클래스

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }


    public abstract void introduce();
    //absract는 추상 클래스에서 사용(선언은 있지만 구현은 없음)
}
