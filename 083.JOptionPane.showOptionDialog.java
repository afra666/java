package com.my;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

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


class TestFrame  extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TestFrame() {
		Object[] options = {"Replay","Next Level"};
		
		int response=JOptionPane.showOptionDialog(this, "CONGRATULATIONS\nYOU WIN !", "YOU WIN !",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if(response==0)
		{
			this.setTitle("您按下了第OK按钮 ");
		}
		else if(response==1)
		{ this.setTitle("您按下了第Cancel按钮 ");
		}
	
		
	}

}
