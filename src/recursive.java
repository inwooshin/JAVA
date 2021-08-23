public class recursive {
    public static int fact_rec(int number){
        if(number == 0) return 1;

        return number * fact_rec(number - 1);
    }

    // 3 * 2 * 1
    public static int fact(int number){
        int sum = number;

        for(int i = number - 1 ; i != 0 ; i--){
            sum *= i;
        }
        return sum;
    }

    public static void main(String ar[]){
        System.out.println(fact(10));
        System.out.println(fact_rec(10));
    }
}
