package project1;

public class Signal2 implements Runnable{
	 public Signal2() {
		 System.out.println("Signal two after: ");
	 }
	  public void run() {
	for(int i=0;i<3;i++) {
		System.out.println("Sounds signal two");
		Thread.yield();
	}
			System.out.println("Signal two is already sounds.");
			return;
		}

	}
