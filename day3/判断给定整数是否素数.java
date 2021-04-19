package day3;

import java.util.Scanner;

public class 判断给定整数是否素数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        int num = isPrime(nums);
        if (num == 0){
            System.out.println(nums+" is not prime number.");
        }else {
            System.out.println(nums+" is prime number.");
        }
    }
    public static int isPrime(int num){
        
        return num;
    }
}
