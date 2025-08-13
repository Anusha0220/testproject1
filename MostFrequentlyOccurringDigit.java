package day1;

public class MostFrequentlyOccurringDigit {
	public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] digitFrequency = new int[10];

        for (int i = 0; i < input2; i++) {
            int number = input1[i];
            if (number == 0) {
                digitFrequency[0]++;
                continue;
            }
            while (number > 0) {
                int digit = number % 10;
                digitFrequency[digit]++;
                number /= 10;
            }
        }

        int maxFrequency = -1;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] >= maxFrequency) {
                maxFrequency = digitFrequency[i];
                mostFrequentDigit = i;
            }
        }
        return mostFrequentDigit;
    }

    public static void main(String[] args) {
        int[] arr = {123, 456, 789, 123, 12, 90};
        int result = mostFrequentlyOccurringDigit(arr, arr.length);
        System.out.println("Most Frequent Digit: " + result);
    }

}
