package day11;
import java.util.HashMap;


public class PasswordFinder {
	

	    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
	        int[] inputs = {input1, input2, input3, input4, input5};
	        int stableCount = 0;
	        int unstableCount = 0;

	        for (int num : inputs) {
	            if (isStable(num)) {
	                stableCount++;
	            } else {
	                unstableCount++;
	            }
	        }

	        return (unstableCount * 10) + stableCount;
	    }

	    private static boolean isStable(int number) {
	        String numStr = Integer.toString(number);
	        HashMap<Character, Integer> digitCount = new HashMap<>();

	        for (char ch : numStr.toCharArray()) {
	            digitCount.put(ch, digitCount.getOrDefault(ch, 0) + 1);
	        }

	        int frequency = -1;
	        for (int count : digitCount.values()) {
	            if (frequency == -1) {
	                frequency = count;
	            } else if (frequency != count) {
	                return false;
	            }
	        }

	        return true;
	    }

	    // For testing
	    public static void main(String[] args) {
	        int password = findPassword(12, 1313, 122, 678, 898);
	        System.out.println("Password: " + password);  // Output should be 23
	    }
	}
	

