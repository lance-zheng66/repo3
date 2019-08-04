package ArrayList;
/*
定义一个指定格式打印集合的方法(Arraylist类型作为参数)，使用{}括起来
格式参照{元素@元素@元素}
System.out.println(list);[10,20,30]
printArrayList(list),{10@20@30}
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Arraylist07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("雷锋");
        list.add("刘云");
        list.add("张三丰");
        list.add("李四");
        System.out.println(list);
        /*
        方法三要素：
        返回值类型：只是进行打印，没有计算，没有结果；所以用void方法；
        方法名：printArraylist
        参数列表：Arraylist

         */
        printArraylist(list);
    }

        public static void printArraylist(ArrayList<String> list) {
            System.out.print("{");
            for (int i = 0; i < list.size(); i++) {
                String name = list.get(i);
                if (i == list.size() - 1) {
                    System.out.print(name + "}");
                } else {
                    System.out.print(name + "@");
                }

            }
        }
    }

