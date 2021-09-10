import java.util.Scanner;

public class class_array {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("총 몇 명의 교사를 두겠습니까? : ");

        int number = sc.nextInt();

        Teacher[] teacherGroup = new Teacher[number];

        for(int i = 0 ; i < number ; i++){
            String name;
            int age;
            int height;
            int weight;
            String teacherID;
            int monthSalary;
            int workedYear;

            System.out.print("이름를 입력하세요 : ");
            name = sc.next();
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            System.out.print("키를 입력하세요 : ");
            height = sc.nextInt();
            System.out.print("무게를 입력하세요 : ");
            weight = sc.nextInt();
            System.out.print("교번를 입력하세요 : ");
            teacherID = sc.next();
            System.out.print("월급을 입력하세요 : ");
            monthSalary = sc.nextInt();
            System.out.print("연봉을 입력하세요 : ");
            workedYear = sc.nextInt();

            //배열로 클래스를 선언을 해주었을 경우에는 이런식으로 초기화를 해줘야된다.
            teacherGroup[i] = new Teacher(name, age, height, weight, teacherID, monthSalary, workedYear);
            teacherGroup[i].show();
        }
    }
}
