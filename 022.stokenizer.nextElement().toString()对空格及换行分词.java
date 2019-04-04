/**
 * stokenizer.nextElement().toString()对空格及换行分词
 */
package p;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		/**
		 * str1存放字符串
		 * stokenizer存放出去去""和""后的Object
		 * [][]xyStr存放矩阵{{"This","is","a"},{"sentence","中","文"}};
		 */
		String str1="This is a\n\n\nsentence 中 文\n";
		StringTokenizer stokenizer=null;
		String [][]xyStr=new String[2][3]; 
		
		stokenizer=new StringTokenizer(str1);
		
		
		System.out.print(str1);
		System.out.println();
		System.out.println("@@@@@@@@@@以上全部内容@@@@@@@@@@@");
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				//stokenizer.nextElement()类型为Object
				xyStr[i][j]=stokenizer.nextElement().toString();
			}
		}
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(xyStr[i][j]);
			}
		}
		
	}
}
/**
 * 输出
This is a


sentence 中 文

@@@@@@@@@@以上全部内容@@@@@@@@@@@
This
is
a
sentence
中
文
 */
