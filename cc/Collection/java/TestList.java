package cc.Collection.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void test01(){
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("高七");
        System.out.println(list.isEmpty());

        list.add("高小七");
        list.add("高小八");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.contains(list.remove("高七")));

        System.out.println(list);

        Object objs = list.toArray();
        System.out.println(Arrays.toString((Object[]) objs));

        list.clear();
        System.out.println(list);
    }

    public static void main(String[] args) {
        test01();
    }
}
