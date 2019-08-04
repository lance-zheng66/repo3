package String;

import java.util.ArrayList;
import java.util.Scanner;

/*
输入一个字符串，统计其中出现的各种字符的次数
种类有：大写字母，小写字母，数字其他

思路：
1.既然用到键盘输入，肯定是Scanner；
2.键盘输入的是字符串，那么 String str = sc.next（）；
3.定义四个变量，分别带代表字符各自出现的字数
4.需要对应字符串，一个字，一个字检查，String---->char[],方法就是toCharArray
5.遍历char[]字符数组，对当前的字符的种类进行判断，并且用四个变量++动作。
6.打印输出四个变量，分别代表四种字符出现次数。
 */
public class String03 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();//获取键盘输入的一个字符串

        int countUpper = 0;
        int countNumber= 0;
        int countOhter =0;
        int countLower = 0;

        char[] charArray = input.toCharArray();

        String a =" ";//定义一个空字符串
        String b =" ";
        String c =" ";
        String d =" ";

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//当前单个字符
            if('A'<= ch && ch<='Z' ){
                a+=ch;//拼接所有相同字符的类型；
                countUpper++;
            }else if ('a'<=ch && ch<='z'){
                b+=ch;
                countLower++;
            }else if('0'<=ch && ch <='9'){
                c+=ch;
                countNumber++;
            }else {
                d+=ch;
                countOhter++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有"+countLower);;
        System.out.println("数字有"+countNumber);
        System.out.println("其他字有"+countOhter);


    }
}
