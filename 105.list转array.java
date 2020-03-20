package p;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tmp {
    public static void main(String args[]){
        List list = new ArrayList<String>();
        list.add("ab");
        list.add("cd");
        list.add("ef");
//        String[] strArr = (String[]) list.toArray();//这里会报类型转换异常
        String[] array = (String[]) list.toArray(new String[list.size()]);
        for(String s:array){
            System.out.println(s);
        }
    }
}
