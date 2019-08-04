package ArrayList;
/*
题目：
定义一个数组。用来存储3个penson对象
 */

public class ArrayList01 {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放penson类型的对象
        penson[]array=new penson[3];
        //System.out.println(array[0]);默认值是null;
        //创建3个对象
        penson one=new penson("林允儿",18);
        penson two=new penson("刘亦菲",30);
        penson three=new penson("范冰冰",35);

        //将one中的地址值赋值到数组的零号元素位置；
        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
/*将penson 创建了一个对象y，并将penson数组1号元素赋值给y对象
        penson y=array[1];
        System.out.println(y.getName());
      也可以写成如下：*/
        System.out.println(array[1].getName());

    }
}
