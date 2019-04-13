package com.my.control;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
	
public class Game extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public  Game() {
		Container tainer=this.getContentPane();
		tainer.setBackground(Color.blue);
		this.setBounds(400, 300, 810, 620);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tainer.setLayout(null);//abs layout
		
		JPanel jpn=new JPanel();
		jpn.setBackground(Color.gray);
		jpn.setBounds(0, 0, 800, 600);
		jpn.setLayout(null);
		tainer.add(jpn);
		
		JButton jbt=new JButton("button 1");
		jbt.setBounds(0, 0, 100, 50);
		jpn.add(jbt);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
