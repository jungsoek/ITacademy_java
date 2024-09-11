package ex02_Thread;

class AddStackThread extends Thread{
	private Storage storage;
	
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			
		}
	}
} // AddStackThread클래스의 끝

class PopStackThread extends Thread {
	private Storage storage;
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
}

public class ThreadWaitExample {
	
}
