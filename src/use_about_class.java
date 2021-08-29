public class use_about_class {

    public static void main(String ar[])
    {
        about_class one = new about_class(3,5);
        about_class two = new about_class(6,8);

        about_class three = one.getCenter(two);

        System.out.println(three.getX() + " : " + three.getY());
    }
}
