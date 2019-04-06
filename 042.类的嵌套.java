/**
 * 类的嵌套
 */
package p;
public class TestClass5 {
	public Info ifInfo;
	public static void main(String args[]) {
		new TestClass5.Info("fdg");
								
	}
	static class Info {
		Info(String s) {
			System.out.println("Words from Info.");
		}
	}
}
/**
Words from Info.
 */
