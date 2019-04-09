package com.p2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    
    public static void main(String[] args) {
    	/**
    	 * 以下5行为固定的格式
    	 */
       SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			myJFrame();
		}
	});
    }
    
    private static void myJFrame() {
    	/**
    	 * 创建新JFrame
    	 */
        JFrame j=new JFrame("This is a new JFrame");
        j.setVisible(true);
        j.setSize(500, 500);
    }
}
