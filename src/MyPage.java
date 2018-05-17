import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

/**
*
* @author Deepanshu Mourya(theDeepanshuMourya)
*/

@SuppressWarnings("serial")
public class MyPage extends JFrame {
	
	// Variables declaration - do not modify-
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_11;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTable table;
	private JTable table_1;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_39;
	private JTextField textField_40;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	// End of variables declaration	
	

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	
	public MyPage() throws Exception {
		super("Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MyPage.class.getResource("/images/icons8-museum-16.png")));
		setTitle("IBank v1.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MyPage.class.getResource("/images/Untitled-4.png")));
		label.setBounds(0, 11, 229, 69);
		contentPane.add(label);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(585, 23, 57, 31);
		contentPane.add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setBounds(642, 23, 112, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		Calendar();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Calibri Light", Font.PLAIN, 22));
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tabbedPane.setBounds(10, 91, 744, 436);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Profile", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 54, 99, 24);
		panel.add(lblNewLabel);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth ");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(28, 100, 99, 24);
		panel.add(lblDateOfBirth);
		
		JLabel lblNationality = new JLabel("MICR No.");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(28, 145, 99, 24);
		panel.add(lblNationality);
		
		JLabel lblGender = new JLabel("Pin ");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(28, 190, 99, 24);
		panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(28, 237, 99, 24);
		panel.add(lblAddress);
		
		JLabel lblAccountNo = new JLabel("Account No.");
		lblAccountNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo.setBounds(356, 54, 80, 24);
		panel.add(lblAccountNo);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountType.setBounds(356, 100, 92, 24);
		panel.add(lblAccountType);
		
		JLabel lblCaste = new JLabel("Gender");
		lblCaste.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaste.setBounds(356, 145, 80, 24);
		panel.add(lblCaste);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(356, 190, 80, 24);
		panel.add(lblMobile);
		
		JLabel lblSecurity = new JLabel("Security Question");
		lblSecurity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecurity.setBounds(356, 237, 114, 24);
		panel.add(lblSecurity);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(130, 54, 182, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(130, 100, 182, 24);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(130, 145, 182, 24);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(130, 190, 182, 24);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(130, 237, 182, 24);
		panel.add(textField_6);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(492, 237, 195, 24);
		panel.add(textField_11);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(492, 54, 195, 24);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(492, 100, 195, 24);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(492, 145, 195, 24);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(492, 190, 195, 24);
		panel.add(textField_10);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				textField_6.setEditable(true);
				textField_10.setEditable(true);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(true);
			}
		});
		btnEdit.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-edit-file-16.png")));
		btnEdit.setBounds(467, 326, 89, 23);
		panel.add(btnEdit);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String value1 = textField_6.getText();
					String value2 = textField_10.getText();
					String value3 = textField_11.getText();
					String value4 = textField_12.getText();
					String value5 = textField_13.getText();
					String value6 = textField.getText();
					
					String sql = "update Account set Address ='"+value1+"',Mobile ='"+value2+"',Sec_Q ='"+value3+"', Caste ='"+value4+"',Sec_A ='"+value5+"' where Name='"+value6+"'";
					
					pst = conn.prepareStatement(sql);
					pst.executeUpdate();
					
					pst.close();
					
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Profile Updated!" , null , JOptionPane.INFORMATION_MESSAGE );
					
					textField_6.setEditable(false);
					textField_10.setEditable(false);
					textField_11.setEditable(false);
					textField_12.setEditable(false);
					textField_13.setEditable(false);
					
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(dialog, e);
				}
				
			}
		});
		btnSave.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-save-16.png")));
		btnSave.setBounds(585, 326, 89, 23);
		panel.add(btnSave);
		
		JLabel lblCaste_1 = new JLabel("Caste ");
		lblCaste_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaste_1.setBounds(28, 281, 99, 24);
		panel.add(lblCaste_1);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(130, 281, 182, 24);
		panel.add(textField_12);
		
		JLabel lblSecurityAnswer = new JLabel("Security Answer");
		lblSecurityAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecurityAnswer.setBounds(356, 281, 114, 24);
		panel.add(lblSecurityAnswer);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(492, 281, 195, 24);
		panel.add(textField_13);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(255, 11, 26, 18);
		panel.add(lblUser);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setBounds(291, 11, 112, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("");
		button.setBounds(413, 11, 22, 22);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = "Select * from Account where Name=?";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						String add1 = rs.getString("Name");
						textField_2.setText(add1);
						
						String add2 = rs.getString("DOB");
						textField_3.setText(add2);
						
						String add3 = rs.getString("MICR_No");
						textField_4.setText(add3);
						
						String add4 = rs.getString("Pin");
						textField_5.setText(add4);
						
						String add5 = rs.getString("Address");
						textField_6.setText(add5);
						
						String add6 = rs.getString("Acc");
						textField_7.setText(add6);
						
						String add7 = rs.getString("Acc_Type");
						textField_8.setText(add7);
						
						String add8 = rs.getString("Gender");
						textField_9.setText(add8);
						
						String add9 = rs.getString("Mobile");
						textField_10.setText(add9);
						
						String add10 = rs.getString("Sec_Q");
						textField_11.setText(add10);
						
						String add11 = rs.getString("Caste");
						textField_12.setText(add11);
						
						String add12 = rs.getString("Sec_A");
						textField_13.setText(add12);
						
						rs.close();
						pst.close();
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Please Enter correct name" , null , JOptionPane.WARNING_MESSAGE );
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}finally {
					try {
						rs.close();
						pst.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		button.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Deposit", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("User  ");
		lblName.setBounds(156, 49, 131, 22);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblName);
		
		JLabel lblName_1 = new JLabel("Name  ");
		lblName_1.setBounds(156, 96, 131, 22);
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblName_1);
		
		JLabel lblAccountNo_1 = new JLabel("Account No. ");
		lblAccountNo_1.setBounds(156, 143, 131, 22);
		lblAccountNo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblAccountNo_1);
		
		JLabel lblAvailableBalance = new JLabel("Available Balance");
		lblAvailableBalance.setBounds(156, 193, 131, 22);
		lblAvailableBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblAvailableBalance);
		
		JLabel lblDepositAmount = new JLabel("Deposit Amount");
		lblDepositAmount.setBounds(156, 245, 131, 22);
		lblDepositAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblDepositAmount);
		
		textField_14 = new JTextField();
		textField_14.setBounds(297, 43, 223, 30);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(297, 91, 223, 30);
		textField_15.setColumns(10);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setBounds(297, 139, 223, 30);
		textField_16.setColumns(10);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBounds(297, 188, 223, 30);
		textField_17.setColumns(10);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBounds(297, 237, 104, 30);
		textField_18.setColumns(10);
		panel_1.add(textField_18);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = "Select * from Balances where Name=?";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField_14.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						String add1 = rs.getString("Name");
						textField_15.setText(add1);
						
						String add2 = rs.getString("Acc");
						textField_16.setText(add2);
						
						String add3 = rs.getString("Balance");
						textField_17.setText(add3);
						
						rs.close();
						pst.close();
						
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Name entered is incorrect" , null , JOptionPane.WARNING_MESSAGE );
					}
					
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e );
				}finally {
					try {
						rs.close();
						pst.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		
		btnSearch.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		btnSearch.setBounds(565, 47, 89, 23);
		panel_1.add(btnSearch);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(418, 237, 102, 30);
		panel_1.add(textField_19);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String s1 = textField_17.getText();
					String s2 = textField_18.getText();
					
					int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
					String s = String.valueOf(sum);
					
					textField_19.setText(s);
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, null );
				}
			}
		});
		btnTotal.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-ok-16.png")));
		btnTotal.setBounds(565, 241, 89, 22);
		panel_1.add(btnTotal);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String value1 = textField_15.getText();
					String value2 = textField_19.getText();
					
					String sql = "update Balances set Balance = '"+value2+"' where Name = '"+value1+"'";
					pst = conn.prepareStatement(sql);
					pst.execute();
					
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Successfully Deposited" , null , JOptionPane.PLAIN_MESSAGE );
					
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					
				} catch (Exception e2) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e);
				}
			}
		});
		btnDeposit.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-plus-16.png")));
		btnDeposit.setBounds(565, 302, 89, 23);
		panel_1.add(btnDeposit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Transfer", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(143, 32, 121, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblName_2 = new JLabel("Name ");
		lblName_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_2.setBounds(143, 76, 121, 22);
		panel_2.add(lblName_2);
		
		JLabel lblAccountNo_2 = new JLabel("Account No.");
		lblAccountNo_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo_2.setBounds(143, 121, 121, 22);
		panel_2.add(lblAccountNo_2);
		
		JLabel lblAvailableBalance_1 = new JLabel("Available Balance ");
		lblAvailableBalance_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableBalance_1.setBounds(143, 167, 132, 22);
		panel_2.add(lblAvailableBalance_1);
		
		JLabel lblTransferAmount = new JLabel("Transfer Amount");
		lblTransferAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTransferAmount.setBounds(143, 214, 132, 22);
		panel_2.add(lblTransferAmount);
		
		JLabel lblCreditAmount = new JLabel("Recipient");
		lblCreditAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCreditAmount.setBounds(143, 259, 132, 22);
		panel_2.add(lblCreditAmount);
		
		textField_20 = new JTextField();
		textField_20.setBounds(285, 32, 198, 23);
		panel_2.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(285, 78, 198, 23);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(285, 120, 198, 23);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(285, 167, 198, 23);
		panel_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(285, 214, 92, 23);
		panel_2.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(391, 214, 92, 23);
		panel_2.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(285, 303, 92, 23);
		panel_2.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(392, 303, 92, 23);
		panel_2.add(textField_27);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String sql = "Select * from Balances where Name=?";
					try {
						pst = conn.prepareStatement(sql);
						pst.setString(1, textField_20.getText());
						rs = pst.executeQuery();
						
						if (rs.next()) {
							String add1 = rs.getString("Name");
							textField_21.setText(add1);
							
							String add2 = rs.getString("Acc");
							textField_22.setText(add2);
							
							String add3 = rs.getString("Balance");
							textField_23.setText(add3);
							
							rs.close();
							pst.close();
							
						} else {
							JDialog dialog = new JDialog();
							dialog.setAlwaysOnTop(true);    
							JOptionPane.showMessageDialog(dialog, "Name entered is incorrect" , null , JOptionPane.WARNING_MESSAGE );
						}
						
					} catch (Exception e1) {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, e1 );
					}finally {
						try {
							rs.close();
							pst.close();
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				}
			
		});
		btnSearch_1.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		btnSearch_1.setBounds(506, 32, 89, 23);
		panel_2.add(btnSearch_1);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s1 = textField_23.getText();
					String s2 = textField_24.getText();
					
					int sum = Integer.parseInt(s1) - Integer.parseInt(s2);
					String s = String.valueOf(sum);
					
					textField_25.setText(s);
				} catch (Exception e1) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, null );
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-ok-16.png")));
		btnNewButton.setBounds(506, 214, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnShow = new JButton("Show");
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String s1 = textField_24.getText();
					String s2 = textField_26.getText();
					
					int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
					String s = String.valueOf(sum);
					
					textField_27.setText(s);
				} catch (Exception e1) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, null );
				}
				
			}
		});
		btnShow.setBounds(506, 258, 89, 23);
		panel_2.add(btnShow);
		
		
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransferD();
				TransferC();
			}
			
			private void TransferC() {
				try {
					String value1 = textField_28.getText();
					String value2 = textField_27.getText();
					String sql = "update Balances set Balance = '"+value2+"' where Name = '"+value1+"'";
					pst = conn.prepareStatement(sql);
					pst.execute();
					
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Successfully Transferred" , null , JOptionPane.PLAIN_MESSAGE );
					
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e );
				}
			}

			private void TransferD() {
				try {
					String value1 = textField_20.getText();
					String value2 = textField_25.getText();
					String sql = "update Balances set Balance = '"+value2+"' where Name = '"+value1+"'";
					pst = conn.prepareStatement(sql);
					pst.execute();
										
					
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e );
				}
				
			}

			
		});
		btnTransfer.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-upload-16.png")));
		btnTransfer.setBounds(506, 303, 103, 23);
		panel_2.add(btnTransfer);
		
		textField_28 = new JTextField();
		textField_28.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				try {

					String a1 = textField_28.getText();
					String sql = "select * from Balances where Name=?";
					pst = conn.prepareStatement(sql);
					pst.setString(1, a1);
					rs = pst.executeQuery();
					
					
					if (rs.next()) {
						String add = rs.getString("Balance");
						textField_26.setText(add);
					}
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e );
				}
			}
		});
		textField_28.setColumns(10);
		textField_28.setBounds(285, 258, 198, 23);
		panel_2.add(textField_28);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Withdrawl", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblName_3 = new JLabel("User");
		lblName_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_3.setBounds(177, 32, 116, 22);
		panel_3.add(lblName_3);
		
		JLabel lblName_4 = new JLabel("Name");
		lblName_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_4.setBounds(177, 78, 116, 22);
		panel_3.add(lblName_4);
		
		JLabel lblAccountNo_3 = new JLabel("Account No. ");
		lblAccountNo_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo_3.setBounds(177, 123, 116, 22);
		panel_3.add(lblAccountNo_3);
		
		JLabel lblAvailableBalance_2 = new JLabel("Available Balance");
		lblAvailableBalance_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableBalance_2.setBounds(177, 169, 116, 22);
		panel_3.add(lblAvailableBalance_2);
		
		JLabel lblAmount = new JLabel("Amount ");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmount.setBounds(177, 213, 116, 22);
		panel_3.add(lblAmount);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotal.setBounds(177, 260, 116, 22);
		panel_3.add(lblTotal);
		
		textField_29 = new JTextField();
		textField_29.setBounds(303, 32, 179, 23);
		panel_3.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(303, 78, 179, 23);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(303, 123, 179, 23);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(303, 169, 179, 23);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(303, 213, 179, 23);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(303, 260, 179, 23);
		panel_3.add(textField_34);
		
		JButton btnSearch_2 = new JButton("Search");
		btnSearch_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = "Select * from Balances where Name=?";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField_29.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						String add1 = rs.getString("Name");
						textField_30.setText(add1);
						
						String add2 = rs.getString("Acc");
						textField_31.setText(add2);
						
						String add3 = rs.getString("Balance");
						textField_32.setText(add3);
						
						rs.close();
						pst.close();
						
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Name entered is incorrect" , null , JOptionPane.WARNING_MESSAGE );
					}
					
				} catch (Exception e1) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e1 );
				}finally {
					try {
						rs.close();
						pst.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		btnSearch_2.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		btnSearch_2.setBounds(510, 32, 89, 23);
		panel_3.add(btnSearch_2);
		
		JButton btnT = new JButton("Show");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s1 = textField_32.getText();
					String s2 = textField_33.getText();
					
					int sum = Integer.parseInt(s1) - Integer.parseInt(s2);
					String s = String.valueOf(sum);
					
					textField_34.setText(s);
				} catch (Exception e1) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, null );
				}
			}
		});
		btnT.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-ok-16.png")));
		btnT.setBounds(510, 260, 89, 23);
		panel_3.add(btnT);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String value1 = textField_30.getText();
					String value2 = textField_34.getText();
					
					String sql = "update Balances set Balance = '"+value2+"' where Name = '"+value1+"'";
					pst = conn.prepareStatement(sql);
					pst.execute();
					
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Successfully Withdrawn" , null , JOptionPane.OK_OPTION );
					
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");
					textField_34.setText("");
					
					
										
				} catch (Exception e2) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e);
				}
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWithdraw.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-withdrawal-limit-16.png")));
		btnWithdraw.setBounds(510, 309, 98, 23);
		panel_3.add(btnWithdraw);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Customers list", null, panel_4, null);
		panel_4.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(10, 10, 715, 332);

	    table = new JTable();
	    table.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    table.setGridColor(new Color(0, 0, 0));
	    table.setBounds(10, 10, 715, 332);
	    
		
	    scrollPane.setViewportView(table);
	    panel_4.add(scrollPane);
		
	    
		JPanel panel_5 = new JPanel();
		panel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_5.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Transaction", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
	    scrollPane1.setBounds(10, 10, 715, 341);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table_1.setGridColor(new Color(0, 0, 0));
		table_1.setBounds(10, 11, 715, 332);
		
		scrollPane1.setViewportView(table_1);
	    panel_5.add(scrollPane1);
		
	    
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("View Balance", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblUser_1 = new JLabel("User");
		lblUser_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser_1.setBounds(175, 11, 79, 26);
		panel_6.add(lblUser_1);
		
		JLabel lblName_5 = new JLabel("Name");
		lblName_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_5.setBounds(175, 59, 79, 26);
		panel_6.add(lblName_5);
		
		JLabel lblAccountNo_4 = new JLabel("Account No.");
		lblAccountNo_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo_4.setBounds(175, 105, 79, 26);
		panel_6.add(lblAccountNo_4);
		
		JLabel lblRateOfInterest = new JLabel("MICR No.");
		lblRateOfInterest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRateOfInterest.setBounds(175, 148, 79, 26);
		panel_6.add(lblRateOfInterest);
		
		JLabel lblRateOfInterest_1 = new JLabel("Rate of Interest %");
		lblRateOfInterest_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRateOfInterest_1.setBounds(175, 194, 122, 26);
		panel_6.add(lblRateOfInterest_1);
		
		JLabel lblAvailableBalance_3 = new JLabel("Available Balance");
		lblAvailableBalance_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableBalance_3.setBounds(175, 236, 122, 26);
		panel_6.add(lblAvailableBalance_3);
		
		JLabel lblModBalance = new JLabel("MOD Balance");
		lblModBalance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModBalance.setBounds(175, 279, 122, 26);
		panel_6.add(lblModBalance);
		
		JLabel lblNominee = new JLabel("Nominee");
		lblNominee.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNominee.setBounds(175, 323, 79, 26);
		panel_6.add(lblNominee);
		
		textField_35 = new JTextField();
		textField_35.setBounds(332, 11, 207, 26);
		panel_6.add(textField_35);
		textField_35.setColumns(10);
		
		
		
		JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(332, 55, 207, 26);
		panel_6.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(332, 105, 207, 26);
		panel_6.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(332, 148, 207, 26);
		panel_6.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(332, 194, 207, 26);
		panel_6.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(332, 236, 207, 26);
		panel_6.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(332, 279, 207, 26);
		panel_6.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(332, 323, 207, 26);
		panel_6.add(label_7);
		
		JButton btnSearch_3 = new JButton("Search");
		btnSearch_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = "Select * from Balances where Name=?";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField_35.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						String add1 = rs.getString("Name");
						label_1.setText(add1);
						
						String add2 = rs.getString("Acc");
						label_2.setText(add2);
						
						String add3 = rs.getString("Balance");
						label_5.setText(add3);
						
						String add4 = rs.getString("MICR_No");
						label_3.setText(add4);
						
						label_4.setText("9.24% p.a.");
						label_6.setText("0.0");
						label_7.setText("Not Registered.");
						
						rs.close();
						pst.close();
						
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Name entered is incorrect" , null , JOptionPane.WARNING_MESSAGE );
					}
					
				} catch (Exception e) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e );
				}finally {
					try {
						rs.close();
						pst.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		btnSearch_3.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		btnSearch_3.setBounds(571, 11, 89, 23);
		panel_6.add(btnSearch_3);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_35.setText("");
				label_1.setText("");
				label_2.setText("");
				label_3.setText("");
				label_4.setText("");
				label_5.setText("");
				label_6.setText("");
				label_7.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-delete-16.png")));
		btnNewButton_1.setBounds(571, 323, 89, 23);
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(70, 130, 180), 2));
		tabbedPane.addTab("Change Pin", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblUser_2 = new JLabel("User");
		lblUser_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser_2.setBounds(200, 28, 89, 24);
		panel_7.add(lblUser_2);
		
		textField_36 = new JTextField();
		textField_36.setBounds(314, 28, 200, 24);
		panel_7.add(textField_36);
		textField_36.setColumns(10);
		
		JButton btnSearch_4 = new JButton("Search");
		btnSearch_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "Select * from Account where Name=?";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField_36.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						String add1 = rs.getString("Name");
						textField_40.setText(add1);
												
						String add6 = rs.getString("Acc");
						textField_39.setText(add6);
						
												
						rs.close();
						pst.close();
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Please Enter correct name" , null , JOptionPane.WARNING_MESSAGE );
					}
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}finally {
					try {
						rs.close();
						pst.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		btnSearch_4.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-search-16.png")));
		btnSearch_4.setBounds(524, 28, 89, 23);
		panel_7.add(btnSearch_4);
		
		JLabel lblEnterOldPin = new JLabel("Enter Old Pin");
		lblEnterOldPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterOldPin.setBounds(200, 171, 89, 24);
		panel_7.add(lblEnterOldPin);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(314, 171, 200, 24);
		panel_7.add(textField_37);
		
		JLabel lblEnterNewPin = new JLabel("Enter New Pin");
		lblEnterNewPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterNewPin.setBounds(200, 218, 89, 24);
		panel_7.add(lblEnterNewPin);
		
		JButton btnChangePin = new JButton("Clear");
		btnChangePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_37.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
			}
		});
		btnChangePin.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-delete-16.png")));
		btnChangePin.setBounds(275, 310, 89, 23);
		panel_7.add(btnChangePin);
		
		JButton btnClear = new JButton("Change");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String value1 = textField_36.getText();
					
					@SuppressWarnings("deprecation")
					String value2 = passwordField_1.getText();
					@SuppressWarnings("deprecation")
					String value3 = passwordField.getText();
					if (value3.equals(value2)) {
						String sql = "update Account set Pin = '"+value2+"' where Name = '"+value1+"'";
						pst = conn.prepareStatement(sql);
						pst.execute();
						
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Pin Changed Successfully" , null , JOptionPane.PLAIN_MESSAGE );
						
						textField_36.setText("");
						textField_37.setText("");
						textField_39.setText("");
						textField_40.setText("");
						passwordField.setText("");
						passwordField_1.setText("");
						
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Pin does not match" , null , JOptionPane.WARNING_MESSAGE );
					}
					
					
				} catch (Exception e2) {
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, e2 );
				}
			}
		});
		btnClear.setIcon(new ImageIcon(MyPage.class.getResource("/images/icons8-synchronize-16 (2).png")));
		btnClear.setBounds(407, 310, 107, 23);
		panel_7.add(btnClear);
		
		JLabel lblAccountNo_5 = new JLabel("Account No.");
		lblAccountNo_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo_5.setBounds(200, 125, 89, 24);
		panel_7.add(lblAccountNo_5);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(314, 125, 200, 24);
		panel_7.add(textField_39);
		
		JLabel lblName_6 = new JLabel("Name");
		lblName_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_6.setBounds(200, 75, 89, 24);
		panel_7.add(lblName_6);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(314, 75, 200, 24);
		panel_7.add(textField_40);
		
		JLabel lblConfirmNewPin = new JLabel("Confirm New Pin");
		lblConfirmNewPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmNewPin.setBounds(200, 263, 100, 24);
		panel_7.add(lblConfirmNewPin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(314, 218, 200, 24);
		panel_7.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(314, 263, 200, 24);
		panel_7.add(passwordField_1);
		
		JLabel lblCopyrightscThedeepanshumourya = new JLabel("Copyrights(c) theDeepanshuMourya 2018.");
		lblCopyrightscThedeepanshumourya.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCopyrightscThedeepanshumourya.setBounds(564, 528, 200, 16);
		contentPane.add(lblCopyrightscThedeepanshumourya);
		
		JLabel lblNewLabel_2 = new JLabel("All rights reserved.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(671, 538, 93, 21);
		contentPane.add(lblNewLabel_2);
		
		conn = javaconnect.ConncrDB();
		Table();
		Table2();
	}
	
	//Method to generate toady's date in calendar
	public void Calendar() {
		java.util.Calendar cal = new GregorianCalendar();
		int month = cal.get(java.util.Calendar.MONTH);
		int year = cal.get(java.util.Calendar.YEAR);
		int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
		textField_1.setText(+day+"-"+(month+1)+"-"+year);
	}
	
	//Method to print table to view customer list 
	private void Table() {
		try {
			
			String sql = "select Acc,MICR_No,Acc_Type,Name,Gender,Mobile,Address From Account";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
						
		} catch (Exception e) {
			JDialog dialog = new JDialog();
			dialog.setAlwaysOnTop(true);    
			JOptionPane.showMessageDialog(dialog, e );
		}finally {
			try {
				rs.close();
				pst.close();
			} catch (Exception e2) {
				JDialog dialog = new JDialog();
				dialog.setAlwaysOnTop(true);    
				JOptionPane.showMessageDialog(dialog, e2 );
			}
		}
	}
	
	//Method to print table to view transactions
	private void Table2() {
		try {
			
			String sql = "select * From Balances";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
						
		} catch (Exception e) {
			JDialog dialog = new JDialog();
			dialog.setAlwaysOnTop(true);    
			JOptionPane.showMessageDialog(dialog, e );
		}finally {
			try {
				rs.close();
				pst.close();
			} catch (Exception e2) {
				JDialog dialog = new JDialog();
				dialog.setAlwaysOnTop(true);    
				JOptionPane.showMessageDialog(dialog, e2 );
			}
		}
	}
}
