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
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Tetris");
		this.setBounds((sW-fW)/2-50, (sH-fH)/2-40, fW, fH);
		this.setContentPane(new GamePanel());
	}
	
	
}

//GamePanel.java
package ui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public GamePanel() {
		
	}
	
	//此方法将component添加到jpanel
	@Override
	protected void paintComponent(Graphics g) {
		new Layer(0, 0, 7, 7).show(g);
	}
}

//Layer.java
package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Layer {
	final int ARC=7;
	//绝对宽度和长度
	int absW;
	int absH;
	//圆弧
	final int arcLenth=7;
	//1.->数据传入
	int layerX;
	int layerY;
	int layerW;
	int layerH;
	//图像
	URL windowImgURL=GamePanel.class.getResource("graphics/window/window.png");
	Image windowImg=new ImageIcon(windowImgURL).getImage();
	public Layer(int layerX,int layerY,int layerW,int layerH) {
		//起始点坐标xy,总宽度和总长度
		absW=layerW-arcLenth*2;
		absH=layerH-arcLenth*2;
		//数据传入
		this.layerX=layerX;
		this.layerY=layerY;
		this.layerW=layerW;
		this.layerH=layerH;
		
	}
	
	//当Graphics在paint方法内部时才开始绘图
	public void show(Graphics pic) {
		pic.drawImage(windowImg, layerX,layerY, layerX+ARC,layerY+ARC, 0, 0, 7, 7, null);
	}
	
	
}
