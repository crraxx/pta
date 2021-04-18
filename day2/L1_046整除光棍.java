package day2;

import java.util.Scanner;

public class L1_046整除光棍 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count = 0;
        int sum = 1;
        int flag = 0;
        while (true) {
            if (sum >= x) {
                count++;
                if (sum % x == 0) {
                    System.out.print(sum / x);
                    break;
                } else {
                    System.out.print(sum / x);
                    sum = (sum % x) * 10 + 1;
                    flag=1;
                }
            } else {
                count++;
                sum = sum * 10 + 1;
                if (flag == 1){
                    System.out.print("0");
                }
            }
        }
        System.out.println(" "+count);
    }
}
