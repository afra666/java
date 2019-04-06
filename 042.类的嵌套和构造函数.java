/**
 * 类的嵌套和构造函数
 */
package p;
public class TestClass5 {
	public static void main(String args[]) {
		new TestClass5("");
								
	}
	TestClass5(String s){//构造与类名同名的方法
		System.out.println("Words from there.");
		}
}
/**
Words from there.
 */

/**
 * 类的嵌套，非构造方法要加static
 */
package p;
public class TestClass5 {
	public Info ifInfo;
	public static void main(String args[]) {
		new TestClass5.Info("fdg");
								
	}
	static class Info {//非构造方法要加static
		Info(String s) {
			System.out.println("Words from Info.");
		}
	}
}
/**
Words from Info.
 */
