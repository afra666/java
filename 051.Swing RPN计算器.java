/**Swing GUI
**
输入
5 + ((1 + 2) * 4) - 3
输出
5 1 2 + 4 * + 3 - 
*/
package p3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.security.acl.Group;
import java.util.Stack;
import java.util.StringTokenizer;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class Calc1 extends JFrame {
	String all_str_in;
	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc1 frame = new Calc1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * start
	 */
	/**
	 * end
	 */
	/**
	 * Create the frame.
	 */
	public Calc1() {
		setFont(new Font("Dialog", Font.PLAIN, 8));
		setTitle("\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 238, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[401px,grow][12px]", "[45px,grow][][45px][55px][45px][50px][]"));
		setResizable(false);
		
		tf1 = new JTextField();
		tf1.setBackground(Color.WHITE);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					
					
				}
			}
		});
		tf1.setText("");
		tf1.setHorizontalAlignment(SwingConstants.RIGHT);
		tf1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		contentPane.add(tf1, "cell 0 0,grow");
		tf1.setColumns(10);
		
		
		/**
		 * 按钮+字体+位置
		 */
		JButton btnNewButton = new JButton("(");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"(");
			}
		});
		JButton btnNewButton_1 = new JButton(") ");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+")");
			}
		});
		JButton btnAllClear = new JButton("AC");
		btnAllClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText("");
			}
		});
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					tf1.setText(tf1.getText().substring(0, tf1.getText().length()-1));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					tf1.setText("已清空");
				}
			}
			
		});
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"0");
			}
		});
		JButton button_2 = new JButton("7");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"7");
			}
		});
		JButton button_3 = new JButton("8");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"8");
			}
		});
		JButton button_4 = new JButton("9");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"9");
			}
		});
		JButton button_5 = new JButton(" + ");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"+");
			}
			
		});
		JButton button_6 = new JButton("4");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"4");
			}
		});
		JButton button_7 = new JButton("5");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"5");
			}
		});
		JButton button_8 = new JButton("6");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"6");
			}
		});
		JButton button_9 = new JButton(" - ");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"-");
			}
		});
		JButton button_10 = new JButton("1");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"1");
			}
		});
		JButton button_11 = new JButton("2");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"2");
			}
		});
		JButton button_12 = new JButton("3");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"3");
			}
		});
		JButton button_13 = new JButton(" * ");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"*");
			}
		});
		JButton button_14 = new JButton(". ");
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+".");
			}
		});
		JButton button_15 = new JButton("=");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				
				
			}
		});
		JButton button_16 = new JButton(" / ");
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText(tf1.getText()+"/");
			}
		});
		
		/**
		 * 字体
		 */
		button_5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		button_9.setFont(new Font("SansSerif", Font.PLAIN, 14));
		button_13.setFont(new Font("SansSerif", Font.PLAIN, 14));
		button_14.setFont(new Font("SansSerif", Font.BOLD, 12));
		button_15.setFont(new Font("SansSerif", Font.PLAIN, 13));
		button_16.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnAllClear.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		
		
		contentPane.add(btnNewButton, "flowx,cell 0 2,growx");
		contentPane.add(btnNewButton_1, "cell 0 2,growx");
		contentPane.add(btnNewButton_2, "flowx,cell 0 6,growx");
		contentPane.add(btnAllClear, "cell 0 2,alignx center,aligny center");
		contentPane.add(btnBackspace, "cell 0 2,growx");
		contentPane.add(button_2, "flowx,cell 0 3,growx");
		contentPane.add(button_3, "cell 0 3,growx");
		contentPane.add(button_4, "cell 0 3,growx");
		contentPane.add(button_5, "cell 0 3,growx");
		contentPane.add(button_6, "flowx,cell 0 4,growx");
		contentPane.add(button_7, "cell 0 4,growx");
		contentPane.add(button_8, "cell 0 4,growx");
		contentPane.add(button_9, "cell 0 4,growx");
		contentPane.add(button_10, "flowx,cell 0 5,growx");
		contentPane.add(button_11, "cell 0 5,growx");
		contentPane.add(button_12, "cell 0 5,growx");
		contentPane.add(button_13, "cell 0 5,growx");
		contentPane.add(button_14, "cell 0 6,growx");
		contentPane.add(button_15, "cell 0 6,growx");
		contentPane.add(button_16, "cell 0 6,growx");
		
		JRadioButton rioButton01 = new JRadioButton("\u56DB\u5219\u8FD0\u7B97");
		rioButton01.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		rioButton01.setSelected(true);
		contentPane.add(rioButton01, "flowx,cell 0 1");
		JRadioButton rioButton02 = new JRadioButton("RPN");
		rioButton02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (rioButton02.isSelected()) {
					try {
						String []usrAr=new MathFormat().valueOf(tf1.getText());
						String usrRsut=new RPN(usrAr).outputStr;
						tf1.setText(usrRsut);
					} catch (Exception e1) {
						tf1.setText("输入算式格式有误");
					}
				}
			}
		});
		rioButton02.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		contentPane.add(rioButton02, "cell 0 1");
		ButtonGroup gp1=new ButtonGroup();
			gp1.add(rioButton01);
			gp1.add(rioButton02);
		
	}
}







