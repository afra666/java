/**
 * extends继承的用法
 */
package p;

class idcard1{
	void firstname() {
		String HerFirstameIs="Alice";
		System.out.println(HerFirstameIs);
	}
}

class idcard2 extends idcard1{
//	void firstname() {
//		String HerFirstameIs="Pooli";
//		System.out.println(HerFirstameIs);
//	}
	void lastname() {
		String HerLastameIs="miky";
		System.out.println(HerLastameIs);
	}
}

public class TestClass {
  public static void main(String []args) {
	  new idcard2().firstname();
	}
}

/**
输出
Alice
*/
