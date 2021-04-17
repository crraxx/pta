package Day1;

import java.util.HashMap;
import java.util.Scanner;

public class L1_003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        while ( i != 0){
            if (!hashMap.containsKey((i%10))){
                hashMap.put(i%10,1);
                i = i/10;
            }else {
                hashMap.put(i%10,hashMap.get(i%10)+1);
                i = i/10;
            }
        }
        for (int num:hashMap.keySet()) {
            System.out.println(num+":"+hashMap.get(num));
        }
    }
}
