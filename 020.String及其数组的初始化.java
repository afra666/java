/**
 * String及其数组的初始化
 */
package p;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		/**
		 * String
		 */
		String str1=null;
		String str2=new String("Hello");
		String str3=new String();
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("str3="+str3+"\n");
		/**
		 * String []arStr
		 */
		
		String []arStr1=null;
		String []arStr2=new String[4];
		String []arStr3= {"America","aaaaabbbbb"};
		System.out.println("arStr1="+arStr1);
		System.out.println("arStr2="+arStr2);
		System.out.println("arStr3="+arStr3[0]+"\n");
		/**
		 * String [][]xyStr
		 */
		String [][]xyStr1=null;
		String [][]xyStr2=new String[2][3];
		String [][]xyStr3= {{"G","O","D"},{"1","2","3"}};
		System.out.println("xyStr1="+xyStr1);
		System.out.println("xyStr2="+xyStr2);
		System.out.println("xyStr3="+xyStr3+"\n");
		}
}
/**
 * 输出
str1=null
str2=Hello
str3=

arStr1=null
arStr2=[Ljava.lang.String;@15db9742
arStr3=America

xyStr1=null
xyStr2=[[Ljava.lang.String;@6d06d69c
xyStr3=[[Ljava.lang.String;@7852e922
*/
