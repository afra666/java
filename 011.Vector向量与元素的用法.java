package p;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {
		Vector<String> vct1=new Vector<String>();
		vct1.add("你");
		vct1.add("好");
		System.out.println(vct1);
		System.out.println(vct1.elementAt(0));
	}
}
/**输出结果
 * 
[你, 好]
你
 */

