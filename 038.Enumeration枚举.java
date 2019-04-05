package p;
import java.util.Enumeration;
import java.util.Vector;
public class TestClass {
 
   public static void main(String args[]) {
	   Vector<String> vStr=new Vector<String>();
	   Enumeration<String> eStr;
	   vStr.add("a");
	   vStr.add("1");
	   vStr.add("好");
	   eStr=vStr.elements();
	   while (eStr.hasMoreElements()) {
		System.out.println(eStr.nextElement());
	}
   }
}
/**
 */	
