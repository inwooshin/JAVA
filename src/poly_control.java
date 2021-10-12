public class poly_control {
    public static void anything(ploy_fruit a){
        a.show();
    }

    public static void main(String ar[]){
        //fruit 상위 클래스, peach 하위 클래스 위에서 아래로 내려오는 구조!
        //그래서 부모 자식 클래스 라고도 부른다

        //상위 클래스에 하위 클래스의 객체로 형성할 수 있다. 이렇게 할 경우에
        ploy_fruit a = new poly_peach();
        ploy_fruit b = new banana();

        anything(a);
        anything(b);

        //이것이 바로 오버라이딩이다!
    }

}
