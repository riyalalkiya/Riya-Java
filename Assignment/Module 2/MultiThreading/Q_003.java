package MultiThreading;

// • W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check
//   the execution.



import java.net.BindException;

class MyThreades extends Thread{
	@Override
	public void run() {
		System.out.println("thread"+Thread.currentThread().getId()+"is running");
		System.out.println("thread"+Thread.currentThread().getId()+"has completed");
	}
}

public class Q_003
{
	public static void main(String[] args)
	{
		MyThreades thread1 = new MyThreades();
		MyThreades thread2 = new MyThreades();
		
		thread1.start();
		thread2.start();
	}
}
