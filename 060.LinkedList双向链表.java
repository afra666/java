package p;

import java.util.LinkedList;

public class Main {
	
	public static void main(String []args) {
		LinkedList<String> lisStr=new LinkedList<String>();
		lisStr.add("one");
		lisStr.add("two");
		lisStr.add("three");
		lisStr.add("four");
		System.out.println(lisStr.size());
		lisStr.remove(0);
		lisStr.remove(2);
		System.out.println(lisStr);
		System.out.println(lisStr.size());
		
	}
}
/**输出：
4
[two, three]
2
*/
