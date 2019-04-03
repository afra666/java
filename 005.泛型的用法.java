package p;
class Fanxing<F>{
	F fanxing;
	public void setFanxing(F fanxing) {
		this.fanxing = fanxing;
	}
	public F getFanxing() {
		return fanxing;
	}
}
public class Main{
	public static void main(String []args) {
		Fanxing<String> fanxing=new Fanxing<String>();
		fanxing.setFanxing("This is a cat");
		System.out.println(fanxing.getFanxing());
	}
}
