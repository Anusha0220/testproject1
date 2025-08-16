package day1;
import java.util.Scanner;

public class PasswordFinder {
	public static boolean isStable(int number) {
        int[] digitCount = new int[10];
        
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        int freq = 0;
        for (int count : digitCount) {
            if (count != 0) {
                if (freq == 0) {
                    freq = count;
                } else if (freq != count) {
                    return false;
                }
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[5];
        int password = 0;

        System.out.println("Enter 5 numbers:");
        System.out.println("🔍 Detective Buckshee Jr. needs your help!");
        System.out.println("To unlock the Shantiniketan Games Complex, you must find the correct password.");
        System.out.println("Enter 5 secret codes (numbers). Some are stable, some are not...");
        System.out.println("🤫 Only the stable ones matter. The password is the total of all stable codes.");
        System.out.println("Enter one number at a time, and press Enter after each:");


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }

        for (int num : inputs) {
            if (isStable(num)) {
                password += num;
            }
            
        }

        System.out.println("Password (sum of stable numbers): " + password);
        scanner.close();
    }

}
