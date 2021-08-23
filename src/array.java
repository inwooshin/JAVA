import java.util.Scanner;

public class array {
    static int[] array = new int[100];

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력하세요 : ");
        int number = sc.nextInt();
        int[] array = new int[number];

        for(int i = 0 ; i < number ; i++){
            System.out.print("array[" + i + "] 배열에 입력할 값을 입력하세요 : ");
            array[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0 ; i < number ; i++){
            max = max(max, array[i]);
        }

        System.out.println("최댓값은 : " + max);
    }
}
