public class A_13_tower_of_hanoi {
     public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b); // n-1 disks from A to B via C
        System.out.print(a+"->"+c+" , "); // largest from A to C
        hanoi(n-1,b,a,c); // n-1 disks from B to C via A
    }   
    //minimum count (2powN-1)
}
