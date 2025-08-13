package day1;
import java.util.ArrayList;
import java.util.Collections;


public class SumOfpowerOfDigits {
	public int sumOfPowerOfDigits(int input1) {
        if (input1 < 10) {
            return 1;
        }
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = input1;
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(digits);
        int sum = 0;
        for (int i = 0; i < digits.size() - 1; i++) {
            int base = digits.get(i);
            int exponent = digits.get(i + 1);
            sum += (int) Math.pow(base, exponent);
        }
        sum += (int) Math.pow(digits.get(digits.size() - 1), 0);
        return sum;
    }

    public static void main(String[] args) {
    	SumOfpowerOfDigits obj = new SumOfpowerOfDigits();
        int input = 5821;
        int result = obj.sumOfPowerOfDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Sum of power of digits: " + result);
    }

}
