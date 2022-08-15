package staj1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class stajmainscreen1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stajmainscreen1 frame = new stajmainscreen1();
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
	public stajmainscreen1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(170,170,170));
		panel1.setBounds(0, 0, 845, 435);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(140,140,140));
		panel_1.setBounds(10, 74, 814, 216);
		panel1.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("RECORD");
		btnNewButton.setBackground(new Color(130,130,130));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 60, 242, 145);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LIVE DISTRUBITION");
		btnNewButton_1.setBackground(new Color(130,130,130));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(279, 60, 242, 145);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("REPLAY");
		btnNewButton_2.setBackground(new Color(130,130,130));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.setBounds(562, 60, 242, 145);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("SYSTEM OPERATIONS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 193, 38);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("SERVER STATUS");
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_4.setBounds(247, 0, 181, 37);
		panel1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("QUIT");
		btnNewButton_5.setBackground(new Color(130,130,130));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_5.setBounds(660, 355, 175, 69);
		panel1.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("STORAGE %0");
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.setBounds(10, 0, 181, 37);
		panel1.add(btnNewButton_3);
		
		JButton mainbtn1 = new JButton("M-N");
		mainbtn1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn1.setBounds(751, 7, 73, 45);
		panel1.add(mainbtn1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(30, 355, 121, 23);
		panel1.add(tglbtnNewToggleButton);
		
		//panel1.setVisible(false);
	}
}
