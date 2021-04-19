package day3;

import java.util.Scanner;

public class 求玉米亩产量 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[4][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0] = input.nextInt();
            num[i][1] = input.nextInt();
        }

        double AB = line(num[0][0],num[0][1],num[1][0],num[1][1]);
        double BC = line(num[1][0],num[1][1],num[2][0],num[2][1]);
        double CD = line(num[2][0],num[2][1],num[3][0],num[3][1]);
        double DA = line(num[0][0],num[0][1],num[3][0],num[3][1]);
        double BD = line(num[1][0],num[1][1],num[3][0],num[3][1]);
        double area = area(AB,BD,DA)+area(BD,CD,BC);
        System.out.println(String.format("%.2f",(120*1000)/area));
    }

    public static double line(double x1, double y1, double x2, double y2) {
        double lines = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return lines;
    }

    public static double area(double a, double b, double c) {
        double area = 0;
        double p = (a+b+c)*1.0/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c))*0.0015;
        return area;
    }
}
