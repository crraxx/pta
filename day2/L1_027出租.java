package day2;

import java.util.*;

public class L1_027出租 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        SortedSet<Character> sortedSet = new TreeSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!sortedSet.contains(str.charAt(i))) {
                sortedSet.add(str.charAt(i));
            }
        }
        for (char c : sortedSet) {
            list.add(c);
        }
        Collections.reverse(list);
        int i = 0;
        int[] arr = new int[list.size()];
        System.out.print("int[] arr = new int[]{");
        for (
                char c : list) {
            arr[i] = c;
            i++;
            System.out.print(c - '0');
            if (i != list.size()) {
                System.out.print(",");
            }
        }
        System.out.println("};");
        System.out.print("int[] index = new int[]{");
        int s = 0;
        for (
                int j = 0; j < str.length(); j++) {
            out:
            for (int k = 0; k < arr.length; k++) {
                if (str.charAt(j) == arr[k]) {
                    System.out.print(k);
                    if (s != str.length() - 1) {
                        System.out.print(",");
                    }
                    s++;
                    break out;
                }
            }
        }
        System.out.print("};");
    }

}
