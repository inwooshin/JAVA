public class data_type {
    final static double PI = 3.141592;
        //final 이라는 것은 튜플이나, const 처럼 변경할 수 없는 것을 의미한다.

    final static int INT_MAX = 2147483647;
        //int 형의 맥스값을 설정해놓은 것이다.

    public static void main (String ar[]){
        //1. 각각의 변수 타입
        int intType = 100;
        double doubleType = 150.5;
        String StringType = "신인우";
            //자바에서는 변수를 초기화하지 않으면 사용할 수 없다.

        System.out.println(intType);
        System.out.println(doubleType);
        System.out.println(StringType);

        //2. 오버 플로우
        System.out.println(INT_MAX );
            //이런식으로 하면 int 의 최대값이 잘 나오지만
        System.out.println(INT_MAX + 1);
            //1을 더해주게 되면 overflow 가 나서 - 의 값을 가지게 된다.
            //이유는 비트 연산에 있다. 앞서서 맨 앞자리의 비트는 부호를 결정하는데
            //나머지 비트가 모두 1이고 맨앞의 비트가 0 인 상황에서
            //1이 더해지면서 부호를 결정하는 부분의 비트가 1이 되어서 -로 표현되는 것이다.

    }
}
