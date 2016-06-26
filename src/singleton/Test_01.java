package singleton;

public class Test_01 {
	public static void main(String[] args) {
		SingleTon single1 = SingleTon.getinstance();
		System.out.println(single1);
		SingleTon single2 = SingleTon.getinstance();
		System.out.println(single2);
		SingleTon2 single3 = SingleTon2.getInstance();
		System.out.println(single3);
		SingleTon2 single4 = SingleTon2.getInstance();
		System.out.println(single4);
		SingleTon2 single5 = SingleTon2.getInstance();
		System.out.println(single5);
	}
}
