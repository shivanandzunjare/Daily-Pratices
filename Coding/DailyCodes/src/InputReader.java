import java.util.Scanner;

public class InputReader {

	public static void main(String [] args) {
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" enter a integer");
		a = in.nextInt(); 
		System.out.println(" you entered a integer -->" + a);
		
		System.out.println("enter a float");
		b = in.nextFloat();
		System.out.println("you entered a float -->" + b);
		
		in.nextLine(); 
		System.out.println("enter a string ");
		s = in.nextLine();
		System.out.println("you entered a string -->" + s);
	}
}
