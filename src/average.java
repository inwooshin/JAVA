public class average {
    public static void main(String ar[]){
        int[] arr = new int[1000];
        int sum = 0;

        //Math.random() 의 범위는 0 <= n && n < 1 이다
        //Math.random() * 100 + 1 은
        //1 <= n && n < 101 이다 그래서
        //1 <= n && n <= 100 이다!
        for(int i = 0 ; i < 1000; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
            sum += arr[i];
        }

        System.out.println("average : " + (sum / 1000));
    }
}