/*
 * 开始计算*
 */
class RPN{
	Stack<String> numStk=new Stack<String>();//堆栈（逆序）
	Stack<String> opStk=new Stack<String>();
	String []outputAr;//正序
	String outputStr;//正序
	
	RPN(String []input){
		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {                  
			case "+":popJudge(input[i],1);break; 
			case "-":popJudge(input[i],1);break; 
			case "*":popJudge(input[i],2);break; 
			case "/":popJudge(input[i],2);break; 
			case "(":opStk.push(input[i]);break; //左括号直接push
			case ")":
				while (!opStk.isEmpty()) {//处理右括号，一直pop到顶部为左括号为止
					if (opStk.peek().equals("(")) {opStk.pop();break;}
					else {numStk.push(opStk.pop());}
				}
				break; 
			default:numStk.push(input[i]);break; 
			}//switch
		}
		while (!opStk.isEmpty()) {
			if (opStk.peek()=="(") {
				opStk.pop();
			}
			numStk.push(opStk.pop());
		}
		int opStkSize=numStk.size();
		outputAr=new String[numStk.size()];
		for (int i =opStkSize-1; i>=0; i--) {
			outputAr[i]=(numStk.pop());
			
		}
		for (int i = 0; i < outputAr.length; i++) {
			if (i==0) {
				outputStr=outputAr[i]+" ";
			}
			else {
				outputStr=outputStr+outputAr[i]+" ";
			}
		}

	}
	void popJudge(String inputi,int isPri) {
		if (isPri==1) {
			if (opStk.isEmpty()||(priJudge(opStk.peek())==100)) {
				opStk.push(inputi);
			}
			else if ((priJudge(opStk.peek())==1)) {
				numStk.push(opStk.pop());
				opStk.push(inputi);
			}
			else if ((priJudge(opStk.peek())==2)) {
				while ((!(opStk.isEmpty()))) {
					numStk.push(opStk.pop());
				}
				opStk.push(inputi);//容易丢
			}

		}
		else if (isPri==2) {
			if (opStk.isEmpty()||(priJudge(opStk.peek())==100)) {
				opStk.push(inputi);
			}
			else if (priJudge(opStk.peek())==1) {
				opStk.push(inputi);
			}
			else if (priJudge(opStk.peek())==2) {
				numStk.push(opStk.pop());
				opStk.push(inputi);
			}

		}
	}	
	int priJudge(String s) {
		switch (s) {
		case ("+"):return 1;
		case ("-"):return 1;
		case ("*"):return 2;
		case ("/"):return 2;
		case ("("):return 100;
		default:return -1;
		}
	}
}
class MathFormat {
	String  []valueOf(String str1) {
		String str2;
		str2=str1.replace("+", " + ");
		str2=str2.replace("-", " - ");
		str2=str2.replace("*", " * ");
		str2=str2.replace("/", " / ");
		str2=str2.replace("(", " ( ");
		str2=str2.replace(")", " ) ");
		StringTokenizer toker=new StringTokenizer(str2," ");
		String []strAr3 = new String[toker.countTokens()];//此时确定长度,这里不能用length方法，否则报错
		for (int i = 0; toker.hasMoreElements(); i++) {
			strAr3[i]=toker.nextElement().toString();
		}
		return strAr3;
	}
}
/**
输入
5 + ((1 + 2) * 4) - 3
输出
5 1 2 + 4 * + 3 - 
*/
