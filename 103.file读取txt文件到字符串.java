import java.io.*;

public class ReadFile {
    public static void main(String args[]) throws IOException {
        String filePath = "./r.txt";
        FileInputStream fin = new FileInputStream(filePath);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp = "";
        while ((strTmp = buffReader.readLine()) != null) {
            String s=strTmp;
            System.out.println(s);
        }
        buffReader.close();
    }
}
