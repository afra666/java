/**
 * BigDecimal与int-double-string互转
 */
package p;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		double d1=2019.2;
		int i1=1024;
		char c1='z';
		String snum="2008.8";//只能是无空格数字
		BigDecimal big1=null;
		
		big1=BigDecimal.valueOf(d1);
		System.out.println(big1);
		big1=BigDecimal.valueOf(i1);
		System.out.println(big1);
		big1=BigDecimal.valueOf(c1);
		System.out.println(big1);
		big1=new BigDecimal(snum);
		System.out.println(big1);
	}
}
/**
 * 运行结果
2019.2
1024
122
2008.8
 */
