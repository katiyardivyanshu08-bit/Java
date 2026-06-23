// pass by refference 
// when you do in interger it is a pass by value (integer not change but array change )

public class A_3_passing_arr_Method {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
        }
    public static void change(int[] y) {
        y[2]=99;
    }
}
