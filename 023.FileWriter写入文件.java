package p;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String []args) {
		try {
			FileWriter fw=new FileWriter("demo.txt");
			fw.write("Hello World !");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
