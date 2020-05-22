package cc.Collection.java;

import java.util.Collection;
import java.util.HashSet;


public class Test{
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1","l1"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1","l1")));
        System.out.println(c);
    }

}