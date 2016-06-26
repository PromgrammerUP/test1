package test1;

public class Test_05 {
	public static void main(String[] args) {
		String a = "abcdefg";
		String b = "ab";
		boolean isA = a.startsWith(b);
		String c = "efg";
		boolean isC = a.endsWith(c);
		String d = "cde";
		boolean isContents = a.contains("gfd");
		String subA = a.substring(3, 6);
		String subAA = a.substring(5);
		String aa = "   陆   路   运   输    从    ";
		String bb = aa.trim();
		String aaa = "2001-03-20-ff-gg-dd";
		String[] as = aaa.split("-");
		for (int i = 0; i < as.length; i++) {
			System.out.println(as[i]);
		}
		String anum = "100";
		String bnum = "200";
		int aI = Integer.parseInt(anum);
		boolean bI = Boolean.parseBoolean(anum);
		short sI = Short.parseShort(anum);
		long lI = Long.parseLong(anum);
		float fI = Float.parseFloat(anum);
		double dI = Double.parseDouble(anum);
		int bbI = Integer.parseInt(bnum);
		int sum = aI +bbI;
		System.out.println(sum);
		System.out.println(bb);
	}
}
