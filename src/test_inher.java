public class test_inher {
    public static void main(String ar[]){
        student other = new student("ins",26,
                177, 75, "010",2, 4.5);
        //여기에서 따로 student 에는 person 에 관한 기본적인 이름, 난이, 키, 무게 설정이 없다.
        //그러나 상속을 통해서 이와 같이 person의 메서드와 변수를 사용할 수 있다.

        other.show();
        other.show();

        Teacher oh = new Teacher("oh", 57, 170, 70,
                "202020",600, 7200);
        oh.show();
        oh.show();
    }
}
