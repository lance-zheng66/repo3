package Arrays;
/*
题目：
计算在-10.8和到5.9之间，绝对值大于6，或者小于2.1 的整数有多少个？

思路：
1.已经确定了范围就使用for循环
2.起点位置-10.8，应该转换成-10，两种办法：
 2.1 可以使用Math.celi方法，向上（向正方向)去整
 2.2 强转成为 int，自动舍弃所有小数位
3.每一个数字都是整数，所以步进表达式应该是num++.每次这样都是+1的；
4.如何拿到绝对值： Math.abs方法
5。 一旦发现一个数字，需要让计数器++进行统计.
6.如果使用Math.ceil方法，-10.8可以变成-10.0.注意double也是可以进行++的；
 */

public class Math01 {
    public static void main(String[] args) {
        int count =0;
        double min =-10.8;
        double max =5.9;
        //这样处理，变量i就是区间之间所有的整数
      //  for(int i = (int)min;i<max;i++){
          for(double i=Math.ceil(min);  i<Math.ceil(max);i++)  {
            double abs =Math.abs(i);//绝对值
            if(abs >6||abs<2.1){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("总共有"+count+"次");
    }
}
