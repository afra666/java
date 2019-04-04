package p;
public class Main {
	public static void main(String[] args) {
		String [][]xyStr3= {{"G","O","D"},{"1","2","3"}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(xyStr3[i][j]);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(String.valueOf(xyStr3[i][j]));
			}
		}
	}
}

/**
 * 输出
G
O
D
1
2
3
G
O
D
1
2
3
 */
