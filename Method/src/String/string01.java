package String;
/*
1.题目：定义一个方法，把一个数组{1,2,3,}按照指定格式拼接成一个字符串。格式参照：[word#word#word];

分析：
1.首先准备一个int[]数组，内容是1,2,3
2.定义一个ff，用来将数组变成字符串；
三要素：
返回值：String;
方法：fromArray
参数列表：int[];
3.格式：[word#word#word]
用到：for循环，字符串拼接、每个数组环境之前都有一个word字样；区分一下是不是最后一个
4.调用方法，得到返回值，并打印结果字符串


 */

public class string01 {
    public static void main(String[] args) {
        int[]array={1,2,3};

        String result =fromArray(array);
        System.out.println(result);

    }
    public static String  fromArray(int[]array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str += "word"+array[i]+"]";
            }

            str +="word"+array[i]+"#";
        }
        return str;
    }
}
