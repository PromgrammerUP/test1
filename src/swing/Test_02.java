package swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test_02 extends JFrame{
	private JPanel panel;
	public Test_02(){
		this.setTitle("第二个画板");
		this.setSize(500, 300);
		this.setLocation(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.pink);
		this.add(panel);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Test_02 t = new Test_02();
	}
}
