package ArrayList;

/*
题目：
用一个大集合存入20个随机数字，筛选出偶数，放到小集合当中
要求使用自定义的方法来筛选；
思路：
1.需要创建一个集合，来存储 int 数字
2.随机数字就用Random nextInt;
3.循环20次，把随机数字放入大集合 for循环， add方法，、
4.定义一个方法，用来进行筛选；
筛选：根据大集合，筛选符合要求的元素，得到小集合b
方法三要素：
返回值类型：ArrayList 小集合（里面元素个数不确定）
方法名称：getSamllList
参数列表： ArrayList 大集合（装着20个随机数字）
5.判断是不是偶数;num%2==0;
6.如果是偶是就放大小集合当中。
 */

import java.util.ArrayList;
import java.util.Random;

public class Arraylist05 {
    public static void main(String[] args) {
        ArrayList<Integer>bigList=new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num= r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> samllList=getSamllList(bigList);
        for (int i = 0; i < samllList.size(); i++) {
            System.out.println(samllList.get(i));

        }
    }
    //这个方法接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSamllList(ArrayList<Integer>bigList){
        //创建一个小集合，用来装偶数结果；
        ArrayList<Integer>samllList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num =bigList.get(i);
            if(num%2==0){
                samllList.add(num);
            }

        }
        return samllList;

    }
}

