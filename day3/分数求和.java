package day3;

import java.util.Scanner;

public class 分数求和 {

    public static long get(long a, long b) {        //求最大公约数
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (b == 0)
            return a;
        return get(b, a % b);
    }

    public static long getNum(long a, long b) {    //求两个数的最小公倍数
        return a * b / get(a, b);
    }

    public static long num(long[] num, int m) {    //求多个数的最小公倍数
        if (m == 1)
            return num[m - 1];
        return getNum(num[m - 1], num(num, m - 1));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] str = new String[n];
            String[] str2 = new String[n];
            long[] fz = new long[n];
            long[] fm = new long[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
                str2 = str[i].split("/"); //以来分割字符串
                fz[i] = Long.parseLong(str2[0]);
                fm[i] = Long.parseLong(str2[1]);
            }
            long gbs = num(fm, n);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += gbs / fm[i] * fz[i];
            }
            if (sum == 0) {
                System.out.println(0);
            } else if (Math.abs(sum) < gbs) {
                if (get(sum, gbs) == 1)
                    System.out.println(sum + "/" + gbs);
                else {
                    System.out.println(sum / get(sum, gbs) + "/" + gbs / get(sum, gbs));
                }
            } else if (sum == gbs) {
                if (sum < 0)
                    System.out.println("-1");
                else
                    System.out.println("1");
            } else {
                if (sum >= 0) {
                    long x = sum / gbs;
                    if (sum % gbs == 0)
                        System.out.println(x);
                    else {
                        long y = get((sum - gbs * x), gbs);    //提取出整数后的分子和分母的最大公约数
                        System.out.println(x + " " + (sum - gbs * x) / y + "/" + gbs / y);
                    }
                } else {
                    sum = -sum;
                    long x = sum / gbs;
                    if (sum % gbs == 0)
                        System.out.println(-x);
                    else {
                        long y = get((sum - gbs * x), gbs);    //提取出整数后的分子和分母的最大公约数
                        System.out.println(-x + " " + (-(sum - gbs * x)) / y + "/" + gbs / y);
                    }
                }
            }
        }
    }
}
