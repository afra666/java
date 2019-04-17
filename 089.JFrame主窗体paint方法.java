//JFrame主窗体paint方法
package p;

import java.awt.Graphics;

import javax.swing.JFrame;


public class Shape extends JFrame{
	Shape(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.drawLine(60, 60, 80, 80);
	}
	public static void main(String []args){
		new Shape();
	}
}
