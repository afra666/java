/**extends类的继承和无参数构造函数
 * 
 */
package p;

class Paren{
	String firstname=null;
	int id=6;
	Paren(String a,int b){ 					//无参数构造函数。名字等于类名区分大小写
		firstname=a;
		id=b;
	}
	void getInfo() {
		System.out.println("fristname="+firstname+"\n"+"id="+id);
	}
}
class people1 extends Paren{
	people1() { 						//不能加void
		super("Alice",2019);
		super.getInfo();
	}
}

class people2 extends Paren{
	people2() {
		super("Gory",2020);
		super.getInfo();
	}
}

public class TestClass {
	public static void main(String[] args) {
		new people1();							//匿名引用
		new people2();
	}
}
/**输出
fristname=Alice
id=2019
fristname=Gory
id=2020
 *
 */
