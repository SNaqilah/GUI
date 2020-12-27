import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class GITHUB {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldAns;
	private JButton btnADD;
	private JButton btnMINUS;
	private JButton btnMULTI;
	private	JButton btnDEVIDE;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GITHUB window = new GITHUB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GITHUB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(64, 32, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 32, 123, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	    btnADD= new JButton("ADD");
	    btnADD.setBackground(Color.PINK);
	    btnADD.setForeground(Color.RED);
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnADD.setBounds(98, 87, 89, 23);
		frame.getContentPane().add(btnADD);
		
		 btnMINUS = new JButton("MINUS");
		 btnMINUS.setBackground(Color.PINK);
		 btnMINUS.setForeground(Color.RED);
		btnMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnMINUS.setBounds(190, 87, 89, 23);
		frame.getContentPane().add(btnMINUS);
		
		 btnMULTI = new JButton("MULTIPLY");
		 btnMULTI.setForeground(Color.RED);
		 btnMULTI.setBackground(Color.PINK);
		btnMULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1*num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnMULTI.setBounds(98, 121, 89, 23);
		frame.getContentPane().add(btnMULTI);
		
	    btnDEVIDE = new JButton("DEVIDE");
	    btnDEVIDE.setForeground(Color.RED);
	    btnDEVIDE.setBackground(Color.PINK);
		btnDEVIDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					
					ans=num1/num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnDEVIDE.setBounds(190, 121, 89, 23);
		frame.getContentPane().add(btnDEVIDE);
		
		JLabel lblNewLabel = new JLabel("ANSWER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(108, 181, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setText("");
		textFieldAns.setBounds(197, 178, 86, 20);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
