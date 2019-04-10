package p;

import java.util.HashMap;

public class TestMain {
    public static void main(String[] args) {
       HashMap<String,Double> m=new HashMap<String,Double>();
       m.put("good",1.01);
       m.put("morning",3.86);//put(key不可重复，value可重复)
       m.put("Alice",5.99);
       System.out.println(m);
       System.out.println(m.get("Alice"));//get(key)
    }
}
/**
 输出*
{Alice=5.99, good=1.01, morning=3.86}
5.99
 */
