package p;


import java.util.function.BiFunction;
import java.util.function.Function;

public class TestMain {
	
	public static void main(String args[]) {
		// 1. 不需要参数,返回值为 5  
		Function<Integer, Integer> f1=(x)->5;
		  
		// 2. 接收一个参数(数字类型),返回其2倍的值  
		Function<Integer, Integer> f2=x -> 2 * x;
		  
		// 3. 接受2个参数(数字),并返回他们的差值  
		BiFunction<Integer, Integer, Integer> f3=(x, y) ->x-y;
		  
		// 4. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
				Function<Integer,String> cs1=i->i.toString();
				Function<Integer,String> cs2=i->"This is a word.";
				
		int x=3;
		System.out.println(f1 .apply(x));
		System.out.println(f2 .apply(x));
		System.out.println(f3 .apply(x,2*x));
		System.out.println(cs1.apply(x));
		System.out.println(cs2.apply(x));
    }

}
/**effect:
 *output:
5
6
-3
3
This is a word.

 *end
 */
package p;

import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		Function<Double, Double> fx = x1 -> x1+1.0;
		Function<Double, Double> gx = x2 -> x2*2.0;
		Double x=2.0;
		System.out.println("f(x)=x+1,when x=" + x + ", f(x)=" + fx.apply(x));
		System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", f(g(x))=" + fx.compose(gx).apply(x));
		System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", g(f(x))=" + fx.andThen(gx).apply(x));
		System.out.println("compose vs andThen:f(g(x))=" +
				fx.compose(gx).apply(x) + "," + gx.andThen(fx).apply(x));
	}
}
/**effect:
 *input:

 *output:
f(x)=x+1,when x=2.0, f(x)=3.0
f(x)=x+1,g(x)=2x, when x=2.0, f(g(x))=5.0
f(x)=x+1,g(x)=2x, when x=2.0, g(f(x))=6.0
compose vs andThen:f(g(x))=5.0,5.0

 *end
 */
//用法2
package p;


import java.util.function.Function;

public class TestMain {
	public Double value(double d,Function<Double, Double> func) {
		return func.apply(d);
	}
	public static void main(String[] args) {
		System.out.println(new TestMain().value(15, x->x*x));
	}
}
/**effect:
 *output:
225.0
 *end
 */
