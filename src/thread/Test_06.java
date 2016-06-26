package thread;

public class Test_06 {
	public static void main(String[] args) {
		Thread07 t1 = new Thread07();
		t1.setName("th1");
		t1.start();
		Thread07 t2 = new Thread07();
		t2.setName("th2");
		t2.start();
	}
		

}
class Thread07 extends Thread{
	public static Country1 c = new Country1();
	public static Country1 d = new Country1();
	public void run(){
		String name = this.getName();
		if("th1".equals(name)){
			synchronized (c){
				try {
					this.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (d) {
					System.out.println("th1的逻辑");
				}
			}
		}else if("th2".equals(name)){
			synchronized (d){
				try {
					this.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (c) {
					System.out.println("th2的逻辑");
				}
			}
		}
	}
	
}
class Country1{
	String name;
}
