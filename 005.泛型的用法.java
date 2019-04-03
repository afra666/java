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
		Fanxing<String> fanxing=new Fanxing<String>();  //Fanxing<String> fanxing是为了使用其中的set和get方法
		fanxing.setFanxing("This is a cat");
		System.out.println(fanxing.getFanxing());
	}
}
