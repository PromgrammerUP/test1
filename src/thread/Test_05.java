package thread;

public class Test_05 {
	public static void main(String[] args) {
		Thread06 t1 = new Thread06();
		t1.setName("张三");
		t1.start();
		Thread06 t2 = new Thread06();
		t2.setName("脚跟井村");
		t2.start();
		
	}
}

class Thread06 extends Thread{
	public static Country c = new Country();
	public void run(){
		String name = this.getName();
		synchronized (c) {	
			for(int i=0;i<1000;i++){
				if("张三".equals(name)){
					c.name="中国";
					try {
						this.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("张三:"+c.name);
				}else if("脚跟井村".equals(name)){
					c.name="日本";
					try {
						this.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("脚跟井村:"+c.name);
				}
			}
		}
	}
}
class Country{
	String name;
}