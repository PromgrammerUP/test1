package abstractp;

public abstract class 老一辈科学家 {
    
	public void 制作原子弹蛋壳(){
		System.out.println("原子弹蛋壳制造成功");
	}
	public void 制作导弹支架(){
		System.out.println("导弹支架制作成功");
	}
	public void 制作导弹发射器(){
		System.out.println("导弹发射器制作成功");
	}
	public abstract void 提炼铀技术();
	public void 制作原子弹(){
		this.制作原子弹蛋壳();
		this.制作导弹支架();
		this.制作导弹发射器();
		this.提炼铀技术();
	}
	public void 轰炸(String address){
		this.制作原子弹();
		System.out.println(address +":::目标被摧毁");
	}
	public static void main(String[] args) {
		
	}
}
