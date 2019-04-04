/**
 * StringTokenizer分割及Object关键字
 */
package p;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		
		StringBuffer strbf=new StringBuffer("this is,    some,d.");
		StringTokenizer strtkn=new StringTokenizer(strbf.toString(),",");
		Object str1=strtkn.nextElement();//用String会报错
		Object str2=strtkn.nextElement();
		Object str3=strtkn.nextElement();
		System.out.println("元素："+str1);
		System.out.println("元素："+str2);
		System.out.println("元素："+str3);
	}
}
/**
 * 输出
 元素：this is
元素：    some
元素：d.

 */

