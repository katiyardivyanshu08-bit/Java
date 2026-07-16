public class A_2_PassingClassesToMethods {
    // if you pass string or int in method it goes with (by reference)
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"nm ");
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.length = 3.99;
        c1.name = "Kia Sonet";
        c1.seats = 5;
        c1.torque = 178;
        c1.type = "SUV";

        change(c1);
        System.out.println(c1.seats);

        c1.print();

    }
    private static void change(Car x) {
        x.seats = 4;
    }
}