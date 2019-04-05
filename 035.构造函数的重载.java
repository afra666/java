/**构造函数的重载
 * 
 */
package p;
class Paren{
	String firstname=null;
	int id=6;
	int age=0;
	Paren(String a,int b){ 							//名字等于类名区分大小写
		firstname=a;
		id=b;
		System.out.println(firstname+" "+id);
	}
	Paren(String a,int b,int c){ 					//名字等于类名区分大小写
		firstname=a;
		id=b;
		age=c;
		System.out.println(firstname+" "+id+" "+age);
	}
	
}

public class TestClass {
	public static void main(String[] args) {
		new Paren("Alice", 2002);
		new Paren("Suson", 2003, 16);
	}
}
/**输出
Alice 2002
Suson 2003 16
 *
 */
