package cc.ClassTest.java.java;
import org.apache.http.util.Args;

import javax.naming.InterruptedNamingException;
import java.util.*;

public class TestArgsWords {
    private static final int ONE = 1;

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < args.length; i++) {
            //Collection<Integer> freq = map.values();
            //Integer freq = (Integer) map.get(args[i]);
            //map.put(args[i],(freq == null ? ONE :new Integer(freq) + 1 ));
            if (map.containsKey(args[i])) {
                map.put(args[i], ONE);
            } else {
                int freq = map.get(args[i]);
                map.put(args[i], freq + 1);
            }
            System.out.println
                    (map.size() + " distinct words detected:");
            System.out.println(map);
        }
    }
}
