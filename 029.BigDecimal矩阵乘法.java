/**
 * BigDecimal矩阵乘法
 */
package p;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		int arintA[][]={{1,2},{3,4},{5,6}};
		int arintB[][]={{1,2,3,4},{4,5,6,7}};
		BigDecimal[][]arA=new BigDecimal[arintA.length][arintA[0].length];//自己定义矩阵
		BigDecimal[][]arB=new BigDecimal[arintB.length][arintB[0].length];//自己定义矩阵
		for (int i = 0; i <arintA.length; i++) {
			for (int j = 0; j <arintA[0].length; j++) {
				arA[i][j]=BigDecimal.valueOf(arintA[i][j]);
			}
		}
		for (int i = 0; i < arB.length; i++) {
			for (int j = 0; j <arintB[0].length; j++) {
				arB[i][j]=BigDecimal.valueOf(arintB[i][j]);
			}
		}
		BigDecimal[][]arC=new BigDecimal[arA.length][arB[0].length];;
		for (int i = 0; i < arA.length; i++) {
			for (int j = 0; j < arB[0].length; j++) {
				arC[i][j]=new BigDecimal("0");
			}
		}
		int rowA=arA.length,coluA=arA[0].length,rowB=arB.length,coluB=arB[0].length;
		
		for (int i = 0; i <rowA; i++) {//按照A的行运算
			for (int j = 0; j <coluB; j++) {//按照B的列运算
				for (int k = 0; k <arB.length; k++) {//b有多少行，kmax即sigma的顶端就是几
				arC[i][j]=arC[i][j].add(arA[i][k].multiply(arB[k][j]));
			}
				
		}
	}
		for (int i = 0; i < arC.length; i++) {
			for (int j = 0; j < arC[0].length; j++) {
				System.out.print(arC[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/**
 * 输出
9 12 15 18 
19 26 33 40 
29 40 51 62 
 */
