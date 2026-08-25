class Student{
    String name;
    int roll;
    int marks;

    void printall(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}
class rectangle{
    int len;
    int width;
    void area(){
        int a=len*width;
        System.out.println(a);
    }
    void peri(){
        int p=2*(len+width);
        System.out.println(p);
        
    }
}
public class A_2_1_practice{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="divyanshu";
        s1.roll=15;
        s1.marks=100;
        s1.printall();
        System.out.println("--------------------------------------");
        rectangle r1= new rectangle();
        r1.len=10;
        r1.width=10;
        r1.area();
        r1.peri();
    }
}
