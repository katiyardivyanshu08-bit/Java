abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment by UPI");
    }
}

public class A_10_Abstraction {
    public static void main(String[] args) {
        UPI p = new UPI();
        p.pay();
    }
}

// Abstraction
// │
// ├── Hide Implementation
// ├── Show Only Required Features
// ├── Parent Class → Defines Rule
// ├── Child Class → Provides Implementation
// └── Achieved Using:
//       ├── abstract class
//       └── interface