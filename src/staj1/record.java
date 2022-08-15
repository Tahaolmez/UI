package staj1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class record extends JFrame {

	private JPanel contentPane;
	private JTextField rcrdtxt;
	private JTextField rplytxt;
	private JTable dsttable;
	private JTable rcrdtable;
	Color dpanel = new Color(170,170,170);
	Color dspanel = new Color(140,140,140);
	Color dcomponent = new Color(130,130,130);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staj1whole frame = new staj1whole();
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
	public staj1whole() {
		colors colors= new colors();

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainpanel = new JPanel();
		
		mainpanel.setBounds(0, 0, 845, 435);
		contentPane.add(mainpanel);
		mainpanel.setLayout(null);
		
		JPanel submainpanel_1 = new JPanel();
		submainpanel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		submainpanel_1.setBounds(10, 74, 814, 216);
		mainpanel.add(submainpanel_1);
		submainpanel_1.setLayout(null);

		/*JButton mainbtn1 = new JButton("N");
		
		mainbtn1.setBounds(751, 7, 73, 45);
		mainpanel.add(mainbtn1);
		*/
		JToggleButton maintglbtn = new JToggleButton("N");
		maintglbtn.setBounds(751, 7, 73, 45);
		maintglbtn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		maintglbtn.setForeground(Color.WHITE);
		mainpanel.add(maintglbtn);
		
		
		
		JButton mainbtn2 = new JButton("RECORD");
		
		mainbtn2.setForeground(Color.WHITE);
		mainbtn2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn2.setBounds(10, 60, 242, 145);
		submainpanel_1.add(mainbtn2);
		
		JButton mainbtn3 = new JButton("LIVE DISTRUBITION");
		
		mainbtn3.setForeground(Color.WHITE);
		mainbtn3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn3.setBounds(279, 60, 242, 145);
		submainpanel_1.add(mainbtn3);
		
		JButton mainbtn4 = new JButton("REPLAY");
		
		mainbtn4.setForeground(Color.WHITE);
		mainbtn4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn4.setBounds(562, 60, 242, 145);
		submainpanel_1.add(mainbtn4);
		
		JLabel mainlbl1 = new JLabel("SYSTEM OPERATIONS");
		mainlbl1.setForeground(Color.WHITE);
		mainlbl1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mainlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		mainlbl1.setBounds(10, 11, 193, 38);
		submainpanel_1.add(mainlbl1);
		
		JButton mainbtn5 = new JButton("SERVER STATUS");
		mainbtn5.setBackground(Color.GREEN);
		mainbtn5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn5.setBounds(247, 0, 181, 37);
		mainpanel.add(mainbtn5);
		
		JButton mainbtn6 = new JButton("QUIT");
		
		mainbtn6.setForeground(Color.WHITE);
		mainbtn6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn6.setBounds(660, 355, 130, 55);
		mainpanel.add(mainbtn6);
		
		JButton mainbtn7 = new JButton("STORAGE %0");
		mainbtn7.setBackground(Color.GREEN);
		mainbtn7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mainbtn7.setBounds(10, 0, 181, 37);
		mainpanel.add(mainbtn7);

		JPanel rcrdpanel = new JPanel();
		rcrdpanel.setLayout(null);
		rcrdpanel.setBounds(10, 11, 826, 412);
		
		contentPane.add(rcrdpanel);
		rcrdpanel.setLayout(null);
		
		JPanel subrcrdpanel1 = new JPanel();
		subrcrdpanel1.setLayout(null);
		subrcrdpanel1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		subrcrdpanel1.setBounds(10, 265, 794, 64);
		
		rcrdpanel.add(subrcrdpanel1);
	
		JButton rcrdbtn1 = new JButton("Start");
		rcrdbtn1.setBounds(450, 10, 162, 43);
		rcrdbtn1.setForeground(Color.WHITE);
		
		subrcrdpanel1.add(rcrdbtn1);
		
		JComboBox rcrdcombo1 = new JComboBox();
		rcrdcombo1.setBounds(10, 10, 78, 43);
		
		rcrdcombo1.setForeground(Color.WHITE);
		rcrdcombo1.setModel(new DefaultComboBoxModel(new String[] {"30", "45", "60"}));
		
		subrcrdpanel1.add(rcrdcombo1);
		
		JButton rcrdbtn2 = new JButton("Stop");
		rcrdbtn2.setBounds(622, 10, 162, 43);
		
		rcrdbtn2.setForeground(Color.WHITE);
		subrcrdpanel1.add(rcrdbtn2);
		
		rcrdtxt = new JTextField();
		
		rcrdtxt.setColumns(10);
		rcrdtxt.setBounds(102, 11, 338, 42);
		
		rcrdtxt.setForeground(Color.WHITE);
		subrcrdpanel1.add(rcrdtxt);
		
		JPanel subrcrdpanel2 = new JPanel();
		subrcrdpanel2.setLayout(null);
		subrcrdpanel2.setBounds(10, 340, 794, 61);
		
		rcrdpanel.add(subrcrdpanel2);
		
		/*JButton rcrdbtn3 = new JButton("Help");
		rcrdbtn3.setBounds(5, 8, 89, 49);
		
		rcrdbtn3.setForeground(Color.WHITE);
		subrcrdpanel2.add(rcrdbtn3);
		*/
		JButton rcrdbtn4 = new JButton("Close");
		rcrdbtn4.setBounds(690, 8, 99, 49);
		
		rcrdbtn4.setForeground(Color.WHITE);
		subrcrdpanel2.add(rcrdbtn4);
		
		JScrollPane rcrdscroll = new JScrollPane();
		rcrdscroll.setBounds(10, 36, 794, 218);
		rcrdpanel.add(rcrdscroll);
		
		rcrdscroll.setViewportView(rcrdtable);
		
		JLabel rcrdlabel1 = new JLabel("RECORDING STATUS");
		rcrdlabel1.setHorizontalAlignment(SwingConstants.CENTER);
		rcrdlabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rcrdlabel1.setForeground(Color.WHITE);
		rcrdlabel1.setBounds(10, 11, 794, 25);
		rcrdpanel.add(rcrdlabel1);
		
		rcrdtxt.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || Character.isDigit(c))) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		
		rcrdtable = new JTable();
		rcrdtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Source", "Status", "Avaibility", "REC Start Time"
			}
		));
		/*Replay panel
		 * 
		 */
		JPanel rplypanel = new JPanel();
		rplypanel.setBounds(10, 11, 826, 412);
		contentPane.add(rplypanel);
		rplypanel.setLayout(null);
		
		
		
		JButton rplybtn_1 = new JButton("Search");
		rplybtn_1.setForeground(Color.WHITE);
		
		rplybtn_1.setBounds(485, 20, 149, 38);
		rplypanel.add(rplybtn_1);
		
		JButton rplybtn_2 = new JButton("Refresh");
		rplybtn_2.setForeground(Color.WHITE);
		
		rplybtn_2.setBounds(644, 20, 172, 38);
		rplypanel.add(rplybtn_2);
		
		rcrdtxt = new JTextField();
		rcrdtxt.setBackground(Color.LIGHT_GRAY);
		rcrdtxt.setForeground(Color.WHITE);
		rcrdtxt.setColumns(10);
		rcrdtxt.setBounds(10, 20, 465, 38);
		rplypanel.add(rcrdtxt);
		
		
		
		JPanel subrplypanel_1 = new JPanel();
		subrplypanel_1.setLayout(null);
		subrplypanel_1.setBounds(10, 296, 806, 50);
		rplypanel.add(subrplypanel_1);
		
		
		
		JButton rplybtn_3 = new JButton("MARK");
		rplybtn_3.setForeground(Color.WHITE);
		
		rplybtn_3.setBounds(647, 5, 159, 38);
		subrplypanel_1.add(rplybtn_3);
		
		JButton rplybtn_4 = new JButton("START");
		rplybtn_4.setForeground(Color.WHITE);
		
		rplybtn_4.setBounds(337, 5, 145, 38);
		subrplypanel_1.add(rplybtn_4);
		
		JButton rplybtn_5 = new JButton("STOP");
		rplybtn_5.setForeground(Color.WHITE);
		
		rplybtn_5.setBounds(492, 5, 145, 38);
		subrplypanel_1.add(rplybtn_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 5, 306, 38);
		subrplypanel_1.add(comboBox);
		
		JPanel subrplypanel_2 = new JPanel();
		subrplypanel_2.setLayout(null);
		subrplypanel_2.setBounds(10, 351, 806, 50);
		rplypanel.add(subrplypanel_2);
		
		
		JButton rplybtn_6 = new JButton("Close");
		rplybtn_6.setForeground(Color.WHITE);
		
		rplybtn_6.setBounds(618, 5, 183, 40);
		subrplypanel_2.add(rplybtn_6);
		
		/*JButton rplybtn_7 = new JButton("Help");
		rplybtn_7.setForeground(Color.WHITE);
		
		rplybtn_7.setBounds(15, 5, 174, 40);
		subrplypanel_2.add(rplybtn_7);
		*/
		JScrollPane rplyscroll = new JScrollPane();
		rplyscroll.setBounds(10, 65, 796, 220);
		rplypanel.add(rplyscroll);
		/*
		 * distrubition panel
		 * 
		 */
		
		
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
		dstlbl1.setForeground(Color.WHITE);
		dstlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		dstlbl1.setBounds(596, 27, 220, 38);
		dstpanel.add(dstlbl1);
		
		JLabel dstlbl2 = new JLabel("Destination");
		dstlbl2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		dstlbl2.setForeground(Color.WHITE);
		dstlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		dstlbl2.setBounds(602, 121, 214, 44);
		dstpanel.add(dstlbl2);
		
		JButton dstbtn1 = new JButton("Start");
		dstbtn1.setBounds(602, 227, 214, 44);
		
		dstbtn1.setForeground(Color.WHITE);
		dstpanel.add(dstbtn1);
		
		JButton dstbtn2 = new JButton("Stop");
		dstbtn2.setBounds(602, 282, 214, 44);
		
		dstbtn2.setForeground(Color.WHITE);
		dstpanel.add(dstbtn2);
		
		JButton dstbtn3 = new JButton("Close");
		dstbtn3.setBounds(601, 346, 215, 44);
		
		dstbtn3.setForeground(Color.WHITE);
		dstpanel.add(dstbtn3);
		
		rcrdpanel.setVisible(false);
		rplypanel.setVisible(false);
		dstpanel.setVisible(false);
		
		mainpanel.setBackground(dpanel);
		submainpanel_1.setBackground(dspanel);
		dstbtn3.setBackground(dcomponent);
		dstbtn2.setBackground(dcomponent);
		mainbtn2.setBackground(dcomponent);
		maintglbtn.setBackground(dcomponent);
		mainbtn3.setBackground(dcomponent);
		mainbtn4.setBackground(dcomponent);
		mainbtn6.setBackground(dcomponent);
		rcrdpanel.setBackground(dpanel);
		subrcrdpanel1.setBackground(dspanel);
		rcrdbtn1.setBackground(dcomponent);
		rcrdcombo1.setBackground(dcomponent);
		rcrdbtn2.setBackground(dcomponent);
		rcrdtxt.setBackground(dcomponent);
		subrcrdpanel2.setBackground(dspanel);
		//rcrdbtn3.setBackground(dcomponent);
		rcrdbtn4.setBackground(dcomponent);
		rplypanel.setBackground(dpanel);
		rplybtn_1.setBackground(dcomponent);
		rplybtn_2.setBackground(dcomponent);
		subrplypanel_1.setBackground(dspanel);
		rplybtn_3.setBackground(dcomponent);
		rplybtn_4.setBackground(dcomponent);
		rplybtn_5.setBackground(dcomponent);
		subrplypanel_2.setBackground(dspanel);
		rplybtn_6.setBackground(dcomponent);
		//rplybtn_7.setBackground(dcomponent);
		dstpanel.setBackground(dspanel);
		dstbtn1.setBackground(dcomponent);
		
		
		maintglbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(maintglbtn.getText()=="N") {
					maintglbtn.setText("M");
					dpanel = colors.lightpanel;
					dspanel = colors.lightsubpanel;
					dcomponent = colors.lightcomponents;
					
				}
				else {
					maintglbtn.setText("N");
					dpanel = colors.darkpanel;
					dspanel = colors.darksubpanel;
					dcomponent = colors.darkcomponents;
					
				}
				mainpanel.setBackground(dpanel);
				submainpanel_1.setBackground(dspanel);
				dstbtn3.setBackground(dcomponent);
				dstbtn2.setBackground(dcomponent);
				mainbtn2.setBackground(dcomponent);
				maintglbtn.setBackground(dcomponent);
				mainbtn3.setBackground(dcomponent);
				mainbtn4.setBackground(dcomponent);
				mainbtn6.setBackground(dcomponent);
				rcrdpanel.setBackground(dpanel);
				subrcrdpanel1.setBackground(dspanel);
				rcrdbtn1.setBackground(dcomponent);
				rcrdcombo1.setBackground(dcomponent);
				rcrdbtn2.setBackground(dcomponent);
				rcrdtxt.setBackground(dcomponent);
				subrcrdpanel2.setBackground(dspanel);
				//rcrdbtn3.setBackground(dcomponent);
				rcrdbtn4.setBackground(dcomponent);
				rplypanel.setBackground(dpanel);
				rplybtn_1.setBackground(dcomponent);
				rplybtn_2.setBackground(dcomponent);
				subrplypanel_1.setBackground(dspanel);
				rplybtn_3.setBackground(dcomponent);
				rplybtn_4.setBackground(dcomponent);
				rplybtn_5.setBackground(dcomponent);
				subrplypanel_2.setBackground(dspanel);
				rplybtn_6.setBackground(dcomponent);
				//rplybtn_7.setBackground(dcomponent);
				dstpanel.setBackground(dspanel);
				dstbtn1.setBackground(dcomponent);
			}
		});
		
		mainbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(false);
				rcrdpanel.setVisible(false);
				rplypanel.setVisible(false);
				dstpanel.setVisible(true);
			}
		});
		
		mainbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(false);
				rcrdpanel.setVisible(true);
				rplypanel.setVisible(false);
				dstpanel.setVisible(false);
			}
			
		});
		mainbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(false);
				rcrdpanel.setVisible(false);
				rplypanel.setVisible(true);
				dstpanel.setVisible(false);
			}
		});
		
		rplybtn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(true);
				rcrdpanel.setVisible(false);
				rplypanel.setVisible(false);
				dstpanel.setVisible(false);
			}
		});
		
		rcrdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(true);
				rcrdpanel.setVisible(false);
				rplypanel.setVisible(false);
				dstpanel.setVisible(false);
			}
		});
		
		dstbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(true);
				rcrdpanel.setVisible(false);
				rplypanel.setVisible(false);
				dstpanel.setVisible(false);
			}
		});
		
		mainbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		
	}

}
