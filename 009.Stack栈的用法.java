package p;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		String str0=new String("花自飘零水自流。");
		String str1=new String("一种相思，");
		String str2=new String("两处闲愁。");
		stk.push(str0);
		stk.push(str1);
		stk.push(str2);
		System.out.println("栈中所有元素为："+stk);
		System.out.println(stk.elements().nextElement());
		while (!(stk.empty())) {
			System.out.println(stk.pop());
		}
	}
}
