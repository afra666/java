/**
 * java匿名调用对象和普通调用
 */
package p;
public class Main {
  public static void main(String []args) {
	//普通方式调用对象，对象名称为：stu
	  Student stu=new Student();
	  stu.info();
	
	//匿名调用对象，无新的对象名
	new Worker().info();
	new Main().techerinfo();
  }
  void techerinfo() {
	  System.out.println("teacher对象已调用");
  }
   
}
//开始创建
class Student{
	void info(){
		System.out.println("Student对象已创建");
	}
}
class Worker{
	void info() {
		System.out.println("Worker对象已创建");
	}
}
/***输出
Student对象已创建
Worker对象已创建
teacher对象已调用
*/
