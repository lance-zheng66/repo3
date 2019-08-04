package MethodOverload;
/*
题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
并在main方法中进行测试

 */

public class isSame {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(Same(a,b));
        //System.out.println(Same((short)10,(short）20);
        System.out.println(Same(10,20));
        System.out.println(Same(10L,20L));

    }

    public static boolean Same(byte a, byte b){
        System.out.println("两个byte参数的方法执行");
        boolean same;
        if (a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }
    public static boolean Same(short a,short b){
        System.out.println("两个short参数的方法执行");
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean Same(int a,int b ){
        System.out.println("两个int参数的方法执行");
        return a==b;
    }
    public static boolean Same(long a,long b){
        System.out.println("两个long参数的方法执行");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
/*
四种判断两个数值大小的思路；
 */


