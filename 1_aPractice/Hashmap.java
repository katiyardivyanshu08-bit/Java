import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        names.add("Alice");
        marks.add(89);

        names.add("Bob");
        marks.add(95);

        names.add("Carol");
        marks.add(78);

        System.out.println("--- Student List ---");

        ListIterator<String> iterator = names.listIterator();

        int maxMarks = -1;
        String topStudent = "";

        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String name = iterator.next();

            System.out.println(name + " : " + marks.get(index));

            if (marks.get(index) > maxMarks) {
                maxMarks = marks.get(index);
                topStudent = name;
            }
        }

        System.out.println();
        System.out.println("Top Student: " + topStudent + " (" + maxMarks + " marks)");

        ArrayList<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);

        System.out.println();
        System.out.println("--- Sorted Students ---");

        for (String name : sortedNames) {
            int index = names.indexOf(name);
            System.out.println(name + " : " + marks.get(index));
        }
    }
}
