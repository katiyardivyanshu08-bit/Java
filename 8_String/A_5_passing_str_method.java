public class A_5_passing_str_method {
        public static void change(String x){
        x = "Utkarsh";
    }
    public static void main(String[] args) {
        String x = "raghav";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
