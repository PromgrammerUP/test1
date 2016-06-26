package test1;

import javax.swing.plaf.synth.SynthStyle;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.abs(-100);
		System.out.println(a);
		double b = Math.round(0.3);
		System.out.println(b);
		double c = Math.round(0.5);
		System.out.println(c);
		double d = Math.ceil(0.3);
		System.out.println(d);
		double e = Math.floor(0.3);
		System.out.println(e);
		for(int i=0;i<10;i++){
			int r =(int)(Math.random()*10);
			System.out.print(r+" ");
		}
	}

}
