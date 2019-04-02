package p;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		BigInteger b1,m,sumB1 = null;//输入大数,次幂，次幂的结果
		
		BigInteger add,subtract,multiply,divide,remainder;//加减乘除余
		
		
		
		
		//加减乘除余赋值
//		add           = b1.add(b2)    ;
//		subtract      = b1.subtract(b2)   ;
//		multiply      = b1.multiply(b2)   ;
//		divide        = b1.divide(b2)   ;
//		remainder     = b1.remainder(b2)   ;
		
		
		System.out.println("b的m次幂的值计算");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		System.out.println("请输入b=");
		b1=scn.nextBigInteger();
		System.out.println("请输入m=");
		m=scn.nextBigInteger();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for (int i = 0; i <m.intValue(); i++) {
			if (i==0) {
				sumB1=b1;
			}else {
				sumB1=sumB1.multiply(b1);
			}
			
			
			
		}
		System.out.println(sumB1.toString());
	}

}



/**
b的m次幂的值计算
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
请输入b=
5
请输入m=
3
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
125
*/
