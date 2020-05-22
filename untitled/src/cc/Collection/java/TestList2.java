package cc.Collection.java;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {
    public static void main(String[] args) {

    }

    public static void test03(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2,"高");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,"C");
        System.out.println(list);
        System.out.println(list.get(1));

        list.add("B");
        System.out.println(list);

        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));
    }
}
