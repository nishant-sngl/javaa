package thread;

public class Thread2 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1(); // Main TH creates child thread object.
		t1.start(); // child th is started.
		//start() internally calls run() method.
		
		//below is the code of main th.
		for(int i=0;i<10;i++)
			System.out.println("Main thread");
		
		// in the above case, the sequence is not guarented that which thread will run 1st.
		
	}
}
