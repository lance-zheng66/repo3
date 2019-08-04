package jiCHENG;

import java.util.ArrayList;

public class Shouhongbao {

    public static void main(String[] args) {
        Manager manager =new Manager("群主",100);

        Menber one = new Menber("成员A",0);
        Menber two = new Menber("成员B",0);
        Menber three = new Menber("成员c",0);

        manager.show();
        one.show();
        two.show();
        three.show();
//群主总共发20块钱，分成3个红包
        ArrayList<Integer> redlist = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();
        one.show();
        two.show();
        three.show();
    }





}
