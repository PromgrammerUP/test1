package thread;

public class Test_01 {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		while(true){
			System.out.println("###########");
		}
	}
}

class Mythread extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("***********");
		}
	}
	
}