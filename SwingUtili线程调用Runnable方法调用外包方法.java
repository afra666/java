/**
 * main所在的类
 */
package com.application;
import javax.swing.SwingUtilities;

import com.view.*;//导入包
public class Application{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			 	new View("invokeLater").showMessage();
			}
		});
	}
}
/**
输出：
invokeLater.This message is from View.java
*/



/**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 * showMessage所在的类
 */

package com.view;
public class View{
	String keyIn;
	public View(String s){
		this.keyIn=s;
	}
	public void showMessage() {
		
			System.out.println(keyIn+"."+"This message is from View.java");
			
		}
	}
