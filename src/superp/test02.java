package superp;

public class test02 {
 public static void main(String[] args) {
	S s = new S();
}
}

class F {
	public F(int a){
		System.out.println("F的构造器被调用了");
	}
}
class S extends F{
	public S (){
		//super();
		super(10);
		System.out.println("s中构造器被调用了");
	}
}