import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int a, b;

		System.out.print( "Enter A: " );
		a = input.nextInt();
		System.out.print( "Enter B: " );
		b = input.nextInt();

		if ( a > b ) {
			
			System.out.println( "\nA is greater than B." );
		} else {
			System.out.println( "\nB is greater than A." );
		}
	}
}