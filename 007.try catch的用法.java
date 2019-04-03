package p;
class Main{
	public static void main(String []args) {
		int []ar=new int[2];//ar[0],ar[1]
		try {
			System.out.println(ar[2]);
		} catch (Exception e) {
			System.out.println("为空");
		}
	}
}
