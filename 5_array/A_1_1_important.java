import java.util.Arrays;
public class A_1_1_important {
    public static void main(String[] args) {

int[] a = {1,2,3};
int[] b = {1,2,3};
System.out.println(Arrays.equals(a, b));   // true

//2d array
int[][] c = {{1,2},{3,4}};
int[][] d = {{1,2},{3,4}};
System.out.println(Arrays.deepEquals(c, d));   // true

    }
}
