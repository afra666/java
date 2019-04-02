



/**
 * BigDecimal的输入输出
 */
package p;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		BigDecimal one=new BigDecimal(1);
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入b1:");
		BigDecimal b1=scanner.nextBigDecimal();
		System.out.println("请输入b2:");
		BigDecimal b2=scanner.nextBigDecimal();
		//BigDecimal b2=new BigDecimal(3);	
		
		int n=Math.max(
				(b1.stripTrailingZeros().scale()),
				(b2.stripTrailingZeros().scale())
				);
		scanner.close();
		BigDecimal add,subtract,multiply,divide,remainder;//加减乘除余
		
		//加减乘除余赋值
		add           = b1.add(b2)    ;
		subtract      = b1.subtract(b2)   ;
		multiply      = b1.multiply(b2)   ;
		divide        = b1.divide(b2,n,RoundingMode.HALF_UP)   ;
		remainder     = b1.remainder(b2)   ;
		
		//输出
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("最长精度为：                                                                  "+n);
		System.out.println("###b1="+b1);
		System.out.println("b1的正负sign判断：\n"+b1.signum());
		//System.out.println("b1的标度scale判断："+b1.scale());
		System.out.println("b1去尾数零后标度scale判断：\n"+b1.stripTrailingZeros().scale());
		System.out.println("###b2="+b2);
		System.out.println("b2的正负sign判断："+b2.signum());
		//System.out.println("b2的标度scale判断："+b2.scale());
		System.out.println("b2去尾数零后标度scale判断："+b2.stripTrailingZeros().scale());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("b1+b2="+add);
		System.out.println("b1-b2="+subtract);
		System.out.println("b1*b2="+multiply);
		System.out.println("(四舍五入)\nb1/b2="+divide);
		if ((b1.stripTrailingZeros().scale()==0)&&(b2.stripTrailingZeros().scale()==0)) {
			System.out.println("b1%b2="+remainder);
		}
		else {
			System.out.println("b1%b2=不存在");
		}
		
	}

}
/**
请输入b1:
2.1
请输入b2:
1
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
最长精度为：                                                                  1
###b1=2.1
b1的正负sign判断：
1
b1去尾数零后标度scale判断：
1
###b2=1
b2的正负sign判断：1
b2去尾数零后标度scale判断：0
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
b1+b2=3.1
b1-b2=1.1
b1*b2=2.1
(四舍五入)
b1/b2=2.1
b1%b2=不存在

*/
