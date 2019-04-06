package p;

public class Test {
   public static void main(String[] args) {
	   String input="8*6";
	   Stack stack=new Stack(input.length());
	   stack.push(input.charAt(0));
	   stack.push(input.charAt(1));
	   System.out.println(stack.pop());
   }
}

class Stack{//char栈class,使用需要赋值栈长度
	char []stkAr;//栈存放数据类型
	int top;//指针
	Stack(int stkSetSize) {
		this.stkAr=new char[stkSetSize];
		this.top=-1;
	}
	void push(char c){//有入栈值，无出栈值：有传入值c，无返回值void型，指针top+1；
		stkAr[++top]=c;
	}
	char pop(){//无入栈值，有出栈值：无传入值，有返回值char型，出栈top，指针top-1；
		return stkAr[top--];
	}
}
/**
输出：*
 */
