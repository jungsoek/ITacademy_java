package ex02_Thread;

public class ThreadCount extends Thread {
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = n; n >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		System.out.println("종료");
	}
}
