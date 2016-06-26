package overload;

public class Test_01 {
  public static void main(String[] args) {
	Calculator cal = new Calculator();
	int s = cal.add(10,20,34);
	System.out.println(s);
}
}

class Calculator {
	public int add( int a,int b){
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}
	public int add(int ... a){
		int sum=0;
		for(int i:a){
			sum += i;
		}
		return sum;
		
	}
}

class F {
	public void a(){
		System.out.println("a方法被调用了……");
	}
}

class S extends F {
	public void a(int s){
		System.out.println("带参数的方法a被调用了……");
	}
}