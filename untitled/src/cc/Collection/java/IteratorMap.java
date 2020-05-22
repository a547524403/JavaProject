package cc.Collection.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("A","高七");
        map.put("B","高小七");
        Set<Map.Entry<String,String>>  ss = map.entrySet();
        for (Iterator<Map.Entry<String,String>> iterator = ss.iterator(); iterator.hasNext();){
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
