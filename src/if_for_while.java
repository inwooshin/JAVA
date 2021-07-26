public class if_for_while {
    public static void main(String ar[]){
        /*
        String a = "i love u";
        if(a.contains("love")){
            // 포함하는 경우 실행하는 것
            System.out.println("me too");
        }
        else{
            System.out.println("i dont like u");
        }

        String b = "Man";

        if(b.equals("Man")){
            System.out.println("man 과 일치합니다...!");
        }
        else{
            System.out.println("man 과 일치하지 않습니다...!");
        }

        if(b.equalsIgnoreCase("man")){
            System.out.println("참");
        }
        else{
            System.out.println("아님");
        }


         */

        int i = 1, sum = 0;
        while(i <= 1000){
            sum += i;

            i++;
        }
        System.out.println(sum);
    }
}
