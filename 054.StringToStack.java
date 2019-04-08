package p3;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String sAr[]= {"0","大","山","人","t","b","max"};
		Stack<String> stk1=new StrArToStk().zeroEleOnBottom(sAr);
		Stack<String> stk2=new StrArToStk().maxEleOnBottom(sAr);
		for (int i = 0; i < sAr.length; i++) {
			System.out.println(stk1.pop());
		}
		for (int i = 0; i < sAr.length; i++) {
			System.out.println(stk2.pop());
		}
		
	}

}
class StrArToStk{

	
	Stack<String> zeroEleOnBottom(String []sAr) {
		Stack<String> value=new Stack<String>();
		for (int i = 0; i < sAr.length; i++) {
			value.push(sAr[i]);
		}
		return value;
	}
	Stack<String> maxEleOnBottom(String []sAr) {
		Stack<String> value=new Stack<String>();
		for (int i =sAr.length-1; i>=0 ; i--) {
			value.push(sAr[i]);
		}
		return value;
	}
}
/**
 * 输出值*
 max
b
t
人
山
大
0
0
大
山
人
t
b
max
 */
