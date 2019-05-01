//1.ListenerInterface.java定义接口

package p;
/**
 * 定义接口
 * @author Administrator
 *
 */
public interface ListenerInterface {
	public void printStr();
}




//2.Caller.java负责调用接口

package p;

public class Caller {
	/**
	 * 构造方法
	 */
	public Caller() {
		
	}
	public Caller(ListenerInterface listenerInterface) {
		//调用监听器接口,使用printStr方法
		//此时为空,
		listenerInterface.printStr();
	}
}



//3.main函数来控制Caller
package p;

import java.util.HashSet;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		//开始调用caller
		Caller caller=new Caller(
				new ListenerInterface() {
					
					@Override
					public void printStr() {
						// TODO Auto-generated method stub
						System.out.println("Using ListenerInterface");
					}
				}
				);
	}
}




/**输出
Using ListenerInterface
 */






