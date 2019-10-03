/**
 * 构造函数变量赋值
 */
package p;
public class TestClass4 {
	public static void main(String args[]) {
		new Pc("This is a message.").show();
	}
}

class Pc{
	String str1;
	String str2;
	Pc(String str3) {
		str1=str3;
		this.str2=str3;
	}
	void show(){
		System.out.println(str1);
		System.out.println(str2);
	}
}

/**
This is a message.
This is a message.
 */
