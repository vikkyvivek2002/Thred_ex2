
public class Thred_ex2 implements Runnable
 {
	public void run()
	{
		System.out.println("this thread is running .....");
	}

	public static void main(String[] args) {
		Thred_ex2 t = new  Thred_ex2();
		 Thread t1 = new Thread(t);
		 t1.start();

	}

}
