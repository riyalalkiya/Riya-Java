package MultiThreading;

// • W.A.J.P to create 2 threads and make one thread as Daemon Thread by using 
//   set Daemon () method of Thread class and check whether the thread is set daemon or not by
//   using is Daemon () method.
//   TestDaemonThread2 t1=new TestDaemonThread2(); 
//   TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
//   t1.setDaemon(true);//will throw exception here t2.start();

class Setdata extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running....");
	}
}

public class Q_005
{
	public static void main(String[] args)
	{
		Setdata t1 = new Setdata();
		Setdata t2 = new Setdata();
		
		t1.start();
		t1.isDaemon();
		t2.start();
	}

}
