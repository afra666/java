package p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMain {
  public static void main(String[] a) {
    Map<Double,String> m = new HashMap<Double,String>();
    m.put(9.9, "value1");
    m.put(9.3, "value2");
    m.put(9.6, "value3");
    m.put(1.1, "value4");
    m.put(1.2, "value5");
    m.put(1.3, "value6");
    System.out.println(m.entrySet());//打印入口
    Iterator<Entry<Double, String>> iter = m.entrySet().iterator();
//    Map.Entry<Double, String> et=iter.next();
    System.out.println(iter.next().getKey() + " -XX- " + iter.next().getValue());
    System.out.println(iter.next().getKey() + " -- " + iter.next().getValue());
    System.out.println(iter.next().getKey() + " -- " + iter.next().getValue());   
    
  }
}
/**
 输出*
[9.6=value3, 1.2=value5, 9.3=value2, 1.3=value6, 1.1=value4, 9.9=value1]
9.6 -XX- value5
9.3 -- value6
1.1 -- value1
 */
