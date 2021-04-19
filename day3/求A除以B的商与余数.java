package day3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class 求A除以B的商与余数 {
    /*
    计算A/B的商和余数，其中被除数A是不超过1000位的非负整数，除数B是一个不超过int类型取范围的任意非负整数。要求你输出商Q和余数R。

    输入格式:
    输入在一行中依次给出 A 和 B，中间以空格分隔。

    输出格式:
    在一行中依次输出 Q 和 R，中间以空格分隔。

    输入样例:
    1234567891234567893 23
    输出样例:
    53676864836285560 13
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        int B = input.nextInt();
        int sum = 0;
        int flag = 1;
        for (int i = 0; i < A.length(); i++) {
            if (sum >= B){
                System.out.print(sum/B);
                sum = (sum%B)*10+(int)(A.charAt(i)-'0');
                flag=1;
            }else{
                sum = sum*10+(int)(A.charAt(i)-'0');
                if (flag == 0){
                    System.out.print("0");
                }
            }
        }
        if (sum >= B){
            System.out.println(sum/B +" "+ sum%B);
        }else{
            System.out.println("0"+" "+sum);
        }

    }
}
