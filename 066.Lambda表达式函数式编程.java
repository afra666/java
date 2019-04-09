package p;
/**effect:
 *input:

 *output:

 *start
 */

public class TestMain{
	static Thread thread=new Thread(()->System.out.println("Hello world ! From another thread"));
	public static void main(String []args){
		thread.start();
		System.out.println("This is from main");
	}
}
/**effect:
 *input:

 *output:
This is from main
Hello world ! From another thread

 *end
 */
