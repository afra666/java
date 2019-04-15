/**
src
 |------|
 	Main.java
	myMap
*/



//main
package p;

public class Main {
	public static void main(String[] args) {

		int [][]levelAr=new int[14][16];
		levelAr=new ReadMap(1).getMap();
		for (int line = 0; line < levelAr.length; line++) {
			if (line!=0) {
				System.out.println();
			}
			for (int col = 0; col < levelAr[0].length; col++) {
				System.out.print(levelAr[line][col]);
			}
		}
	}
}

//sub
package p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**effect:
 *input:

 *output:

 *start
 */

public class ReadMap {
	public int [][]levelAr= new int[14][16];
	public ReadMap(int level) {
		InputStream in=ReadMap.class.getResourceAsStream("myMap/"+level+".map");
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
	
		for (int line = 0; line < levelAr.length; line++) {
			if (line!=0) {
				System.out.println();
			}
			for (int col = 0; col < levelAr[0].length; col++) {
				levelAr[line][col]=Integer.valueOf((String) strAll.subSequence(line*16+col, line*16+col+1));
				
				System.out.print(levelAr[line][col]);
			}
			
		}
	}
	int [][]getMap(){
		return this.levelAr;
	}
}
/**effect:
 *input:

 *output:

 *end
 */
