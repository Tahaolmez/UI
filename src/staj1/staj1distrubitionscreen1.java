package staj1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class staj1distrubitionscreen1 extends JFrame {

	private JPanel contentPane;
	private JTable dsttable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staj1distrubitionscreen1 frame = new staj1distrubitionscreen1();
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
	public staj1distrubitionscreen1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel dstpanel = new JPanel();
		dstpanel.setBounds(10, 11, 826, 412);
		contentPane.add(dstpanel);
		dstpanel.setLayout(null);
		
		JScrollPane dstscroll = new JScrollPane();
		dstscroll.setBounds(10, 11, 582, 390);
		dstpanel.add(dstscroll);
		
		dsttable = new JTable();
		dsttable.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		dsttable.getColumnModel().getColumn(0).setPreferredWidth(190);
		dsttable.getColumnModel().getColumn(1).setPreferredWidth(15);
		dsttable.getColumnModel().getColumn(2).setPreferredWidth(190);
		dstscroll.setViewportView(dsttable);
		
		JComboBox dstcombo1 = new JComboBox();
		dstcombo1.setModel(new DefaultComboBoxModel(new String[] {"OPCON-1", "OPCON-2", "OPCON-3"}));
		dstcombo1.setBounds(602, 66, 214, 44);
		dstpanel.add(dstcombo1);
		
		JComboBox dstcombo2 = new JComboBox();
		dstcombo2.setModel(new DefaultComboBoxModel(new String[] {"OPCON-1", "OPCON-2", "OPCON-3"}));
		dstcombo2.setBounds(602, 162, 214, 44);
		dstpanel.add(dstcombo2);
		
		JLabel dstlbl1 = new JLabel("Source");
		dstlbl1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		dstlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		dstlbl1.setBounds(596, 27, 220, 38);
		dstpanel.add(dstlbl1);
		
		JLabel dstlbl2 = new JLabel("Destination");
		dstlbl2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		dstlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		dstlbl2.setBounds(602, 121, 214, 44);
		dstpanel.add(dstlbl2);
		
		JButton dstbtn1 = new JButton("Start");
		dstbtn1.setBounds(602, 227, 214, 44);
		dstpanel.add(dstbtn1);
		
		JButton dstbtn2 = new JButton("Stop");
		dstbtn2.setBounds(602, 282, 214, 44);
		dstpanel.add(dstbtn2);
		
		JButton dstbtn3 = new JButton("Close");
		dstbtn3.setBounds(601, 346, 215, 44);
		dstpanel.add(dstbtn3);
	}
}
