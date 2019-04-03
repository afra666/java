package p;
import java.util.Scanner;
class Main{
	public static void main(String []args) {
		System.out.println("请输入一个数：");
		StringBuffer str1=new Main().userINPUTSTRING();
		System.out.println(str1.toString());
		
		System.out.println("请输入一个数：");
		StringBuffer str2=new Main().userINPUTSTRING();
		System.out.println(str2.toString());
		
		System.out.println("请输入一个数：");
		StringBuffer str3=new Main().userINPUTSTRING();
		System.out.println(str3.toString());
	}
	static StringBuffer strbf;
	public StringBuffer userINPUTSTRING() {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		strbf=new StringBuffer(str);
//		scn.close();
		return strbf;
	}
}
