/**java两种数据类型
 * 1.基本数据类型: boolean，char，byte，short，int，long，float，double.
 * 2.封装类类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double.
 */
package p;
public class Main {
    public static void main(String args[]) {
    	Integer i1=new Integer(123);
    	Integer i2=new Integer(123);
    	int i3=123;
    	System.out.println(i1==i2);
    	System.out.println(i1.equals(i2));
    	System.out.println(i1==i3);
    }
}
