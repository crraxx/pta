package day3;

import java.util.Arrays;
import java.util.Scanner;

public class 说反话 {
    /*
    输入格式：
    测试输入包含一个测试用例，在一行内给出总长度不超过500 000的字符串。字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用若干个空格分开。
    输出格式：
    每个测试用例的输出占一行，输出倒序后的句子，并且保证单词间只有1个空格。
    输入样例：
    Hello World   Here I Come
    输出样例：
    Come I Here World Hello
     */
    public static void main(String[] args) {
        String line =  "the sky is blue";
        System.out.println(reverseWords(line));
    }
    public static String reverseWords(String s) {
        StringBuffer anc = new StringBuffer();
        String[] str = s.trim().split(" +");
        for (int i = str.length - 1; i >= 0; i--) {
            anc.append(str[i]);
            if (i != 0) {
                anc.append("*");
            }
        }
        return anc.toString();
    }
}
