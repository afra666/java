//主类，需要JFrame，布局方式 null
this.add(new MenuBar().bar);



//子类 不需要JFrame，布局方式 null
package com.my.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar  implements ActionListener{
	public JMenuBar bar;
	public MenuBar() {
		System.out.println(9999);
		JMenu menu1=new JMenu("Theme");
		JMenuItem itm11=new JMenuItem("Spring");
		itm11.addActionListener(this);
		menu1.add(itm11);
		menu1.setVisible(true);
		menu1.setBounds(10, 0, 50, 20);

		
		bar=new JMenuBar();
		bar.add(menu1);
		bar.setBounds(0, 0, 800, 20);
		bar.setLayout(null);
		bar.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="Spring") {
			System.out.println(123);
		}
		
	}
}
