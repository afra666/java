/**
 * String转BigDecimal
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
