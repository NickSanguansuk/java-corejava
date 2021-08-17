package topics.concurrency_programming.demo7;

public class MyThread extends Thread {

	public void run() {
		
		try {
			System.out.println("runnable before sleep");
			Thread.sleep(5000);
			System.out.println("runnable after sleep");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
