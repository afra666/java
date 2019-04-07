/**
 * 分隔数字与符号并存入字符串数组
 */
package p2;
import java.util.StringTokenizer;
public class TestMain {
	public static void main(String[] args) {
		String []output=new MathStringToStringArray().valueOf("1+8+6*7/8548-654*(2165-9 )");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
	}
	}
}


class MathStringToStringArray {
	String  []valueOf(String str1) {
		String str2;
		
		str2=str1.replace("+", " + ");
		str2=str2.replace("-", " - ");
		str2=str2.replace("*", " * ");
		str2=str2.replace("/", " / ");
		str2=str2.replace("(", " ( ");
		str2=str2.replace(")", " ) ");
		StringTokenizer toker=new StringTokenizer(str2," ");
		String []strAr3 = new String[toker.countTokens()];//此时确定长度,这里不能用length方法，否则报错
		for (int i = 0; toker.hasMoreElements(); i++) {
			strAr3[i]=toker.nextElement().toString();
		}
		return strAr3;
	}
}
/**输出
1+8+6*7/8548-654*(2165-9)
 */


