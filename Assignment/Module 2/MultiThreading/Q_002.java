package MultiThreading;

// • W.A.J. P to create one thread by extending Thread class in another Class.


class MyThreadss extends Thread{
	
	@Override
	public  void  run() {
		System.out.println("Thread is running...");
	}
}

public class Q_002
{
	public static void main(String[] args) 
	{
		MyThreadss myThread = new MyThreadss();
		myThread.start();
		
		
	}

}
