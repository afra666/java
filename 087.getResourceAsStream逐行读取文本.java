package p;

import java.awt.TextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;

/**effect:
 *input:

 *output:

 *start
 */
public class TestMain extends JFrame{
	public static void main(String []args){
		
			InputStream in=TestMain.class.getResourceAsStream("myMap/1.map");
			BufferedReader r=new BufferedReader(new InputStreamReader(in));
			String strLine;
			String strAll = "";
			try {
				while ((strLine=r.readLine())!=null) {
					
					strAll+=strLine;
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			final int lineMax=16,colMax=14;
			for (int n = 0; n <14*16; n++) {//column=16
				if ((n%16==0)&&(n!=0)) {
					System.out.println();
				}
				System.out.print(strAll.charAt(n));
			}
			
	}
}
/**effect:
 *input:

 *output:

 *end
 */
