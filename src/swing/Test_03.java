package swing;

import java.awt.Button;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test_03 extends JFrame{
	private JPanel panel;
	public Test_03(){
		this.setTitle("第二个画板");
		this.setSize(500, 300);
		this.setLocation(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		JButton b1 = new JButton("按钮一");
		Button  b2 = new Button("按钮二");
		ImageIcon icon = new ImageIcon("c:/xxx.jpg");
		JButton b3  = new JButton(icon);
		panel.setBackground(Color.pink);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		this.add(panel);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Test_03 t = new Test_03();
	}
}
