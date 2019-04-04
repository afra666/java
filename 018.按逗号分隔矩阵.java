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
import java.util.StringTokenizer;

public class MatrixJframe extends JFrame {

	private JPanel contentPane;
	int colum_t1=0,colum_t2=0;
	private final JScrollPane SP1 = new JScrollPane();
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
		setBounds(100, 100, 651, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblA.setBounds(55, 18, 91, 18);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(245, 18, 91, 18);
		contentPane.add(lblB);
		SP1.setBounds(6, 48, 164, 239);
		contentPane.add(SP1);
		
		
		
		JTextArea t1 = new JTextArea();
		SP1.setViewportView(t1);
		t1.setText("1,2;"+"\n"+
				"3,4;"+"\n"+
				"5,6;");
		
		JScrollPane SP2 = new JScrollPane();
		SP2.setBounds(195, 48, 164, 239);
		contentPane.add(SP2);
		
		JTextArea t2 = new JTextArea();
		SP2.setViewportView(t2);
		t2.setText("4,1,2;"+"\n"+
				"7,3,5;");
		int row_B=t2.getLineCount();
		
		JScrollPane SP3 = new JScrollPane();
		SP3.setBounds(438, 48, 164, 239);
		contentPane.add(SP3);
		
		JTextArea t3 = new JTextArea();
		SP3.setViewportView(t3);
		int row_A=t1.getLineCount();
		
		/**
		 * 算法
		 * 数组double arA[i][m=1]存放A矩阵,数组arB[m=1][j]存放B矩阵,数组arC[i][j]存放C矩阵.
		 */
		
		/**
		 * 行数统计， int row_A,row_B;
		 */
		/**
		 * 等号Clicked事件。列数统计,等号=(逗号+分号）/分号,然后向上取整
		 */
		equalbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
				int douhao_t1=0;
//				int colum_t1=0;
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
//				int colum_t2=0;
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
				
				
			
			
			
				/**
				 * 行列显示label
				 */
				lblA.setText("A ("+row_A+"行,"+colum_t1+"列)");
				lblB.setText("B ("+row_B+"行,"+colum_t2+"列)");
				/**
				 * 结束
				 */
			
				StringTokenizer strtkn=new StringTokenizer(t2.getText(),",");
				t3.setText(strtkn.nextToken()+"\n");
				t3.setText(t3.getText()+strtkn.nextToken()+"\n");
				t3.setText(t3.getText()+strtkn.nextToken()+"\n");
				t3.setText(t3.getText()+strtkn.nextToken()+"\n");
				t3.setText(t3.getText()+strtkn.nextToken()+"\n");
			
			
			}
			
			
		});
		/**
		 * Clicked结束
		 */
		
		
	}
}
/**
伪运行结果：
t1：
1,2;
3,4;
5,6;
t2：
4,1,2;
7,3,5;
t3：
4
1
2;
7
3
5;
*/
