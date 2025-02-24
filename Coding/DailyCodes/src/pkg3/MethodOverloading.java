package pkg3;

public class MethodOverloading {
	public  int sum(int a, int b) {
		return a + b;
	}
	
	public  int  sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(DemoString[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sum(11, 22, 10));
//		System.out.println(MethodOverloading.sum(11, 55, 10
//				));

	}

}
