package staj1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class staj1replayscreen1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staj1replayscreen1 frame = new staj1replayscreen1();
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
	public staj1replayscreen1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel rplypanel = new JPanel();
		rplypanel.setLayout(null);
		rplypanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		rplypanel.setBounds(10, 11, 826, 412);
		contentPane.add(rplypanel);
		
		JButton rplybtn_1 = new JButton("Search");
		rplybtn_1.setForeground(Color.WHITE);
		rplybtn_1.setBackground(new Color(130, 130, 130));
		rplybtn_1.setBounds(485, 20, 149, 34);
		rplypanel.add(rplybtn_1);
		
		JButton rplybtn_2 = new JButton("Refresh");
		rplybtn_2.setForeground(Color.WHITE);
		rplybtn_2.setBackground(new Color(130, 130, 130));
		rplybtn_2.setBounds(644, 20, 172, 34);
		rplypanel.add(rplybtn_2);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBounds(10, 20, 465, 34);
		rplypanel.add(textField);
		
		JPanel subrplypanel_1 = new JPanel();
		subrplypanel_1.setLayout(null);
		subrplypanel_1.setBounds(10, 296, 806, 50);
		rplypanel.add(subrplypanel_1);
		
		JButton rplybtn_3 = new JButton("MARK");
		rplybtn_3.setForeground(Color.WHITE);
		rplybtn_3.setBackground(new Color(130, 130, 130));
		rplybtn_3.setBounds(647, 5, 159, 34);
		subrplypanel_1.add(rplybtn_3);
		
		JButton rplybtn_4 = new JButton("START");
		rplybtn_4.setForeground(Color.WHITE);
		rplybtn_4.setBackground(new Color(130, 130, 130));
		rplybtn_4.setBounds(337, 5, 145, 34);
		subrplypanel_1.add(rplybtn_4);
		
		JButton rplybtn_5 = new JButton("STOP");
		rplybtn_5.setForeground(Color.WHITE);
		rplybtn_5.setBackground(new Color(130, 130, 130));
		rplybtn_5.setBounds(492, 5, 145, 34);
		subrplypanel_1.add(rplybtn_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 5, 306, 34);
		subrplypanel_1.add(comboBox);
		
		JPanel subrplypanel_2 = new JPanel();
		subrplypanel_2.setLayout(null);
		subrplypanel_2.setBounds(10, 351, 806, 50);
		rplypanel.add(subrplypanel_2);
		
		JButton rplybtn_6 = new JButton("Close");
		rplybtn_6.setForeground(Color.WHITE);
		rplybtn_6.setBackground(new Color(130, 130, 130));
		rplybtn_6.setBounds(623, 16, 183, 34);
		subrplypanel_2.add(rplybtn_6);
		
		JButton rplybtn_7 = new JButton("Help");
		rplybtn_7.setForeground(Color.WHITE);
		rplybtn_7.setBackground(new Color(130, 130, 130));
		rplybtn_7.setBounds(0, 16, 174, 34);
		subrplypanel_2.add(rplybtn_7);
		
		JScrollPane rplyscroll = new JScrollPane();
		rplyscroll.setBounds(20, 65, 796, 220);
		rplypanel.add(rplyscroll);
	}
}
