public class method2 {
    //k번째의 약수를 찾는 프로그램
    public static int measure(int number, int k){
        for(int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static char last_char(String input){
        return input.charAt(input.length() - 1);
        //다음의 함수로 input 의 길이를 읽어올 수 있다.
    }

    public static int max(int a, int b){
        return (a > b)? a :b;
    }
    public static int max_3(int a, int b, int c){
        if(max(a, b) == b) return max(b,c);
        else return max(a,c);
    }

    public static void main(String ar[]){
        System.out.println("Hello World의 마지막 언어는 " + last_char("Hello World"));
        System.out.println(max_3(3,6,9));
    }

    //    public static void main(String arg[]){
//
//        int number = 30, key = 5;
//        int answer = function(number, key);
//
//        if(answer == -1) {
//            System.out.format("%d의 %d번째의 약수는 존재하지 않습니다.", number, key);
//        }
//        else {
//            System.out.format("%d의 %d번째의 약수는 %d입니다.", number, key, answer);
//
//        }
//    }

}
