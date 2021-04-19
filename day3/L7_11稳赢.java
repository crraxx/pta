package day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class L7_11稳赢 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt()+1;
        input.nextLine();
        int i = 0;
        while (true) {
            String str1 = input.nextLine();
            if (str1.equals("End")) {
                break;
            }else{
                i++;
                if (i % k == 0) {
                    System.out.println(str1);
                    continue;
                }else if (str1.equals("ChuiZi")) {
                    System.out.println("Bu");
                } else if (str1.equals("JianDao")) {
                    System.out.println("ChuiZi");
                } else {
                    System.out.println("JianDao");
                }

            }
        }
    }
}
