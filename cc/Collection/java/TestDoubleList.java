package cc.Collection.java;

import java.util.ArrayList;
import java.util.List;

public class TestDoubleList {
    public static void main(String[] args) {
        test02();
    }

    public static void test02(){
        List<String> list = new ArrayList<>();
        list.add("高七");
        list.add("高小七");
        list.add("高小八");

        List<String> list2 = new ArrayList<>();
        list2.add("高七");
        list2.add("张三");
        list2.add("李四");

        System.out.println(list.containsAll(list2));
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        list.retainAll(list2);
        System.out.println(list);
    }
}
