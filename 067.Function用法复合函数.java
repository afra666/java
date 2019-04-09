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
