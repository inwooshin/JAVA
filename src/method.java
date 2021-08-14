public class method {
    //3개의 최대공약수를 구하는 함수
    public static int function(int a, int b, int c){
        int min;
        if(a > b){
            if(b > c){
                min = c;
            }
            else{
                min = b;
            }
        }
        else if(a < c){
            min = a;
        }
        else min = c;

        for(int i = min ; i >= 0 ; i--){
            if(a % i == 0 && b % i == 0 && c % i == 0){
                return i;
            }
        }

        return -1;
    }

    public static void main(String ar[]){
        System.out.println(function(400,300,750));
    }
}
