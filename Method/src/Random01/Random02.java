package Random01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

/*
用代码模拟猜数的小小游戏
思路：
1。首先需要产生一个随机数字，并且一旦产生不在变化。用Random的nextInt();
2.需要键盘输入所以用到了，所以用到了Scanner；
3.获取键盘输入的数字，用Scanner当中的next.Int();
4.已经得到了两个数字，判断一下if():
如果太大了，提示太大，并且重试
如果太小了，提示太小，并且重试
如果猜中了，游戏结束
5.重试就是再来一次就是循环，循环次数不确定，用while（true）
 */
public class Random02 {
    public static void main(String[] args) {
        Random r = new Random();
        int RandomNum = r.nextInt(100) + 1;//[1,100]
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

                System.out.println("请输入你的猜测的数字");
                int guessNum = sc.nextInt();//键盘输入猜测的数字

                if (guessNum > RandomNum) {
                    System.out.println("太大了，请重试");
                } else if (guessNum < RandomNum) {
                    System.out.println("太小了，请重试");
                } else {
                    System.out.println("恭喜你猜中了");
                    break;//如果猜中不再重试
                }

            }
            System.out.println("游戏结束");
        }
    }
