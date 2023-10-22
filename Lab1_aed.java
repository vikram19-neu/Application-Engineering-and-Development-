import java.util.ArrayList;

public class Lab1_aed {
    public static void main(String[] args) {

        // Part 1: Arrays
        int[] x = {1, 5, 3, 7, 2};
        int[] y = {8, 2, 4, 9, 6};
        
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Part 2: ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Vikram");
        names.add("Sawant");
        names.add("Northeastern");
        names.add("Oakland");
        names.add("California");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            char firstLetter = Character.toLowerCase(name.charAt(0));
            char lastLetter = Character.toUpperCase(name.charAt(name.length() - 1));
            String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
            switchedNames.add(switchedName);
        }

        System.out.println("Lab 1 : Part 1");
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i] + ",");
        }
        System.out.println(" }");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(" " + y[i] + ",");
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(" " + z[i] + ",");
        }
        System.out.println(" }");

        System.out.println("Lab 1 : Part 2");
        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(" " + name + ",");
        }
        System.out.println(" }");

        System.out.print("Names (switched) = {");
        for (String switchedName : switchedNames) {
            System.out.print(" " + switchedName + ",");
        }
        System.out.println(" }");

    }
    
}
