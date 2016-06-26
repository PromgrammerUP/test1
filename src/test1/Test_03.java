package test1;

public class Test_03 {
	//随机产生双色球数据
	//规则:(兰球)前六位随机产生1-32之间的随机数，不能出现重复, (红球)最后一位是1-16之间的整数
	//结果:返回长度为7的数组，前六位表示兰球，最后一位表示红球, 前六位排好序
	public static void main(String[] args) {
		int[] a = new int[7];
		for(int i=0;i<a.length;i++){
			if(i==0){
				a[i]=(int)(Math.random()*32+1);
			}
			else{
				int temp = (int)(Math.random()*32+1);
			}
		}
	}

}
