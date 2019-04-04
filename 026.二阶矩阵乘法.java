/**
 * 2阶矩阵乘法
 */
package p;
public class Main {

	public static void main(String[] args) {
		double arA[][]= {{1,2},{3,4}},arB[][]= {{3,2},{4,0}},arC[][]=new double[2][2];
		int m=2,n=2,p=2;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				for (int k = 0; k< n; k++) {
					arC[i][j]+=arA[i][k]*arB[k][j];
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(arC[i][j]+" ");
			}
			System.out.println();
		}
		}
}
/**
 * 输出
 * 11.0 2.0 
 * 25.0 6.0 
 */
