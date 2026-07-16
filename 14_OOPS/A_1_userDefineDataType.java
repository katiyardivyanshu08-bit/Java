import java.util.* ;
public class A_1_userDefineDataType {
    // class => blueprint
    // obj => real life entity
    static class Student{ // khudka ek data  and you can make (after import)
                    // make static inner class
                    // after import no need
                    // if it outside or after import you can access the class in different file in the folder 
    String name;
    int rno;
    double cgpa;

    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Scanner is class  and sc is a obj
        Student s1 = new Student(); // declaration
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // declaration
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student(); // declaration
        s3.name = "Anagha";
        System.out.print("enter s3 roll no : ");
        s3.rno = sc.nextInt();
        s3.cgpa = 9.37;

        // System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        s2.cgpa = 9.8;
        // System.out.println(s3.rno);

       s1.print(); s2.print(); s3.print(); // upr wale function se call

    // or (print) not best way to print
    // print(s1); print(s1); print(s1);
    // private static void print(Student s){
    //     System.out.println(s.name+" "+s.rno+" "+s.cgpa);
    // }

    sc.close();
    }
}
