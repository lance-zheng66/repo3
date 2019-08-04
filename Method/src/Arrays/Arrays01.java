package Arrays;
/*
题目：将一个随机字符串中的所有的字符升序排列，并倒序打印
 */

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String str="qwdahciahcahhlpjp123";

        //首先进行升序排列：
        //必须要是一个数组，才能用Arrays.sort方法
        // string------>变成一个数组，用toCharryArray;
        char[]chars=str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列
        //需要倒序遍历
        for (int i = chars.length-1; i>=0; i--) {
            System.out.println(chars[i]);



        }
    }
}
