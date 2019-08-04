package Array;
//数组元素反转
public class Array03 {
    public static void main(String[] args) {
        int[]array={10,20,30,40,50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*
        初始化语句：int min=0,max=array.length-1;
        条件判断语句：min<max;
        步进表达式：min++，max--;
        循环体：用第三个变量倒手；
         */
        for (int min=0,max=array.length-1;min<max;min++,max--) {
            int temp = array[min];
            array[min]=array[max];
            array[max]=array[temp];
        }
    }


}
