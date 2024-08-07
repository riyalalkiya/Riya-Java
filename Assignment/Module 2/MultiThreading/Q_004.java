package MultiThreading;

//• W.A.J.P to start the same Thread twice by calling start () method twice. Test ThreadTwice1
//  t1=new TestThreadTwice1(); t1.start (); t1.start ();



class  Running extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is ruuning....");
	}
}

public class Q_004
{
	public static void main(String[] args) {
		Running t1=new Running();
		t1.start();

	}

}
