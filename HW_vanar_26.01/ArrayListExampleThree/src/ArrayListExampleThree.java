import java.util.ArrayList;

public class ArrayListExampleThree {
    public static void main(String[] args) {

        ArrayList<String> developers = new ArrayList<>();

        developers.add("Johny");
        developers.add("Valeria");
        developers.add("Tatiana");
        developers.add("Peter");
        developers.add("Marry");

        // showing the initials, use "charAt(index)" from "String" class
        int i = 1;
        for (String name : developers) {
            System.out.println(i + ". " + "\"" + name.charAt(0) + "." + "\"");
            i++;
        }

        // the longest name, use "length()" from "String" class
        int maxLength = developers.get(0).length();
        String longestName = "";
        for (String name : developers) {
            if (maxLength < name.length()) {
                maxLength = name.length();
                longestName = name;
            }
        }
        System.out.println();
        System.out.println("Max length = " + maxLength);
        System.out.println("The longest name is " + "\"" + longestName + "\"\n");

        // swap values
        System.out.println("Swap uttermost values: \n");
        String temp = developers.get(0);
        developers.set(0, developers.get(developers.size() - 1));
        developers.set(developers.size() - 1, temp);

        for (String name : developers) {
            System.out.println(name);
        }
    }
}
