import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

/**
*
* @author Deepanshu Mourya(theDeepanshuMourya)
*/

@SuppressWarnings("serial")
public class Authentication extends JFrame {
	
	// Variables declaration - do not modify-
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	
	private JTextField textField;
	private JPasswordField passwordField;
	// End of variables declaration
	

	/**
	 * Main Frame of the application.
	 * Launch the Frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
					Authentication frame = new Authentication();										
					frame.setResizable(false);					
					frame.setTitle("IBank");
					frame.setLocationRelativeTo(null);					
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("Could not load System look.");
				} 
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authentication() {
		super("Login");
		setTitle("IBank v1.0");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Authentication.class.getResource("/images/icons8-museum-16.png")));
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 363);
		getContentPane().setLayout(null);
		
		
		
		conn = javaconnect.ConncrDB(); 
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Authentication", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 24), new Color(0, 153, 255)));
		panel.setBounds(10, 11, 423, 291);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 32, 224, 71);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Authentication.class.getResource("/images/Untitled-4.png")));
		
		JLabel lblAccountNo = new JLabel("Username");
		lblAccountNo.setBounds(38, 149, 89, 20);
		panel.add(lblAccountNo);
		lblAccountNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 187, 89, 20);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(148, 150, 234, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String s1 = "IBank_User";
					String a1 = textField.getText();
					
					String s2 = "User@IBank";
					@SuppressWarnings("deprecation")
					String a2 = passwordField.getText();
					
					if (s1.equals(a1) && s2.equals(a2)) {
						setVisible(false);
						Loading ob = new Loading();
						ob.setLocationRelativeTo(null);
						ob.setUpLoading();
						ob.setVisible(true);
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Username or Password is incorrect" , null , JOptionPane.PLAIN_MESSAGE );
					}
				} catch (Exception e) {
					
				} 
				
			}
		});
		btnNewButton.setBounds(161, 247, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(Authentication.class.getResource("/images/icons8-login-16.png")));
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Create_account ob = new Create_account();
				ob.setLocationRelativeTo(null);
				ob.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(276, 247, 101, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(Authentication.class.getResource("/images/icons8-add-16.png")));
		
		JLabel label = new JLabel("");
		label.setBounds(382, 149, 31, 23);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\Mourya\\Downloads\\icons8-customer-16.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(382, 188, 31, 19);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mourya\\Downloads\\icons8-key-2-16.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 187, 234, 22);
		panel.add(passwordField);
		
		JLabel lblCopyrightscThedeepanshumourya = new JLabel("Copyrights(c) theDeepanshuMourya 2018.");
		lblCopyrightscThedeepanshumourya.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCopyrightscThedeepanshumourya.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCopyrightscThedeepanshumourya.setBounds(163, 306, 283, 23);
		getContentPane().add(lblCopyrightscThedeepanshumourya);
		
		JLabel lblAllRightsReserved = new JLabel("All rights reserved.");
		lblAllRightsReserved.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAllRightsReserved.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAllRightsReserved.setBounds(328, 319, 118, 21);
		getContentPane().add(lblAllRightsReserved);
	}
}
