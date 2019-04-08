//输出：2.0
package p3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;

public class C3{
	public static void main(String[] args) {
		/**
		 * 传入值：Stack<String> stkRPN栈，传出：bigdecimal ： RPNtoNum(stkRPN).bigResult;
		 */
		String []strArRPN= {"3","1.5","/"};
		Stack<String> stkRPN=new Stack<String>();
		for (int i = 0; i < strArRPN.length; i++) {//RPN最左边入栈低
			stkRPN.push(strArRPN[i]);
		}
		BigDecimal resulBigNum=new RPNtoNum(stkRPN).bigResult;
		System.out.println(resulBigNum.toString());
		
		/**
		 * 传入值：数组RPNStrIn{"3","1.5","/"};传出：bigdecimal ： RPNtoNum(stkRPN).bigResult;
		 */
//		String []strArRPN2= {"3","1.5","/"};
//		BigDecimal resulBigNum2=new RPNtoNum(strArRPN2).bigResult;
//		System.out.println(resulBigNum2.toString());
//		
		
		
	}
}
class RPNtoNum{
	
	
	BigDecimal bigResult=new BigDecimal(0);
	
	
	public RPNtoNum(Stack<String> inStk) {//传入值Stack<String> StrStkIn，属性赋值BigDecimal bigResult;
		Stack<BigDecimal> bigStkResult=new Stack<BigDecimal>();//存放最终结果栈bigStk
		Stack<String> inStkReverse=new ReverseStk(inStk).value;//反向RPN栈
		BigDecimal big1stPOP=new BigDecimal(0);//存入先弹
		BigDecimal big2ndPOP=new BigDecimal(0);//存入后弹
	while (!inStkReverse.isEmpty()) {
		switch (inStkReverse.peek()) {
		case "+":
			inStkReverse.pop();
			big1stPOP=bigStkResult.pop();
			big2ndPOP=bigStkResult.pop();
			bigStkResult.push(big2ndPOP.add(big1stPOP));
			break;
		case "-":
			inStkReverse.pop();
			big1stPOP=bigStkResult.pop();
			big2ndPOP=bigStkResult.pop();
			bigStkResult.push(big2ndPOP.subtract(big1stPOP));
			break;
		case "*":
			inStkReverse.pop();
			big1stPOP=bigStkResult.pop();
			big2ndPOP=bigStkResult.pop();
			bigStkResult.push(big2ndPOP.multiply(big1stPOP));
			break;
		case "/":
			inStkReverse.pop();
			big1stPOP=bigStkResult.pop();
			big2ndPOP=bigStkResult.pop();
			int n=Math.max(
					(big1stPOP.stripTrailingZeros().scale()),
					(big2ndPOP.stripTrailingZeros().scale())
					);
			bigStkResult.push(big2ndPOP.divide(big1stPOP,n,RoundingMode.HALF_UP));break;
		default:bigStkResult.push(new BigDecimal(inStkReverse.pop()));break;
		}
		
		
	}
	bigResult=bigStkResult.pop();//不能用peek，只能用pop(),否则会while循环
	
		
		
}
class ReverseStk{
	Stack<String> value=new Stack<String>();
	public ReverseStk(Stack<String> strStkIn) {
		int strStkSize=strStkIn.size();
		
		for (int i = 0; i <strStkSize; i++) {
			this.value.push(strStkIn.pop());
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
//	public RPNtoNum(String []inputArRPN) {//传入值String []strArIn，属性赋值BigDecimal bigResult;
////		BigDecimal []bigAr=new BigDecimal[inputArRPN.length];
//		BigDecimal []bigAr = null;
//		int flag=0;
//		for (int i = 0; i < inputArRPN.length; i++) {
//			switch (inputArRPN[i]) {
//			case "+":break;
//			case "-":break;
//			case "*":break;
//			case "/":break;
//
//			default:bigAr[bigAr.length]=new BigDecimal(inputArRPN[i]);break;
//			}
//		}
//	}
	
}
