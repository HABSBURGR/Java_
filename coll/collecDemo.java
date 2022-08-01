package coll;

import java.util.*;

public class collecDemo {
    public static void main(String[] args) {
        LinkedList<String> d =new LinkedList<String>();
        d.add("hello");
        d.add("world");
        d.add("java");
        d.addFirst("122");
        for(int i=0;i<d.size();i++){
            System.out.println(d.get(i));
        }
    }
}
