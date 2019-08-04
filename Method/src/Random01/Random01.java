package Random01;
/*根据int变量n的值来获取随机数字，范围是[1,n],可以取到1也可以取到n。

思路：
1，定义一个int变量n随机赋值；
2，使用random类，导包，创建，使用。
3.如果写10，那么就是0~9，然而想要的是1~10.那么发现整体加一即可；
4.打印随机数字
*/
import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        int n = 5;
        Random r=new Random();

        // r.nextInt(n);//0~n-1,
        for (int i = 0; i < 100; i++) {
            int result=r.nextInt(n)+1;//本来范围是[0,n），整体加1就变成[1,n+1)也就是[1,n]
            //如果将+1写在括号里，那么范围是[0,n+1);也就是[0,5]
            System.out.println(result);
        }

    }
}
