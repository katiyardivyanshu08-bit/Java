class Students{
    String name; // null
    private int rno=32;  // encapsulation => data + method (in class) direct access se protect
                        // 0   and not to access and not to change only using access and change with (pub func)
    double cgpa; // 0.0

    // for private access 
    public void print(){ // getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    // ^ this function is privete so
    // void p(){
    //     print();
    // }

    int getRno(){ // getter
        return rno;
    }

    void setRno(int x){ // setter
        rno = x;
    }
}
public class A_4_encapsulation_PrivateKey {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();                           // roll is private but you acces with public function
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        // s1.rno = 45; // error

        s1.setRno(45);                      // although you can change but using public you can
        System.out.println(s1.getRno());
    }
}