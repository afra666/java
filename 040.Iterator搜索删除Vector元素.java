/**
 * 搜索并删除madehua,正确写法1,使用hasNext
 */
package p;
import java.util.Iterator;
import java.util.Vector;
public class TestClass {
	public static void main(String args[]) {
		Vector<String> v=new Vector<String>();
		Vector<String> v2=new Vector<String>();
		v.add("liudehua");
		v.add("madehua");
		v.add("liushishi");
		v.add("tangwei");
		Iterator<String> iter=v.iterator();
		while(iter.hasNext()) { 			//大多情况会使用.hasNext
			if (iter.next()=="madehua") {
				iter.remove();
			}
		}
		System.out.println(v);
	}
}
/**
[liudehua, liushishi, tangwei]
 */



/**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 * Iterator搜索并删除madehua正确写法2
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

/**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[e, a, d]
*/
/**
 * 搜索并删除madehua,正确写法3
 */
package p;
import java.util.Iterator;
import java.util.Vector;
public class TestClass {
	public static void main(String args[]) {
		Vector<String> v=new Vector<String>();
		v.add("liudehua");
		v.add("madehua");
		v.add("liushishi");
		v.add("tangwei");
		
		for (Iterator<String> iter=v.iterator();iter.hasNext();) {
			String s=iter.next();
			if (s.equals("madehua")) {
				iter.remove();
			}
		}
		System.out.println(v);
	}
}
/**
[liudehua, liushishi, tangwei]
 */


！/**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
！ * 搜索并删除madehua,错误写法
！ */
！//package p;
！//import java.util.Iterator;
！//import java.util.Vector;
！//public class TestClass {
！//   public static void main(String args[]) {
！//	Vector<String> v=new Vector<String>();
！//	v.add("liudehua");
！//	v.add("madehua");
！//	v.add("liushishi");
！//	v.add("tangwei");
！//	for (Object s:v) {
！//		if (s=="madehua") {
！//			v.remove("madehua");
！//		}
！//	}
！//	System.out.println("madehua");
！//   }
！//}
！//
