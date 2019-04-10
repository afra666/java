package p;

import java.util.HashMap;

public class TestMain {
    public static void main(String[] args) {
       HashMap<Double,String> m=new HashMap<Double,String>();
       m.put(1.01,"good");
       m.put(1.01,"morning");//put(key若重复则覆盖，value可重复)
       m.put(5.99,"Alice");
       System.out.println(m);
       System.out.println(m.get(1.01));//get(key)
      
    }
}
/**
 输出*
{1.01=morning, 5.99=Alice}
morning
 */
