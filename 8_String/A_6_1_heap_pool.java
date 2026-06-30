public class A_6_1_heap_pool {
    //  public static boolean equals(String s1, String s2){
    //     if(s1.length()!=s2.length()) return false;
    //     for(int i=0;i<s1.length();i++){
    //         if(s1.charAt(i)!=s2.charAt(i)) return false;
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
//        String s1 = "Raghav";  // raghav is a (object)
//        String s2 = "Raghav";
//        System.out.println(s1==s2); // true it cheack address
        String s1 = new String("Raghav");
        String s2 = new String("Raghav");
        System.out.println(s1==s2); // false it cheack address
        System.out.println(s1.equals(s2)); // true it checks value (chaecter by char) so in string always use .equals
    }
}
// Primitive (int, char, boolean, ...)
// → Use ==

// Non-Primitive (String, Objects, Arrays, ...)
// → Usually use .equals()

// Exception:
// Arrays → Use Arrays.equals() (1D)
//           Arrays.deepEquals() (2D/3D)

//JAVA STRING NOTES
// 1️⃣ String Literal (Uses String Pool)
// String s = "Guddu";
// String t = "Guddu";

//            String Pool
//       ┌───────────────┐
//       │    "Guddu"    │
//       └───────────────┘
//            ▲      ▲
//            │      │
//            s      t

// ✔ 1 Object
// ✔ Same Reference
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// 2️⃣ Using new (Uses Heap)
// String a = new String("Guddu");

//           String Pool
//       ┌───────────────┐
//       │    "Guddu"    │ ◄── s,t
//       └───────────────┘
//               +
//              Heap
//       ┌───────────────┐
//       │    "Guddu"    │ ◄── a
//       └───────────────┘
// ✔ 2 Objects
// ✔ Different References
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// 3️⃣ Reassigning a String
// String s = "Raghav";
// s = "Harsh";
// Before:
// s ───► "Raghav"
// After:
// "Raghav"      "Harsh"
//                  ▲
//                  │
//                  s
// ✔ String is Immutable
// ✔ Only the Reference Changes
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// 4️⃣ Comparison
// ==        ➜ Compares Reference (Address)
// .equals() ➜ Compares Content (Value)
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// 5️⃣ Which Comparison to Use?
// Primitive (int, char, boolean...)
//         ➜ ==
// String
//         ➜ .equals()
// Array Reference
//         ➜ ==
// Array Content
//         ➜ Arrays.equals()
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// ⭐ Golden Rule
// "Text"              ➜ String Pool
// new String("Text")  ➜ Heap
// ==                  ➜ Reference
// .equals()           ➜ Content
// Arrays.equals()     ➜ Array Content
