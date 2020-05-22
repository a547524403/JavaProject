package cc.Collection.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        for (int i = 0;i < 5;i++){
            alist.add("a" + 1);
        }
        System.out.println(alist);
        for (Iterator<String> iter = alist.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp +"\t");
            if (temp.endsWith("3"));
            iter.remove();;
        }
        System.out.println();
        System.out.println(alist);
    }
}