package project1;

public class Signal3 implements Runnable{
	 public Signal3() {
		 System.out.println("Signal three after: ");
	 }
	  public void run() {
	for(int i=0;i<3;i++) {
		System.out.println("Sounds signal three");
		Thread.yield();
	}
			System.out.println("Signal three is already sounds.");
			return;
		}

	}
