package p;

import java.io.File;
import java.io.IOException;

public class TestMain {

	public static void main(String[] a) {
		String str=("D:/test1.txt");
		File file=new File(str);
		try {
			if (file.createNewFile()) {
				System.out.println("Succeed !");
			}
			else {
				System.out.println("Failed,Exists a file with same name.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
/**
 输出*
Succeed !
Failed,Exists a file with same name.
 */
