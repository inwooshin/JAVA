public class round_off {
    //static 같은 경우는 class 내에서 전반적으로 사용하는 것이다.
    public static void main(String ar[]){
        double own = 0.5241421;
        int a = (int)(own + 0.5);
            //반올림을 위와 같은 연산의 형태로 만들 수 있다.

        /*
        for(char i = 'a' ; i <= 'z' ; i++){
            System.out.println(i);
        }
         */
            // for 의 문법은 그으냥 c언어랑 똑같다.

        /*
        a = 30;
        System.out.format("10진수 : %d\n", a);
        System.out.format("16진수 : %x\n", a);
        System.out.format("8진수 : %o\n", a);

        String name = "John Snow";
        System.out.println(name);
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(3,6));
        System.out.println(name.substring(6,8));
         */

        int b = 0;
        System.out.println("최대값은 " + max(a, b) + " 입니다.");

        double c = Math.pow(3.0, 5.0);
        System.out.println(c);
    }

    static int max(int a, int b){
        int result = (a > b) ? a : b;
        return result;
    }
}
