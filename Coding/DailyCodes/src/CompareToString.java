import java.util.Scanner;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1, s2;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter first string");
		s1 = in.nextLine();
		
		
		System.out.println(" enter second string");
		s2 = in.nextLine();
		
		if( s1.compareTo(s2) > 0)
			System.out.println(" first string is greater than second ");
		else if (s1.compareTo(s2) < 0) 
			System.out.println(" second string is greater than second ");
		
		
		else
			System.out.println(" both are equal");
	}

}
