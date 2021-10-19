import java.util.Scanner;

public class gugudan {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);

        int std = scanner.nextInt();

        for(int i = 1 ; i < 10 ; i++){
            System.out.println(std + " * " + i + " = " + std * i);
        }
    }
}