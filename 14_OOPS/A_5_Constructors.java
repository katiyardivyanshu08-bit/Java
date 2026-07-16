import java.util.*;
public class A_5_Constructors {
    public static class Car{
        int price; // 0
        String name; // null
        Car(){ // default constructor (when new __() not pass parameter)

        }
        // Parameterized Constructor => new Car(1200000,"Kia Sonet")  (Parameters passed)
        Car(String s, int x){          // field => instance(object) variable like (price and name)
            this.price = x;
            name = s;
        }
        Car(int price, String name){    
            this.price = price;         //Same name (field aur parameter dono same) → this required.
            this.name = name;           //Different names (field and parameter differnt ) → this optional.
            
        }

        void print(){
            // 'this' keyword:
            // Used to access the instance variable when a local variable or parameter has the same name.
            int price = 12;
            System.out.println(price);

            System.out.println(this.price+" "+name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(1250000,"Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto",400000);   //order not matter if you create method
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";
    }
}