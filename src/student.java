public class student extends person {
    private String studentID;
    private int grade;
    private double GPA; //학점

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public student(String name, int age, int height, int weight, String studentID, int grade, double GP) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GP;
    }

    public void show(){
        System.out.println("---------------------");
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 나이 : " + getAge());
        System.out.println("학생 키 : " + getHeight());
        System.out.println("학생 몸무게 : " + getWeight());
        System.out.println("학번 : " + getStudentID());
        System.out.println("학년 : " + getGrade());
        System.out.println("학점 : " + getGPA());
    }
}
