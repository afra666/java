package p;


import java.util.function.BiFunction;
import java.util.function.Function;

public class TestMain {
	public Double value(double x,double y,BiFunction<Double, Double,Double> func) {
		return func.apply(x,y);
	}
	public static void main(String[] args) {
		System.out.println(new TestMain().value(3,6,(x,y)->(x*y)));
	}
}
/**effect:
 *output:
18.0
 *end
 */
