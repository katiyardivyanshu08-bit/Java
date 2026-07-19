class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){

    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(ComplexNumber z) {
        x += z.x;
        y += z.y;
    }

    void multiply(ComplexNumber z) {
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

    // not change core value
    ComplexNumber No_change_value_multiply(ComplexNumber z) {
        int real = x * z.x - y * z.y;
        int imag = x * z.y + y * z.x;
        return new ComplexNumber(real, imag);
    }

    void divide(ComplexNumber z) {

    }
}
public class A_8_ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,-5);
        ComplexNumber z2 = new ComplexNumber(3,4);
        z1.print(); z2.print();
        
        System.out.println("Addition :");
        ComplexNumber ans = z2.No_change_value_multiply(z1);
        // System.out.println(ans); //wrong
        ans.print();
        
        System.out.println("Core value not change :");
        z1.print(); z2.print();

        System.out.println("Addition :");
        z1.add(z2);
        z1.print();

        System.out.println("Change value");

        System.out.println("Multiply :");
        z2.multiply(z1);
        z2.print();
        System.out.println("Multiply :");
        z2.multiply(z1);
        z2.print();
    }
}