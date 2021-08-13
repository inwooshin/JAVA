import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class in_and_out {
    public static void main(String ar[]) {
        //Scanner 가 말그대로 스캔하는 거임! 입력과 스캐너를 객체를 연결시켜주는 것이다.

        /*
        System.out.print("정수를 입력하세요 : ");
        int i = sc.nextInt();
        System.out.println("입력된 정수는 : " + i + "입니다");

        System.out.print("정수를 입력하세요 : ");
        int j = sc.nextInt();
        System.out.println("입력된 정수는 : " + j + "입니다");
        sc.close();

         */

        //이렇게 파일을 File 클래스로 읽어와준다.
        File f = new File("input.txt");

        try{
            Scanner sc = new Scanner(f); //스캐너를 파일하고 연결해준다.
            while(sc.hasNextInt()){ //인수가 있으면
                System.out.println(sc.nextInt() * 100); //연산 고고
            }
            sc.close(); //연산 끝나고 닫아준다.
        } catch(FileNotFoundException error){ //파일이 찾아지지 않은 에러가 나면
            System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
        }
    }
}
