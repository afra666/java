package p;
import java.util.Iterator;
import java.util.Vector;
public class TestClass {
   public static void main(String args[]) {
	Vector<String> v=new Vector<String>();
	v.add("g");
	v.add("o");
	v.add("a");
	v.add("n");
	Iterator<String> iter=v.iterator();
		for (int i = 0; i < 2;i++) {
			System.out.println(iter.next());
		}
		System.out.println("@@@@@@@@");
		iter.remove();//词条语句执行完毕后v中指针元素已经删除
		iter=v.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
   }
}
/**
 * 
g
o
@@@@@@@@
g
a
n
 * 
 */
