package p;

import java.util.ArrayList;

public class Main {
	
	public static void main(String []args) {
		ArrayList<String> arLis1=new ArrayList<String>();
		ArrayList<String> arLis2=new ArrayList<String>();
		arLis1.add("eye");
		arLis1.add("mouth");
		arLis1.add("ear");
		arLis1.add("hair");
		System.out.println(arLis1.size());
		arLis2.add("eye");
		arLis2.add("mouth");
		arLis2.add("foot");
		arLis1.retainAll(arLis2);
		System.out.println(arLis1);
		System.out.println(arLis1.size());
	}
}
/**
 * 输出：
 4
[eye, mouth]
2
 */
