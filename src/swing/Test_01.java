package swing;

import javax.swing.JFrame;

public class Test_01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(500, 300);
		jf.setLocation(400, 250);
		jf.setResizable(false);
		jf.setTitle("第一个画板");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
