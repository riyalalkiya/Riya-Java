package MultiThreading;

// • W.A.J. P to create one thread by implementing Runnable interface in Class.



 class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is ruuning...");
		// TODO Auto-generated method stub
	}
}

public class Q_001
{

	public static void main(String[] args)
	{
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		
	}

}
