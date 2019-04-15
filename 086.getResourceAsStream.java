/**
src
 |------|------|
        TestMain.java
        map2019
        |------|
               0.map
               1.map
*/


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
		
			InputStream in=TestMain.class.getResourceAsStream("map2019/1.map");
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
			
			System.out.println(strAll);
			JFrame f1=new JFrame("alpha");
			f1.setBounds(300, 200, 500, 600);
			f1.setVisible(true);
			TextField t1=new TextField();
			t1.setText(strAll);
			f1.add(t1);
	}
}
/**effect:
 *input:

 *output:

 *end
 */
 //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011100000000000000000141000000000000001111310000000000000014235111000000000000111323410000000000000012111100000000000000141000000000000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
