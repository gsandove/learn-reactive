package threads.Thread;

public class THilo extends Thread{
	
	public void run() {
		System.out.println("Running thread priority is: " + 
				Thread.currentThread().getPriority());
	}
	
}
