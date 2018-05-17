import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;

/**
*
* @author Deepanshu Mourya(theDeepanshuMourya)
*/

@SuppressWarnings("serial")
public class Create_account extends JFrame {
	
	// Variables declaration - do not modify-
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	// End of variables declaration


	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Create_account() {
		super("Create Account");
		setTitle("IBank v1.0");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Create_account.class.getResource("/images/icons8-museum-16.png")));
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		conn = javaconnect.ConncrDB();
						
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Create_account.class.getResource("/images/Untitled-4.png")));
		label.setBounds(-11, 11, 232, 68);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Account No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(58, 120, 87, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MICR No.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(58, 161, 87, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPin.setBounds(58, 200, 87, 26);
		contentPane.add(lblPin);
		
		JLabel lblNewLabel_2 = new JLabel("Account Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(58, 237, 87, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(58, 275, 87, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(58, 319, 87, 28);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 120, 187, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(168, 161, 187, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(168, 202, 187, 27);
		contentPane.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 322, 187, 27);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Savings", "Current"}));
		comboBox.setBounds(168, 242, 187, 20);
		contentPane.add(comboBox);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setBounds(168, 281, 55, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBounds(225, 281, 64, 23);
		contentPane.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		buttonGroup.add(other);
		other.setBounds(291, 281, 64, 23);
		contentPane.add(other);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(385, 120, 111, 30);
		contentPane.add(lblName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(385, 161, 111, 28);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(385, 200, 111, 26);
		contentPane.add(lblNationality);
		
		JLabel lblCaste = new JLabel("Caste");
		lblCaste.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaste.setBounds(385, 237, 111, 27);
		contentPane.add(lblCaste);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(385, 275, 111, 30);
		contentPane.add(lblMobile);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecurityQuestion.setBounds(385, 319, 111, 28);
		contentPane.add(lblSecurityQuestion);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(506, 120, 204, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(506, 237, 204, 27);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(506, 275, 204, 27);
		contentPane.add(textField_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "What is your childhood nickname?", "What is your favorite movie?", "What is your first teacher's name?", "What is your pet's name?", "What is your favorite book?"}));
		comboBox_1.setBounds(506, 319, 204, 26);
		contentPane.add(comboBox_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(506, 161, 204, 28);
		contentPane.add(dateChooser);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hindu", "Muslim", "Sikh", "Christian", "Jain"}));
		comboBox_2.setBounds(506, 200, 204, 25);
		contentPane.add(comboBox_2);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnswer.setBounds(385, 369, 111, 28);
		contentPane.add(lblAnswer);
		
		RandomAcc();
		RandomMICR();
		RandomPIN();
		
		JButton btnNewButton = new JButton("Create");		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code to add details in account table in database.
				
				String sql = "insert into Account(Acc, Name, Acc_Type, MICR_No, DOB, PIN, Nationality, Caste, Gender, Mobile, Address, Sec_Q, Sec_A, Balance)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField.getText() );
					pst.setString(2, textField_3.getText() );
					pst.setString(3, (String) comboBox.getSelectedItem() );
					pst.setString(4, textField_1.getText() );
					pst.setString(5, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText() );
					pst.setString(6, textField_2.getText() );
					pst.setString(7, (String) comboBox_2.getSelectedItem() );
					pst.setString(8, textField_4.getText() );
					
					male.setActionCommand("Male");
					female.setActionCommand("Female");
					other.setActionCommand("Other");
					pst.setString(9, buttonGroup.getSelection().getActionCommand() );
					
					pst.setString(10, textField_6.getText() );
					pst.setString(11, textField_5.getText() );
					pst.setString(12, (String) comboBox_1.getSelectedItem() );
					pst.setString(13, textField_7.getText() );
					pst.setString(14, textField.getText() );
					
					pst.execute();
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Congratulations! /n Your account has been created. " , null , JOptionPane.PLAIN_MESSAGE );
					Bal();
					
					setVisible(false);
					Loading ob = new Loading();
					ob.setLocationRelativeTo(null);
					ob.setUpLoading();
					ob.setVisible(true);
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(Create_account.class.getResource("/images/icons8-add-user-male-16.png")));
		btnNewButton.setBounds(348, 430, 97, 23);
		contentPane.add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(506, 370, 204, 27);
		contentPane.add(textField_7);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				buttonGroup.clearSelection();
				dateChooser.setCalendar(null);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Create_account.class.getResource("/images/icons8-delete-16.png")));
		btnNewButton_1.setBounds(168, 430, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Authentication ob = new Authentication();
				ob.setLocationRelativeTo(null);
				ob.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Create_account.class.getResource("/images/icons8-go-back-16.png")));
		btnNewButton_2.setBounds(528, 430, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Thank You for Banking with us!");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setForeground(new Color(255, 69, 0));
		lblNewLabel_5.setBounds(278, 477, 179, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Copyrights(c) theDeepanshuMourya 2018.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(540, 483, 218, 20);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("All rights reserved.");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(647, 498, 111, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmount.setBounds(58, 369, 111, 28);
		contentPane.add(lblAmount);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(168, 372, 187, 25);
		contentPane.add(textField_8);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 153), 3), "Create Account", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 24), new Color(0, 0, 204)));
		panel.setBounds(35, 90, 694, 382);
		contentPane.add(panel);
	}
	
	//Method to add in Balances table in database
	public void Bal() {
		String sql = "insert into Balances(Name,Acc,MICR_No,Balance)values (?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, textField_3.getText());
			pst.setString(2, textField.getText());
			pst.setString(3, textField_1.getText());
			pst.setString(4, textField_8.getText());
			pst.execute();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	

	//Method to generate random Account No.
	private void RandomAcc() {
		Random rn = new Random();
		int min = 100000;
		int max = 999999;
		int n = rn.nextInt((max - min) + 1) + min;
		textField.setText(Integer.toString(n));
	}
	
	//Method to generate random MICR No.
	public void RandomMICR() {
		Random rn = new Random();
		int min = 6000;
		int max = 7999;
		int n = rn.nextInt((max - min) + 1) + min ;
		textField_1.setText(Integer.toString(n));		
	}
	
	//Method to generate random PIN
	public void RandomPIN() {
		Random ra = new Random();
		int min = 100;
		int max = 999;
		int n = ra.nextInt((max - min) + 1) + min;
		textField_2.setText(Integer.toString(n));
		
	}


}
