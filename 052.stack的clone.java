package p3;

import java.math.BigDecimal;
import java.util.Stack;

public class C3{
	public static void main(String[] args) {
		String []str= {"2","3","+"};
		Stack<String> inputStk1=new Stack<String>();
		Stack<String> inputStk2=new Stack<String>();
		
		for (int i = 0; i < str.length; i++) {
			inputStk1.push(str[i]);
		}
		inputStk2=(Stack<String>) inputStk1.clone();
		inputStk2.pop();
		BigDecimal bigA=new BigDecimal(inputStk2.pop());
		BigDecimal bigB=new BigDecimal(inputStk2.pop());
		BigDecimal bigC;
		System.out.println(bigA.toString());
		System.out.println(bigB.toString());
		System.out.println();
	}
}
/**
3
2
*/
