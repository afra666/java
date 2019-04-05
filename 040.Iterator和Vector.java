/**
 * Iterator
 * 
 */

package p;

import java.util.Iterator;
import java.util.Vector;

public class TestMain{
	 public static void main(String args[])
	 {
		 Vector<String> v1=new Vector<String>();
		 Vector<String> v2=new Vector<String>();
	  v1.add("r");
	  v1.add("e");
	  v1.add("a");
	  v1.add("d");
	  Iterator<String> iter=v1.iterator();
	  iter.next();
	  iter.remove();
	  v2=v1;
		System.out.println(v2);
	 }
}

/**
[e, a, d]
*/
