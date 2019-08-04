package Array;
//求出数组当中的最值
public class Array02 {
    public static void main(String[] args) {
        int []array02={10,20,30,40,50};
        int max=0;
        for (int i = 1; i < array02.length; i++) {
            //如果当前元素比max大，max则换为当前元素
            if(array02[i]>max){
                max=array02[i];
            }
        }
        System.out.println("最大值："+max);

    }
}
