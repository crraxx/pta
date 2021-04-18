package day2;

import java.util.HashMap;
import java.util.Scanner;

public class L1_023输出GPLT {
    public static void main(String[] args) {
        /*
        GPLTGPLTGLTGLGLL
         */
        String str = "pcTclnGloRgLrtLhgljkLhGFauPewSKgt";
        int g = 0;
        int p = 0;
        int l = 0;
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G' || str.charAt(i) == 'g') {
                g++;
            } else if (str.charAt(i) == 'P' || str.charAt(i) == 'p') {
                p++;
            } else if (str.charAt(i) == 'L' || str.charAt(i) == 'l') {
                l++;
            } else if (str.charAt(i) == 'T' || str.charAt(i) == 't') {
                t++;
            }
        }
        while (g != 0 || p != 0 || l != 0 || t != 0) {
            if (g != 0) {
                System.out.print("G");
                g--;
            }
            if (p != 0) {
                System.out.print("P");
                p--;
            }
            if (l != 0) {
                System.out.print("L");
                l--;
            }
            if (t != 0) {
                System.out.print("T");
                t--;
            }
        }
    }
}
