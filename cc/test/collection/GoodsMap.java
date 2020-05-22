package cc.test.collection;
import cc.test.collection.*;

import java.util.*;

public class GoodsMap {
    public static void main(String[] args) {
        Goods goods1 = new Goods(1001,"新华字典",99,"新华出版社") ;
        Goods goods2 = new Goods(1003,"贪官落马记",199,"政治出版社");
        Goods goods3 = new Goods(1002,"一光年的距离有多远",78,"文艺出版社");
        Goods goods4 = new Goods(1004,"Java从零基础到全栈大师",256,"科技出版社");
        Goods goods5 = new Goods(1006,"新华大字典",109,"新华出版社");
        Goods goods6 = new Goods(1005,"贪官落马记",199,"政治出版社");

        Set<Goods> good = new HashSet<>();
        good.add(goods1);
        good.add(goods2);
        good.add(goods3);
        good.add(goods4);
        good.add(goods5);
        good.add(goods6);

        for (Goods E : good){
            System.out.println(E);
        }
    }
}