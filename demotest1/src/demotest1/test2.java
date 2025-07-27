package demotest1;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first boolean (true/false): ");
	        boolean x = sc.nextBoolean();
	        System.out.print("Enter second boolean (true/false): ");
	        boolean y = sc.nextBoolean();
	        System.out.println("AND: " + (x && y));
	        System.out.println("OR: " + (x || y));
	        System.out.println("NOT x: " + (!x));
	        sc.close();

	}

}
