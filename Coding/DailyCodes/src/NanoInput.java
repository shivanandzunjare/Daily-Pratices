import java.util.Scanner;

public class NanoInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter time in nanoseconds: ");
        long nanoSeconds = scanner.nextLong();
        
        System.out.println("You entered: " + nanoSeconds + " nanoseconds");
        
        scanner.close();

	}

}
