package singleton;

public class SingleTon {
	private static SingleTon instance = new SingleTon();
	private SingleTon(){}
	public static SingleTon getinstance(){
		return instance;
	}
}