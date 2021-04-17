package Day1;

import java.util.Scanner;

public class L1_005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Long[][] infor = new Long[num][3];
        for (int i = 0; i < infor.length; i++) {
            for (int j = 0; j < infor[i].length; j++) {
                Long k = input.nextLong();
                infor[i][j] = k;
            }
        }
        int nums = input.nextInt();
        int[] cha = new int[nums];
        for (int i = 0; i < nums; i++) {
            cha[i] = input.nextInt();
        }
        for (int name:cha) {
            for (int i = 0; i < infor.length; i++) {
                if (infor[i][1] == name){
                    System.out.println(infor[i][0]+" "+infor[i][2]);
                }
            }
        }
    }
}
