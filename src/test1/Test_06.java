package test1;

public class Test_06 {
	public static void main(String[] args) {
		String a = "123456a7891";
		if (a.length()==11) {
			boolean isOK = isAnum(a);
			System.out.println(isOK);
		}else {
			System.out.println("号码不是11位"+a.length());
		}
	}
	public static boolean isAnum(String a){
		boolean isOk=true;
		String dic = "1234567890";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			String nStr = c+"";
			boolean isC = dic.contains(nStr);
			if(isC==false){
				isOk = false;
				break;
			}
		}
		return isOk;
	}
}
