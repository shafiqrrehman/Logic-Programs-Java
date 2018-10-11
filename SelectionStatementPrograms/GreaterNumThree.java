import java.util.Scanner;

public class GreaterNumThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int a, b, c;

		System.out.print( "Enter A: " );
		a = input.nextInt();
		System.out.print( "Enter B: " );
		b = input.nextInt();
		System.out.print( "Enter C: " );
		c = input.nextInt();

		if ( a > b && a > c ) {
			
			System.out.println( "\nA is greater than B & C." );

		} else if ( b > a && b > c ) {
			
			System.out.println( "\nB is greater than A & C." );

		} else {

			System.out.println( "\nC is greater than A & B." );
		}
	}
}