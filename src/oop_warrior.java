public class oop_warrior extends oop_hero {

    public oop_warrior(String name) {
        super(name); //부모 클래스의 변수를 초기화 해주는 것이다!
    }

    public void groundCutting(){
        System.out.println("대지 가르기..!");
    }
}
