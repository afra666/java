//   1/3Main.java

package p;

public class Main {
	public static void main(String[] args) {
		new MainFrame();
	}
}

//  2/3MainFrame.java


package p;

import java.awt.Color;
import javax.swing.JFrame;

public class MainFrame{
	public MainFrame(){
		
		Shape shape1 = new Shape();//can't be null.already draw.
		shape1.setBackground(Color.blue);
		
		JFrame frame1 = new JFrame("frame1");
		frame1.add(shape1);//or use:getContentPane().add();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setSize(300, 300);
		frame1.setVisible(true);
		}
}

// 3/3Shape.java
package p;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//type:jpanel
public class Shape extends JPanel{

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		super.paint(g);//back color use
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		}
		
}
