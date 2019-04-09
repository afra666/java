package p;
public class TestMain {

	static Thread thread = new Thread(() -> System.out.println("In another thread"));
	public static void main(String[] args) {
		thread.start();
		System.out.println("In main");
	}
}
/**輸出
In main
In another thread

*/
