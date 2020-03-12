import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("tom",22);
        map1.put("edy",20);
        map1.put("edy",20);
        System.out.println(map1);
    }
}

//{tom=22, edy=20}
