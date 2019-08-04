package Scanner01;
/*
键盘输入3个int数字，然后比较其中的最大值
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b= sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();


        int temp=a>b?a:b;
        int max=temp>c?temp:c;

        System.out.println("最大值是"+max);

        }
        }
