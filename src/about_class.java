public class about_class {
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x; //이 객체의 x의 값을 설정하겠다.
    }

    public void setY(int y){
        this.y = y; //이 객체의 x의 값을 설정하겠다.
    }

    public about_class(int x, int y){
        //생성자이다. 맨처음 실행하면 초기 설정을 다루는 부분이다.
        this.x = x;
        this.y = y;
    }

    public about_class getCenter(about_class other){
        //이렇게 길게 일일이 쓰는 방법도 있지만,
//        about_class tmp = new about_class(0,0);
//        tmp.x = (this.x + other.x) / 2;
//        tmp.y = (this.y + other.y) / 2;
//
//        return tmp;

        //간단하게 쓰는 방법도 있다.
        return new about_class((this.x + other.x) /2, (this.y + other.y) / 2);
    }

    public static void main(String ar[]){
        about_class one = new about_class(3,5);
        about_class two = new about_class(5,10);

        about_class three = one.getCenter(two);

        System.out.println(three.x + " : " + three.y);
    }
}
