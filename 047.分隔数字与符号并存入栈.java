/**
 * 分隔数字与符号并存入栈
 */
package p2;
import java.util.Stack;
import java.util.StringTokenizer;

public class TestMain {

	public static void main(String[] args) {
		Stack<String> stack1=new MathStringToStack().value("1+2/81+18/6+3-1/8+181*8+2019");
		Stack<String> stack2 =new Stack<String>();//必须这样初始化
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop());
		}
	}

}

class MathStringToStack {

	Stack<String>  value(String str1) {
		Stack<String> stack2 = new Stack<String>();
		String Str2=str1.replace("+", " + ");
		Str2=Str2.replace("-", " - ");
		Str2=Str2.replace("*", " * ");
		Str2=Str2.replace("/", " / ");
		Str2=Str2.replace("(", " ( ");
		Str2=Str2.replace(")", " ) ");
		StringTokenizer toker=new StringTokenizer(Str2," ");
		while (toker.hasMoreElements()) {
			stack2.push(toker.nextElement().toString());
		}
		return stack2;
	}
}
/**输出
1+2/81+18/6+3-1/8+181*8+2019
 *
 */
