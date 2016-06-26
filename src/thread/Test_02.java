package thread;

public class Test_02 {
	public static void main(String[] args) {
		Mythread2 t = new Mythread2();
		Thread tt = new Thread(t);
		tt.start();
		while(true){
			System.out.println("#########");
		}
	}
}
class Mythread2 implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("**********");
		}
	}
	
}
