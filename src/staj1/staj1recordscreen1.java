package staj1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class staj1recordscreen1 extends JFrame {

	private JPanel contentPane;
	private JTextField rcrdtxt;
	private JTable rcrdtable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staj1recordscreen1 frame = new staj1recordscreen1();
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
	public staj1recordscreen1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 826, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel rcrdpane = new JPanel();
		rcrdpane.setLayout(null);
		rcrdpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		rcrdpane.setBounds(0, 0, 826, 412);
		panel.add(rcrdpane);
		
		JPanel rcrdpanel1 = new JPanel();
		rcrdpanel1.setLayout(null);
		rcrdpanel1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		rcrdpanel1.setBounds(10, 265, 794, 64);
		rcrdpane.add(rcrdpanel1);
		
		JButton rcrdbtn1 = new JButton("Start");
		rcrdbtn1.setBounds(450, 10, 162, 43);
		rcrdpanel1.add(rcrdbtn1);
		
		JComboBox rcrdcombo1 = new JComboBox();
		rcrdcombo1.setModel(new DefaultComboBoxModel(new String[] {"30", "45", "60"}));
		rcrdcombo1.setBounds(10, 10, 78, 43);
		rcrdpanel1.add(rcrdcombo1);
		
		JButton rcrdbtn2 = new JButton("Stop");
		rcrdbtn2.setBounds(622, 10, 162, 43);
		rcrdpanel1.add(rcrdbtn2);
		
		rcrdtxt = new JTextField();
		
		rcrdtxt.setColumns(10);
		rcrdtxt.setBounds(102, 11, 338, 42);
		rcrdpanel1.add(rcrdtxt);
		
		JPanel rcrdpanel2 = new JPanel();
		rcrdpanel2.setLayout(null);
		rcrdpanel2.setBounds(10, 340, 794, 61);
		rcrdpane.add(rcrdpanel2);
		
		JButton rcrdbtn3 = new JButton("Help");
		rcrdbtn3.setBounds(0, 11, 89, 49);
		rcrdpanel2.add(rcrdbtn3);
		
		JButton rcrdbtn4 = new JButton("Close");
		rcrdbtn4.setBounds(695, 11, 99, 49);
		rcrdpanel2.add(rcrdbtn4);
		
		JScrollPane rcrdscroll = new JScrollPane();
		rcrdscroll.setBounds(10, 36, 794, 218);
		rcrdpane.add(rcrdscroll);
		
		rcrdtable = new JTable();
		rcrdtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Source", "Status", "Avaibility", "REC Start Time"
			}
		));
		rcrdscroll.setViewportView(rcrdtable);
		
		JLabel rcrdlabel1 = new JLabel("RECORDING STATUS");
		rcrdlabel1.setHorizontalAlignment(SwingConstants.CENTER);
		rcrdlabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rcrdlabel1.setBounds(10, 11, 794, 25);
		rcrdpane.add(rcrdlabel1);
		
		rcrdtxt.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || Character.isDigit(c))) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
	}

}
