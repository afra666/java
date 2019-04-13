/**
 * Attention  OVERWRITE
 */
package p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestMain {
	public static void main(String[] args) {
		File file=new File("map1/01.map");
		File fileCopy=new File("map1/01Copy.map");
		try {
			if (fileCopy.exists()) {
			System.out.println("Can't copy.fileCopy is already exist");
			}
			else {
				BufferedReader myReader=new BufferedReader(new FileReader(file));//use "/"
				BufferedWriter myWriter=new BufferedWriter(new FileWriter(fileCopy));//attention OVERWRITE
				String strLine;
				while ((strLine=myReader.readLine())!=null) {
					myWriter.write(strLine);
				
					myWriter.newLine();// start a new line
					myWriter.flush();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






/**
 * 2:Attention  OVERWRITE
 */
package p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestMain {
	public static void main(String[] args) {
		try {
			BufferedReader myReader=new BufferedReader(new FileReader("map1/01.map"));//use "/"
			BufferedWriter myWriter=new BufferedWriter(new FileWriter("map2/01.map"));//attention OVERWRITE
			String strLine;
			while ((strLine=myReader.readLine())!=null) {
				myWriter.write(strLine);
				myWriter.newLine();// start a new line
				myWriter.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
