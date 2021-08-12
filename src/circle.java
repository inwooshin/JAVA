public class circle {
    final static int r = 20;

    public static void main(String ar[]){
        for(int x = -r ; x <= r ; x++){
            for(int y = r ; y >= -r ; y--){
                if(Math.pow(x,2) + Math.pow(y, 2) <= Math.pow(r,2)) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
