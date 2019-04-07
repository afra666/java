/**
输出
512+4*+3-
5 1 2 + 4 * + 3 - 
 */
package p2;
import java.util.Stack;
import java.util.StringTokenizer;
public class C1 {
	public static void main(String[] args) {
		String []input=new MathFormat().valueOf("5 + ((1 + 2) * 4) - 3");
		
		/**
		 * 
		 */
		String []outputAr=new RPN(input).outputAr;//字符串数组模式
		for (int i = 0; i < outputAr.length; i++) {//这是数组不是栈，可以使用。length属性
			System.out.print(outputAr[i]);
		}
		System.out.println();
		
		
		/**
		 * 字符串加空格模式
		 */
		System.out.println(new RPN(input).outputStr);

		
		

	}
}
class RPN{
	Stack<String> numStk=new Stack<String>();//堆栈（逆序）
	Stack<String> opStk=new Stack<String>();
	String []outputAr;//正序
	String outputStr;//正序
	
	RPN(String []input){
		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {                  
			case "+":popJudge(input[i],1);break; 
			case "-":popJudge(input[i],1);break; 
			case "*":popJudge(input[i],2);break; 
			case "/":popJudge(input[i],2);break; 
			case "(":opStk.push(input[i]);break; //左括号直接push
			case ")":
				while (!opStk.isEmpty()) {//处理右括号，一直pop到顶部为左括号为止
					if (opStk.peek().equals("(")) {opStk.pop();break;}
					else {numStk.push(opStk.pop());}
				}
				break; 
			default:numStk.push(input[i]);break; 
			}//switch
		}
		while (!opStk.isEmpty()) {
			if (opStk.peek()=="(") {
				opStk.pop();
			}
			numStk.push(opStk.pop());
		}
		int opStkSize=numStk.size();
		outputAr=new String[numStk.size()];
		for (int i =opStkSize-1; i>=0; i--) {
			outputAr[i]=(numStk.pop());
			
		}
		for (int i = 0; i < outputAr.length; i++) {
			if (i==0) {
				outputStr=outputAr[i]+" ";
			}
			else {
				outputStr=outputStr+outputAr[i]+" ";
			}
		}

	}
	void popJudge(String inputi,int isPri) {
		if (isPri==1) {
			if (opStk.isEmpty()||(priJudge(opStk.peek())==100)) {
				opStk.push(inputi);
			}
			else if ((priJudge(opStk.peek())==1)) {
				numStk.push(opStk.pop());
				opStk.push(inputi);
			}
			else if ((priJudge(opStk.peek())==2)) {
				while ((!(opStk.isEmpty()))) {
					numStk.push(opStk.pop());
				}
				opStk.push(inputi);//容易丢
			}

		}
		else if (isPri==2) {
			if (opStk.isEmpty()||(priJudge(opStk.peek())==100)) {
				opStk.push(inputi);
			}
			else if (priJudge(opStk.peek())==1) {
				opStk.push(inputi);
			}
			else if (priJudge(opStk.peek())==2) {
				numStk.push(opStk.pop());
				opStk.push(inputi);
			}

		}
	}	
	int priJudge(String s) {
		switch (s) {
		case ("+"):return 1;
		case ("-"):return 1;
		case ("*"):return 2;
		case ("/"):return 2;
		case ("("):return 100;
		default:return -1;
		}
	}
}
class MathFormat {
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
512+4*+3-
 */
