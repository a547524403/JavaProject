package cc.Collection.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        for (int i = 0;i < 5;i++){
            set.add("a" + 1);
        }
        System.out.println(set);
        for (Iterator<String> iter = set.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp + "\t");
        }
        System.out.println();
        System.out.println(set);
    }
}
