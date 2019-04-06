package p;

public class Test {
   public static void main(String[] args) {
	int x=0,y=0,x2=0,y2=0;
	x2=x++;//x2=x
	y2=++y;//y2=y+1
	System.out.println(x);//先打印，后+1
	System.out.println(y);//先+1，后打印
	System.out.println(x2);//先+1，后打印
	System.out.println(y2);//先+1，后打印
   }
}
/**
 * x=1
 * y=1
 * x2=0
 * y2=1
 */
