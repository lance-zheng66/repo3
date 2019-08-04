package ArrayList;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，并添加到集合，遍历
思路：
1.自定义一个学生类，4个部分
2.创建一个集合用来创建学生对象 泛型<student>;
3.根据类，创建4个学生对象并且赋值；添加到集合当中add,
4.遍历集合。for，size,get
 */
public class Arraylist03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("刘亦菲", 19);
        Student two = new Student("林允儿", 18);
        Student three = new Student("刘德华", 19);
        Student four = new Student("古天乐", 18);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu =list.get(i);//根据类创建对象
            System.out.println("姓名"+stu.getName()+",年龄"+stu.getAge());//

        }
    }
}
