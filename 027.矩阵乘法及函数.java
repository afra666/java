/**
 * 矩阵乘法
 */
package p;
public class Main {

	public static void main(String[] args) {
		double[][]arA={{1,2},{3,4},{5,6}};//自己定义矩阵
		double[][]arB={{1,2,3,4},{4,5,6,7}};//自己定义矩阵
		double[][]arC=new double[arA.length][arB[0].length];
		int rowA=arA.length,coluA=arA[0].length,rowB=arB.length,coluB=arB[0].length;
		for (int i = 0; i <rowA; i++) {//按照A的行运算
			for (int j = 0; j <coluB; j++) {//按照B的列运算
				for (int k = 0; k <arB.length; k++) {//b有多少行，kmax即sigma的顶端就是几
					arC[i][j]+=arA[i][k]*arB[k][j];
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
/**输出
9.0 12.0 15.0 18.0 
19.0 26.0 33.0 40.0 
29.0 40.0 51.0 62.0 
*/
