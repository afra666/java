package p;
import java.util.HashMap;
import java.util.Map;

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
  }
}
/**
 输出*
[9.6=value3, 1.2=value5, 9.3=value2, 1.3=value6, 1.1=value4, 9.9=value1]
 */
