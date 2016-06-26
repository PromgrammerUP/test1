package thread;

public class Test_03 {
	public static void main(String[] args) {
		Mythread3 t = new Mythread3();
		t.setName("th");
		t.setDaemon(true);
		t.setPriority(4);
		t.start();
		
		Mythread3 t1 = new Mythread3();
		t1.setName("th1");
		t1.setPriority(3);
		t1.start();
//		System.out.println("主进程*************************************");
	}
}
class Mythread3 extends Thread{

	@Override
	public void run() {
		int count=0;
		for (int i = 0; i < 1000; i++) {
			System.out.println("支线线程……:"+this.getName()+":"+count);
			count++;
		}
			
	}
	
}