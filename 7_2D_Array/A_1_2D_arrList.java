import java.util.*;
public class A_1_2D_arrList {
    public static void main(String[] args) {
          ArrayList<Integer> a = new ArrayList<>();
          a.add(3);a.add(4);a.add(5);a.add(6);

          ArrayList<Integer> b = new ArrayList<>();
          b.add(2);b.add(3);b.add(8);b.add(7);

          ArrayList<Integer> c = new ArrayList<>();
          c.add(1);c.add(6);c.add(7);c.add(9);

          ArrayList<Integer> d = new ArrayList<>();

          //
          ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
                arr.add(a);
                arr.add(b);
                arr.add(c);
                arr.add(d);
                //[[3, 4, 5, 6], [2, 3, 8, 7], [1, 6, 7, 9], []]
                //System.out.println(arr.get(1).get(1)); //3
                arr.get(0).set(1,3);  //insert if the array list not empty other wise use add
                arr.get(1).add(10);                // add

                arr.get(2).add(1,5);

                arr.add(new ArrayList<>());                 // adding empty array list in the end 

                arr.get(arr.size()-1).add(10);
            for(ArrayList<Integer>x : arr){
                for(int ele : x){
                    System.out.print(ele+" ");
                }
            System.out.println();
            }
            //or
            //  System.out.println(arr);
            //or
            // for(int i = 0; i<arr.size();i++){
            //     for(int j = 0 ; j<arr.get(i).size();j++){
            //         System.out.print(arr.get(i).get(j)+" ");
            //     }
            // System.out.println();
            // }
          
            // pascal triangle

    }
}
