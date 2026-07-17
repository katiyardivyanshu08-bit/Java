//                     🔴JAVA VARIABLES
//                             │
//       ┌─────────────────────┼─────────────────────────┐
//       │                     │                         │
//       ▼                     ▼                         ▼

//     STATIC                FINAL                    STATIC FINAL
//  (One Shared Copy)    (Own Copy)              (One Shared Copy)

//         country          jerseyNo                    GAME
//            ▲                ▲                         ▲
//      ┌─────┼─────┐       c1 -                    ┌────┼────┐
//      │     │     │       c2 ─                    │    │    │
//     c1    c2    c3       c3 ─                   c1   c2   c3

// country = India      jerseyNo = 18             GAME = Cricket

// Change by any         18 ─────X────► 7          "Cricket" ─X──► "Football"
// object                     ❌                  ❌
//      │
//      ▼
// Everyone sees
// the new value.
// ------------------------------------------------------------------------------------------------
class Cricketer{
    // ✅ STATIC -> One copy shared by all objects
    static String country = "India";

    // ✅ FINAL -> Value cannot be changed
    final int jerseyNo = 18;

    // STATIC FINAL -> One shared constant
    static final String GAME = "Cricket";
}

public class A_7_static_final{
    public static void main(String[] args){
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();

        // STATIC
        System.out.println(c1.country); // ind
        System.out.println(c2.country); // ind
        c1.country = "England";
        System.out.println(c1.country); // England
        System.out.println(c2.country); // England 
        c2.country = "Australia";
        System.out.println(c1.country); // Australia
        System.out.println(c2.country); // Australia

        // FINAL
        System.out.println(c1.jerseyNo); // 18
        // c1.jerseyNo = 7;   // ❌ Compile Time Error

        // STATIC FINAL
        System.out.println(Cricketer.GAME); // Cricket
        // Cricketer.GAME = "Football"; // ❌ Error
    }
}