package day3;

import java.util.Scanner;

public class 反向数相加7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int aa = 0, bb = 0;
            aa = input.nextInt();
            bb = input.nextInt();
            int res1 = aa, res2 = bb;
            aa=0;
            bb=0;
            while (res1 != 0) {
                aa = aa * 10 + res1 % 10;
                res1 /= 10;
            }
            while (res2 != 0) {
                bb = bb * 10 + res2 % 10;
                res2 /= 10;
            }
            aa += bb;
            int temp = 0;
            while (aa != 0) {
                temp = temp * 10 + aa % 10;
                aa /= 10;
            }
            System.out.println(temp);
        }
    }
}
