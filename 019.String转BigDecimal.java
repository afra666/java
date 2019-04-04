/**
 * String转BigDecimal 只有不带空格的数字才能转
 */
package p;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		
		String str1=new String("3.14156");
		String str2=new String(" 3.14156");
		try {
			BigDecimal bd1=new BigDecimal(str1);
			System.out.println("bd1="+bd1);
			BigDecimal bd2=new BigDecimal(str2);
			System.out.println("bd2"+bd2);
		} catch (Exception e) {
			System.out.println("输入格式有误");
		}
	}
}
/**输出

bd1=3.14156
输入格式有误
*/


/**
 * BigDecimal转String
 */
package p;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		BigDecimal bd1=new BigDecimal("3.141592");//不加引号会输出很多位
		String str1=null;
		System.out.println("str1="+bd1.toString());
		}
}

/**输出
str1=3.141592
*/
