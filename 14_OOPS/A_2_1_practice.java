// class Student{
//     String name;
//     int roll;
//     int marks;

//     void printall(){
//         System.out.println(name);
//         System.out.println(roll);
//         System.out.println(marks);
//     }
// }
// class rectangle{
//     int len;
//     int width;
//     void area(){
//         int a=len*width;
//         System.out.println(a);
//     }
//     void peri(){
//         int p=2*(len+width);
//         System.out.println(p);
        
//     }
// }

class book {
    String title;
    String author;
    int price;

book(){
    title="null";
    author="xyz";
    price=10;
}
book(String t , String a , int p){
    this.title=t;
    this.author=a;
    this.price=p;
}
void display(){
    System.out.println(title);
    System.out.println(author);
    System.out.println(price);
}
}

class emp{
    String name;
    double salary;

    emp(String n , double s){
        this.name=n;
        this.salary=s;
    }
    void calculatenetsalary(){
        double hra=(salary*20)/100;
        double tax=salary*0.1;
        double t=salary+hra-tax;
        System.out.println(t);
    }

    void display(){
        System.out.println(name);
        System.out.println(salary);
        calculatenetsalary();
    }
}
public class A_2_1_practice{
    public static void main(String[] args) {
        book b1=new book();
        book b2=new book("next","abc",500);
        book b3=new book("/","rgh",123500);
        b1.display();
        b2.display();
        b3.display();
        
        emp e1=new emp("divyanshu",100000);
        e1.display();

        // Student s1 = new Student();
        // s1.name="divyanshu";
        // s1.roll=15;
        // s1.marks=100;
        // s1.printall();
        // System.out.println("--------------------------------------");
        // rectangle r1= new rectangle();
        // r1.len=10;
        // r1.width=10;
        // r1.area();
        // r1.peri();
    }
}
