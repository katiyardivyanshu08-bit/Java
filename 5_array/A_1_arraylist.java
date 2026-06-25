import java.util.*;
public class A_1_arraylist {
    public static void main(String[] args) {
        // it is used for dynamic array -> we dont give the size of array 
        ArrayList<Integer> arr = new ArrayList<>();
        // charter
        // ArrayList<Character> arr1 = new ArrayList<>();
        
        
        //arr.contains(5) retrun true or false  is 5 num in a list or not

        arr.add(25);
        arr.add(12);
        arr.add(9);
        
        arr.add(1,100); //add
        arr.set(1,50); //replace
        
        arr.add(19);
        // len
        int n=arr.size();

        arr.remove(arr.size()-1);

        System.out.println(arr.get(1));
        // change
        arr.set(2,10);
        System.out.println(arr.get(2));


        System.out.println(arr);
        // or
        // for(int i=0 ; i<n ; i++){
        //     System.out.print(arr.get(i)+" ");
        // }

        //reverse
        Collections.reverse(arr);
        
        //or
        // int i =0 ;
        // int j=arr.size()-1;
        // while (i<j) {
        //     int temp = arr.get(i) ;
        //     arr.set(i , arr.get(j));
        //     arr.set(j , temp);
        //     i++;
        //     j--;
        // }
        System.out.println(arr);

    }
}
