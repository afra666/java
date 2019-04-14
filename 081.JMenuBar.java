package com.my.game;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**effect:
 *input:

 *output:

 *start
 */
public class Test0414{
	public static void main(String []args){
		new TestFrame();
	}
}
/**effect:
 *input:

 *output:

 *end
 */


class TestFrame  extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JMenuBar bar;
	public TestFrame() {
	System.out.println(9999);
	JMenu menu1=new JMenu("Theme");
	JMenuItem itm11=new JMenuItem("Spring");
	itm11.addActionListener(this);
	menu1.add(itm11);
	menu1.setVisible(true);

	
	JMenuBar bar=new JMenuBar();
	bar.add(menu1);
	this.setJMenuBar(bar);
	this.setBounds(30, 200, 300, 200);
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="Spring") {
			System.out.println(123);
		}
		
	}
}
