package p;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrame040301 extends JFrame {

	private JPanel contentPane;
	StringBuffer strbf2=new StringBuffer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame040301 frame = new JFrame040301();
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
	public JFrame040301() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea t1 = new JTextArea();
		t1.setText("123");
		scrollPane.setViewportView(t1);
		
		/**
		 * 添加代码2
		 */
		JButton btnNewButton = new JButton("\u2190Backspace");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				strbf2=new StringBuffer(t1.getText());
				try {
					strbf2.delete(strbf2.length()-1, strbf2.length());
					t1.setText(strbf2.toString());
				} catch (Exception e1) {
					t1.setText("已全部清空");
				}
				
			}
		});
		/**
		 * 结束
		 */
		contentPane.add(btnNewButton, BorderLayout.EAST);
	}

}

		/**
		 * 核心代码
		 */
		JButton btnNewButton = new JButton("\u2190Backspace");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				strbf2=new StringBuffer(t1.getText());
				try {
					strbf2.delete(strbf2.length()-1, strbf2.length());
					t1.setText(strbf2.toString());
				} catch (Exception e1) {
					t1.setText("已全部清空");
				}
			}
		});

