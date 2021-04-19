package day3;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class 求导 {
    /*
    设计函数求一元多项式的导数。

    输入格式:
    以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过1000的整数）。数字间以空格分隔。

    输出格式:
    以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。

    输入样例:
    3 4 -5 2 6 1 -2 0
    输出样例:
    12 3 -10 1 6 0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s[] = (input.nextLine().split(" +"));
        Map<Integer, Integer> pg = new LinkedHashMap<>();
        Set<Entry<Integer, Integer>> entrySet = pg.entrySet();
        for (int i = 0; i < s.length; i += 2) {
            int coe = Integer.parseInt(s[i]);
            int index = Integer.parseInt(s[i + 1]);
            coe = coe * index;
            index--;
            if (index != -1) {
                if (!pg.containsKey(index)) {
                    pg.put(index, coe);
                } else {
                    pg.put(index, pg.get(index) + coe);
                }
            }
        }
        int count = 0;
        if (pg.isEmpty()) {
            System.out.print("0 0");
        }
        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 0) {
                continue;
            }
            if (count == 0) {
                System.out.print(entry.getValue() + " " + entry.getKey());
            } else {
                System.out.print(" " + entry.getValue() + " " + entry.getKey());
            }
            count++;
        }

    }
}
