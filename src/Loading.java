import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

/**
*
* @author Deepanshu Mourya(theDeepanshuMourya)
*/

@SuppressWarnings("serial")
public class Loading extends JFrame {
	// Variables declaration - do not modify-	
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	int s =0;
	
	
	private JPanel contentPane;
	private JProgressBar progressBar;
	// End of variables declaration

		
	
	
	
	
	public void setUpLoading() {
		
		setVisible(true);		
		t.start();
	}
	
	
	/**
	 * Create the frame.
	 */
	
	
	public Loading() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Loading.class.getResource("/images/icons8-museum-16.png")));
		setTitle("IBank v1.0");
		
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		
				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(51, 102, 153), 3), "My Page", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 24), new Color(51, 102, 153)));
		panel.setBounds(25, 11, 269, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 29, 257, 78);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Loading.class.getResource("/images/Untitled-4.png")));
		
		progressBar = new JProgressBar();
		progressBar.setBounds(21, 118, 226, 34);
		panel.add(progressBar);
		progressBar.setForeground(new Color(0, 204, 51));
		progressBar.setStringPainted(true);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Redirecting...");
		lblNewLabel_1.setBounds(79, 163, 105, 19);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(44, 186, 176, 165);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Loading.class.getResource("/images/loader.gif")));
		
		JLabel lblNewLabel_3 = new JLabel("This software is verified as a secure and trusted site.");
		lblNewLabel_3.setForeground(new Color(255, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(25, 392, 269, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("All information sent or recieved");
		lblNewLabel_4.setForeground(new Color(255, 51, 51));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(25, 406, 269, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("is encrypted using 256-bit  encryption");
		lblNewLabel_5.setForeground(new Color(255, 51, 51));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(25, 423, 269, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Copyrights(c) theDeepanshuMourya 2018.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(112, 461, 205, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("All rights reserved.");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(210, 477, 107, 14);
		contentPane.add(lblNewLabel_7);
		
		  
	}
	
	//Method to run the ProgressBar
	Thread t = new Thread(){
		public void run() {		            	 
	          try {
		        for (int i = 0; i < 200; i++) {
					s = s+1;
					int m = progressBar.getMaximum();
					int v = progressBar.getValue();
					if (v<m) {
						progressBar.setValue(progressBar.getValue()+1);
						progressBar.setVisible(true);
					} else {
						i = 201;
						setVisible(false);
						MyPage ob = new MyPage();
						ob.setLocationRelativeTo(null);
						ob.setVisible(true);
					}
					Thread.sleep(50);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
	      }
    };
	
		
}
