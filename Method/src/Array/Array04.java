package Array;
//数组作为方法参数。
//当调用方法的时候，向方法的小括号进行传参，传递进去其实是数组的地址值。
public class Array04 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        printArray(array);


        }
        /*
        三要素：
        返回值类型：只是打印，不需要计算，也没有结果，没有返回值
        方法名：随便 printArray
        参数列表：必须给一个数组，才能打印，int[]array;
         */
        public static void printArray(int[]array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }


}


