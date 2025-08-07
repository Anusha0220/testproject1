package day3;

public class NumberPrinterThread {

		    public static void main(String[] args) {
		        // Creating a thread using a lambda expression
		        Thread thread = new Thread(() -> {
		            for (int i = 1; i <= 10; i++) {
		                System.out.println(i);

		                // Introduce delay after printing 5
		                if (i == 5) {
		                    try {
		                        Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		                    } catch (InterruptedException e) {
		                        System.err.println("Thread was interrupted.");
		                    }
		                } else {
		                    try {
		                        Thread.sleep(500); // Optional: Small delay for readability
		                    } catch (InterruptedException e) {
		                        System.err.println("Thread was interrupted.");
		                    }
		                }
		            }
		        });

		        // Start the thread
		        thread.start();
		    }
	


	}

