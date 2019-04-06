/**
 * 外部class类的属性调用+内部class类的属性调用
 */
package p;

public class Calculator8{
	public static void main(String[] args) {
		System.out.println(new Calc("abc").input);
	}
}
class Calc{  //不能加public，一个包只能有一个public类名
	String input;
	Calc(String s) {
		String input;
		this.input=s;	
	}
}
/**
abc
 */

/**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 * 内部class类的属性调用
 */
package p;
public class Calculator8{
	String input;
	Calculator8(String s){
		this.input=s;
	}
	public static void main(String[] args) {
		System.out.println(new Calculator8("Class类的属性调用").input);
	}
}
/**
Class类的属性调用
 */




