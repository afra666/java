package p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        br=new BufferedReader(new FileReader("D:\\hello.txt"));
        String st;
        while ((st=br.readLine())!=null){
            System.out.println(st);
        }
    }
}
