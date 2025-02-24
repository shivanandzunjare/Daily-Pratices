import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, c, f=1;
		System.out.println(" enter a num to find factorial");

		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		for ( c=1; c<=n ; c++) {
			f = f * c;
		}
		System.out.println(" factorial of " + n + "! is " + f );
	}

}
