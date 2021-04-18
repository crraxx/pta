package day2;

import java.util.Arrays;
import java.util.Scanner;

public class L1_071前世档案 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String[] str = new String[b];
        for (int i = 0; i < b; i++) {
            String s = input.next();
            str[i] = s;
        }
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            int sum = 1;
            int flag = 1;
            for (int j = a-1; j >= 0; j--) {
                if (str[i].charAt(j)=='n'){
                    sum = sum +flag;
                }
                flag = flag*2;
            }
            System.out.println(sum);
        }
    }
}
