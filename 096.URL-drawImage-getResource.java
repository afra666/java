/**
|src--------
    |com--------
        |ui--------
            |GameFrame.java
            |GamePanel.java
            |graphics
        |app
            |App.java
*/
//App.java
package app;

import ui.GameFrame;

public class App {

	public static void main(String[] args) {
		new GameFrame().setVisible(true);

	}

}


//GameFrame.java
package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	int sW=screen.width;
	int sH=screen.height;
	int fW=1024;
	int fH=768;
	public GameFrame() {
		this.setTitle("Tetris");
		this.setBounds((sW-fW)/2-50, (sH-fH)/2-40, fW, fH);
//		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setContentPane(new GamePanel());
	}
}

//GamePanel.java
package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	URL bgURL=GamePanel.class.getResource("graphics/background/bg01.jpg");
	Image bgImg=new ImageIcon(bgURL).getImage();
//	Image bgImg=new ImageIcon("graphics/background/bg01.jpg").getImage();
	public GamePanel() {
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(200, 200, 32, 32);
    //绘制图形
		g.drawImage(bgImg,0,0,100,100,0,0,100,100,null);
	}
}
