public class A_5_1_Marks {
    static class StudentData {
        String name;
        int rno;
        int[] marks;

        // Create a new array
        StudentData(int size) {
            marks = new int[size];
        }

        // Store the reference of an existing array
        StudentData(int[] arr) {
            marks = arr;
        }
    }

    public static void main(String[] args) {
        // New object with a new marks array of size 4
        StudentData s1 = new StudentData(4);
        // Assign values to s1's marks array
        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s1.marks[2] = 56;
        s1.marks[3] = 78;
        
        // Existing array
        int[] arr = {4, 7, 1, 4, 8};
        // New object that shares the same array 'arr'
        StudentData s2 = new StudentData(arr);
    }
}