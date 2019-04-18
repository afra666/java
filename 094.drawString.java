package j04181;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setContentPane(new MyPanel());
		frame.setVisible(true);
	}
}
class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.setFont(new Font("黑体", Font.BOLD, 32));
		g.drawString("分数:200", 32, 32);
	}
}
