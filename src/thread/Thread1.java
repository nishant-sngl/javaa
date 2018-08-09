package thread;

public class Thread1 extends Thread{

	//override run method from Thread class.
	// code inside run() is called job.
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("child thread");
	}
}
