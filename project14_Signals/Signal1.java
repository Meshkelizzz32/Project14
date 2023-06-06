package project1;

public class Signal1 implements Runnable{
 public Signal1() {
	 System.out.println("Signal one after: ");
 }
  public void run() {
for(int i=0;i<3;i++) {
	System.out.println("Sounds signal one");
	Thread.yield();
	}
		System.out.println("Signal one is already sounds.");
		return;
	}

}
