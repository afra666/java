package p;

import java.util.Scanner;

/**effect:
 *input:

 *output:

 *start
 */
public interface TestMain{
	int UP=1;
	int RIGHT=2;
	int DOWN=3;
	int LEFT=4;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int key=scn.nextInt();
		
		switch (key) {
		case UP:System.out.println("You are going to the UP");break;
		case RIGHT:System.out.println("You are going to the RIGHT");break;
		case DOWN:System.out.println("You are going to the DOWN");break;
		case LEFT:System.out.println("You are going to the LEFT");break;

		default:
			break;
		}
	}
}
/**effect:
 *input:

 *output:

 *end
 */

