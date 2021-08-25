public class two_dimension_arr {
    public static int[][] array = new int[10][10];

    public static void main(String ar[]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 ; j++){
                array[i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
