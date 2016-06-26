package interfacep;

public class A {
	public void abc(){
		class MethodInnerClass{
			
		}
	}
	private Shengwu dragon = new Shengwu() {
		
		public void live() {
			System.out.println("龙在睡觉");
		}
	};
	public void say(){
		dragon.live();
	}
}
