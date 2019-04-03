package p;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MatrixJframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrixJframe frame = new MatrixJframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MatrixJframe() {
		setTitle("\u77E9\u9635\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 502, 653, -490);
		contentPane.add(scrollPane);
		
		
		
		JTextArea t1 = new JTextArea();
		t1.setText("1,2;"+"\n"+
				"3,4;"+"\n"+
				"5,6;");
		t1.setBounds(10, 48, 159, 238);
		contentPane.add(t1);
		
		JTextArea t2 = new JTextArea();
		t2.setText("4,1,2;"+"\n"+
				"7,3,5;");
		t2.setBounds(200, 48, 159, 238);
		contentPane.add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBounds(438, 48, 159, 238);
		contentPane.add(t3);
		
		JLabel lb01 = new JLabel("?");
		lb01.setBounds(179, 149, 55, 18);
		contentPane.add(lb01);
		
		
		JRadioButton rdbtnAXB = new JRadioButton("A x B");
		rdbtnAXB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnAXB.isSelected()) {
					lb01.setText("x");
				}
				else {
					lb01.setText("?");
				}
			}
		});
		rdbtnAXB.setBounds(371, 236, 55, 18);
		contentPane.add(rdbtnAXB);
		
		JRadioButton rdbtnAaddB = new JRadioButton("A + B");
		rdbtnAaddB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnAaddB.isSelected()) {
					lb01.setText("+");
				}
				else {
					lb01.setText("?");
				}
			}
		});
		rdbtnAaddB.setBounds(371, 266, 55, 18);
		contentPane.add(rdbtnAaddB);
		ButtonGroup btgp=new ButtonGroup();
		btgp.add(rdbtnAaddB);
		btgp.add(rdbtnAXB);
		
		
		
		
		
		
		JButton equalbutton = new JButton("=");
		
		equalbutton.setBounds(369, 143, 46, 30);
		contentPane.add(equalbutton);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(80, 31, 55, 18);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(269, 31, 55, 18);
		contentPane.add(lblB);
		
		/**
		 * 算法
		 * 数组double arA[i][m=1]存放A矩阵,数组arB[m=1][j]存放B矩阵,数组arC[i][j]存放C矩阵.
		 */
		
		/**
		 * 行数统计
		 */
		int matALine=t1.getLineCount();
		int matBLine=t2.getLineCount();
		System.out.println(matALine);
		System.out.println(matBLine);
		/**
		 * 列数统计
		 */
		/**
		 * 等号=(逗号+分号）/分号,然后向上取整
		 */
		equalbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int douhao_t1=0;
				int colum_t1=0;
				StringBuffer strbf_t1=new StringBuffer(t1.getText());
				for (int i = 0; i <strbf_t1.length(); i++) {
					if ((strbf_t1.charAt(i))==',') {
						douhao_t1++;
					}
				}
				if ((douhao_t1+t1.getLineCount())%t1.getLineCount()==0) {
					colum_t1=(douhao_t1+t1.getLineCount())/t1.getLineCount();
				}
				else if ((douhao_t1+t1.getLineCount())%t1.getLineCount()>=0) {
					colum_t1=((douhao_t1+t1.getLineCount())/t1.getLineCount())+1;
				}
				
				
				
				
				
				int douhao_t2=0;
				int colum_t2=0;
				StringBuffer strbf_t2=new StringBuffer(t2.getText());
				for (int i = 0; i <strbf_t2.length(); i++) {
					if ((strbf_t2.charAt(i))==',') {
						douhao_t2++;
					}
				}
				if ((douhao_t2+t2.getLineCount())%t2.getLineCount()==0) {
					colum_t2=(douhao_t2+t2.getLineCount())/t2.getLineCount();
				}
				else if ((douhao_t2+t2.getLineCount())%t2.getLineCount()>=0) {
					colum_t2=((douhao_t2+t2.getLineCount())/t2.getLineCount())+1;
				}
				
				
				t3.setText("t1行："+t1.getLineCount()+"\n"+
						"t1列："+String.valueOf(colum_t1)+"\n"+"t2行："+t2.getLineCount()+"\n"+
												"t2列："+String.valueOf(colum_t2)+"\n");
			}
		});
		
		
		
		
	}
}
