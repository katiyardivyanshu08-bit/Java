// Top-Level Private Class
// ❌ Not Allowed

// Private Inner Class
// Inside Outer Class -> ✅
// Outside -> ❌

// Private Variable
// Same Class -> ✅
// Outside -> ❌

// Private Method
// Same Class -> ✅
// Outside -> ❌


// 🔴 PRIVATE KEYWORD
// ======================================
// ❌ 1. Top-Level Private Class
// ======================================

// private class Student{}    // ❌ Compile Time Error
// Reason: Top-Level class cannot be private.


// ======================================
// ✅ 2. Private Inner Class
// ======================================
public class A_6_privateKeyword{
    // Accessible only inside Main.
    private static class Student{
        void print(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        Student s=new Student();   // ✅ Allowed
        s.print();
    }
}
/*
Rule:
Inside Main  -> ✅
Outside Main -> ❌
*/


// ======================================
// ✅ 3. Private Instance Variable
// ======================================
class Car{
    private String name;
    void setName(String n){
        name=n;        // ✅ Same Class
    }
    void print(){
        System.out.println(name);  // ✅ Same Class
    }
}

/*
Car c=new Car();
c.name="BMW";      // ❌ Not Allowed
c.setName("BMW");  // ✅ Correct
*/


// ======================================
// ✅ 4. Private Method
// ======================================
class Student{
    private void show(){
        System.out.println("Hello");
    }
    void display(){
        show();        // ✅ Same Class
    }
}

/*
Student s=new Student();
s.show();      // ❌ Not Allowed
s.display();   // ✅ Correct
*/