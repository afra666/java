/**
 * 将TextAera赋值给BigDecimal[x][y]
 */
package p;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.StringTokenizer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
public class JFrame040407 extends JFrame {
	boolean opbool=true;
	private JPanel contentPane;
	int lineA=0,lineB=0,coluA=0,coluB=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame040407 frame = new JFrame040407();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static BigDecimal [][]matrixMult(BigDecimal [][]arA,BigDecimal [][]arB) {
		BigDecimal[][]arC=new BigDecimal[arA.length][arB[0].length];
			if (arA[0].length==arB.length) {
				//注意删除这个for会出错
				for (int i = 0; i < arA.length; i++) {
					for (int j = 0; j < arB[0].length; j++) {
						arC[i][j]=new BigDecimal("0");
					}
				}
				int rowA=arA.length,coluA=arA[0].length,rowB=arB.length,coluB=arB[0].length;
				for (int i = 0; i <rowA; i++) {//按照A的行运算
					for (int j = 0; j <coluB; j++) {//按照B的列运算
						for (int k = 0; k <arB.length; k++) {//b有多少行，kmax即sigma的顶端就是几
						arC[i][j]=arC[i][j].add(arA[i][k].multiply(arB[k][j]));
					}
						
				}
			}
				
				
			}
			return arC;
			
		
	}
	public static BigDecimal [][]matrixAdd(BigDecimal [][]arA,BigDecimal [][]arB) {
		
		if ((arA.length==arB.length)&&(arA[0].length==arB[0].length)) {
			BigDecimal xyBigD[][]=new BigDecimal[arA.length][arA[0].length];
			for (int i = 0; i < arA.length; i++) {
				for (int j = 0; j < arA[0].length; j++) {
					xyBigD[i][j]=new BigDecimal("0");
					xyBigD[i][j]=arA[i][j].add(arB[i][j]);
				}
			}
			return xyBigD;
		}
		else {
			return null;
		}
		
		
		
		
		
		
		
	}
	/**
	 * Create the frame.
	 */
	public JFrame040407() {
		setTitle("\u77E9\u9635\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane SP1 = new JScrollPane();
		SP1.setBounds(10, 52, 158, 202);
		contentPane.add(SP1);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblX.setBounds(177, 143, 26, 18);
		contentPane.add(lblX);
		
		JTextArea t1 = new JTextArea();
		t1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		t1.setText("");
		SP1.setViewportView(t1);
		
		JScrollPane SP2 = new JScrollPane();
		SP2.setBounds(197, 52, 158, 202);
		contentPane.add(SP2);
		
		JTextArea t2 = new JTextArea();
		t2.setFont(new Font("SansSerif", Font.PLAIN, 20));
		t2.setText("");
		SP2.setViewportView(t2);
		
		JScrollPane SP3 = new JScrollPane();
		SP3.setBounds(432, 52, 158, 202);
		contentPane.add(SP3);
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("SansSerif", Font.PLAIN, 20));
		t3.setText("");
		SP3.setViewportView(t3);
		
		JButton eqbtn = new JButton("=");
		eqbtn.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		eqbtn.setBounds(364, 137, 58, 34);
		contentPane.add(eqbtn);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblA.setBounds(23, 34, 158, 18);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblB.setBounds(209, 34, 146, 18);
		contentPane.add(lblB);
		
		JRadioButton rdbtnAXB = new JRadioButton("A x B");
		rdbtnAXB.setSelected(true);
		rdbtnAXB.setBounds(367, 203, 58, 18);
		contentPane.add(rdbtnAXB);
		
		JRadioButton rdbtnAaddB = new JRadioButton("A + B");
		rdbtnAaddB.setBounds(367, 233, 58, 18);
		contentPane.add(rdbtnAaddB);
		ButtonGroup btngroup=new ButtonGroup();
		btngroup.add(rdbtnAXB);
		btngroup.add(rdbtnAaddB);
		
		JLabel label = new JLabel("\u8BF4\u660E\uFF1A\u8BF7\u52FF\u8F93\u5165\u7A7A\u884C");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label.setBounds(10, 278, 254, 18);
		contentPane.add(label);
		
		rdbtnAXB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/**
				 * 符号判断
				 */
				if (rdbtnAXB.isSelected()) {
					//乘法
					opbool=true;
					lblX.setText("X");
				}
				else if (rdbtnAaddB.isSelected()) {
					//加法
					opbool=false;
					lblX.setText("+");
				}
			}
		});
		rdbtnAaddB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/**
				 * 符号判断
				 */
				if (rdbtnAXB.isSelected()) {
					//乘法
					opbool=true;
					lblX.setText("X");
				}
				else if (rdbtnAaddB.isSelected()) {
					//加法
					opbool=false;
					lblX.setText("+");
				}
			}
		});
		eqbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/**
				 * 行统计
				 */
				lineA=t1.getLineCount();
				lineB=t2.getLineCount();
				/**
				 * 去空格、去换行,统计总元素个数
				 * 
				 */
				StringTokenizer tokenA=new StringTokenizer(t1.getText());
				StringTokenizer tokenB=new StringTokenizer(t2.getText());
				/**
				 * 列统计
				 */
				coluA=tokenA.countTokens()/lineA;
				coluB=tokenB.countTokens()/lineB;
				/**
				 * 标签输出行列
				 */
				lblA.setText("A ("+lineA+"行"+" "+coluA+"列)");
				lblB.setText("B ("+lineB+"行"+" "+coluB+"列)");
				/**
				 * 将tokenA,tockenB传入矩阵二维数组
				 * xyBigA[][],xyBigB[][]得到矩阵
				 */
				BigDecimal xyBigA[][]=new BigDecimal[lineA][coluA];
				BigDecimal xyBigB[][]=new BigDecimal[lineB][coluB];
				BigDecimal xyBigC[][]=new BigDecimal[lineA][coluB];
				BigDecimal xyBigD[][]=new BigDecimal[lineA][coluA];
				for (int i = 0; i < lineA; i++) {
					for (int j = 0; j < coluA; j++) {
						xyBigA[i][j]=new BigDecimal(tokenA.nextElement().toString());
						System.out.print(xyBigA[i][j]+" ");
					}
					System.out.println();
				}
				for (int i = 0; i <lineB; i++) {
					for (int j = 0; j <coluB; j++) {
						xyBigB[i][j]=new BigDecimal(tokenB.nextElement().toString());
						System.out.print(xyBigB[i][j]+" ");
					}
					System.out.println();
				}
				/**
				 * 矩阵乘法
				 * BigDecimal xyBigA[][]=new BigDecimal[lineA][coluA]
				 * BigDecimal xyBigB[][]=new BigDecimal[lineB][coluB]
				 */
				if (opbool==true) {
					try {
						xyBigC=matrixMult(xyBigA, xyBigB);
						for (int i = 0; i < xyBigA.length; i++) {
							for (int j = 0; j < xyBigB[0].length; j++) {
								if ((i==0)&&(j==0)) {
									t3.setText(xyBigC[0][0].toString()+" ");
								}
								else {
									t3.setText(t3.getText()+xyBigC[i][j].toString()+" ");
								}
								
								System.out.print(xyBigC[i][j]+" ");
							}
							t3.setText(t3.getText()+"\n");
							System.out.println();
						}
					} catch (Exception e) {
						t3.setText("输入矩阵有误或有空行");
					}
				}
				else if (opbool==false) {
					try {
						xyBigD=matrixAdd(xyBigA,xyBigB);
						for (int i = 0; i < xyBigD.length; i++) {
							for (int j = 0; j < xyBigD[0].length; j++) {
								if ((i==0)&&(j==0)) {
									t3.setText(xyBigD[i][j].toString()+" ");
								}
								else {
									t3.setText(t3.getText()+xyBigD[i][j].toString()+" ");
								}
							}
							t3.setText(t3.getText()+"\n");
						}
					} catch (Exception e) {
						t3.setText("输入矩阵有误或有空行");
					}
				}
				
				
				
				
				
			}
		});
		
		
	}
}
/**
t1输入：
1 2
3 4
5 6
t2输入：
4 6 1
2 5 1.6
t3乘法输出：
8 16 4.2 
20 38 9.4 
32 60 14.6  
*/
