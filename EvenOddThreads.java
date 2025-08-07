package day3;

public class EvenOddThreads {
		    public static void main(String[] args) {
		        // Thread to print even numbers between 1 and 20
		        Thread evenThread = new Thread(() -> {
		            System.out.println("Even Numbers:");
		            for (int i = 2; i <= 20; i += 2) {
		                System.out.println(i);
		            }
		        });

		        // Thread to print odd numbers between 1 and 20
		        Thread oddThread = new Thread(() -> {
		            System.out.println("Odd Numbers:");
		            for (int i = 1; i <= 20; i += 2) {
		                System.out.println(i);
		            }
		        });

		        // Start even thread first
		        evenThread.start();

		        try {
		            // Wait for evenThread to complete
		            evenThread.join();
		        } catch (InterruptedException e) {
		            System.err.println("Thread interrupted: " + e.getMessage());
		        }

		        // Start odd thread after evenThread has finished
		        oddThread.start();
		    }
		
	}

