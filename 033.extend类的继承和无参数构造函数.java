/**extends类的继承
 * 
 */
package p;

class paren{
	String firstname=null;
	int id=6;
	void setInfo(String a,int b){
		firstname=a;
		id=b;
	}
	void getInfo() {
		System.out.println("fristname="+firstname+"\n"+"id="+id);
	}
}
class people1 extends paren{
	people1() { 						//不能加void
		super.setInfo("Alice",1);
		super.getInfo();
	}
}

class people2 extends paren{
	people2() {
		super.setInfo("Gory",2);
		super.getInfo();
		
	}
}

public class TestClass {
	public static void main(String[] args) {
		new people1();
		new people2();
	}
}
/**输出
fristname=Alice
id=1
fristname=Gory
id=2

 * @author Administrator
 *
 */
