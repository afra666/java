package com.p2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						createJFrame();
					}
				}
				
				);
	}
	public static void createJFrame(){
		JFrame jf1=new JFrame("3rd JFrame");
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		jf1.setSize(280,480);
		jf1.add(new MyPanel());
		jf1.pack();//最后大小是JPanel的尺寸
	}
}

class MyPanel extends JPanel{//继承JPanel
	public MyPanel() {//构造同名函数
		setBorder(BorderFactory.createLineBorder(Color.blue));//设置边框
	}

    public Dimension getPreferredSize() {//尺寸规定
        return new Dimension(250,200);
    }
	public void paintComponent(Graphics g) {//绘画组件
		super.paintComponent(g);//继承构造函数的重载，可以省略？
		g.drawString("This word is from Graphics", 100, 100);//文字和起始位置
	}
	
}
