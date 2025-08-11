package day1;

public class JumbledWords {

	    public static String jumbleWord(String word, int method) {
	        StringBuilder result = new StringBuilder();

	        if (method == 1) {
	            
	            StringBuilder part1 = new StringBuilder();
	            StringBuilder part2 = new StringBuilder();

	            
	            for (int i = 0; i < word.length(); i += 2) {
	                part1.append(word.charAt(i));
	            }

	           
	            for (int i = word.length() - 1; i >= 0; i--) {
	                if (i % 2 == 1) {
	                    part2.append(word.charAt(i));
	                }
	            }

	            result.append(part1).append(part2);
	        } else if (method == 2) {
	            
	            StringBuilder part1 = new StringBuilder();
	            StringBuilder part2 = new StringBuilder();

	            
	            for (int i = 0; i < word.length(); i += 2) {
	                part1.append(word.charAt(i));
	            }

	            
	            for (int i = 1; i < word.length(); i += 2) {
	                part2.append(word.charAt(i));
	            }

	            result.append(part1).append(part2);
	        }

	        return result.toString();
	    }

	    public static String jumbleSentence(String input1, int input2) {
	        String[] words = input1.split(" ");
	        StringBuilder jumbledSentence = new StringBuilder();

	        for (String word : words) {
	            jumbledSentence.append(jumbleWord(word, input2)).append(" ");
	        }

	        return jumbledSentence.toString().trim();
	    }

	  
	    public static void main(String[] args) {
	        String sentence = "PROJECT BASED LEARNING";
	        int method = 1;

	        String jumbled = jumbleSentence(sentence, method);
	        System.out.println("Jumbled Sentence (Method " + method + "): " + jumbled);

	        method = 2;
	        jumbled = jumbleSentence(sentence, method);
	        System.out.println("Jumbled Sentence (Method " + method + "): " + jumbled);
	    }
	}

