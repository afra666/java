//JFrame主窗体paint方法
package p;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Shape extends JFrame{
	Shape(){
		this.setTitle("this");
		this.setBounds(300, 200, 1000, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JFrame jframe1=new JFrame("jframe1");
		jframe1.setBounds(400, 400, 400, 200);
		jframe1.setVisible(true);
		jframe1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
	
	@Override
	public void paint(Graphics g) {
		//Line 左上(100,100),右下(200,200)
		g.drawLine(100, 100, 200, 200);
		
		//Rect,左上(100,100),宽200,高100
		g.setColor(Color.YELLOW);
		g.drawRect(100, 100, 200, 100);
		g.fill3DRect(100, 100, 200, 100, true);
	}
	
	
	public static void main(String []args){
		new Shape();
	}
}
