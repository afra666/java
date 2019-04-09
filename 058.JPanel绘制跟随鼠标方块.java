package com.p2;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
    } 
    
}
class MyPanel extends JPanel{
	int squareX=80,squareY=80,squareW=30,squareH=30;//方块坐标和宽高
	public MyPanel() {//构造函数
		setBorder(BorderFactory.createLineBorder(Color.yellow));//设置边框颜色
	
	addMouseListener(new MouseAdapter() {//添加鼠标点击事件
		@Override
		public void mousePressed(MouseEvent e) {//鼠标点击事件
			
			super.mousePressed(e);//继承JPanelmousePressed事件
			moveSqure(e.getX(), e.getY());//鼠标坐标传入绘图
		}
	});
	addMouseMotionListener(new MouseAdapter() {//鼠标移动事件
		@Override
		public void mouseDragged(MouseEvent e) {
			
			super.mouseDragged(e);
			moveSqure(e.getX(), e.getY());//鼠标坐标传入绘图
		}
	});
	}
	void moveSqure(int x,int y) {//移动方块
		int OFFSET=1;//起始值为1//去边框
		if ((squareX!=x)||(squareY!=y)) {//如果方块的起始坐标不等于鼠标坐标
			repaint(squareX, squareY, squareW+OFFSET, squareH+OFFSET);//去边框
			squareX=x;
			squareY=y;
			repaint(squareX, squareY, squareW+OFFSET, squareH+OFFSET);//去边框
		}
	}
	public Dimension getPreferredSize() {//设置尺寸JPanel
		return new Dimension(250,200);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("This is from 4th Graphics", 30, 10);
		g.setColor(Color.yellow);
		g.fillRect(squareX, squareY, squareW, squareH);//填充矩形黄色
		g.setColor(Color.gray);
		g.drawRect(squareX, squareY, squareW, squareH);//画边矩形灰色
		
	}
}
