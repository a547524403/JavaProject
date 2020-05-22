package cc.Collection.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMap2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("A","高七");
        map.put("B","高小七");
        Set<String> ss = map.keySet();
        for (Iterator<String> iterator = ss.iterator();iterator.hasNext();){
            String key = iterator.next();
            System.out.println(key + "-" +  map.get(key));
        }
    }
}
