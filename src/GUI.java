import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;


	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Compound Interest Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterPrincipalAmount = new JLabel("Enter Principal Amount:");
		lblEnterPrincipalAmount.setBounds(12, 12, 181, 15);
		contentPane.add(lblEnterPrincipalAmount);
		
		JLabel lblEnterAnnualRate = new JLabel("Enter Annual Rate:");
		lblEnterAnnualRate.setBounds(12, 39, 129, 15);
		contentPane.add(lblEnterAnnualRate);
		
		JLabel lblEnterTimeIn = new JLabel("Enter Time in Years:");
		lblEnterTimeIn.setBounds(12, 66, 138, 15);
		contentPane.add(lblEnterTimeIn);
		
		textField = new JTextField();
		textField.setBounds(183, 10, 255, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 37, 255, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(183, 64, 255, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		this.btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(183, 95, 255, 25);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(12, 133, 426, 127);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
	
	
	
	public void setListener(){
		this.btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double principalAmount = Double.parseDouble(textField.getText());
				double annualRate = Double.parseDouble(textField_1.getText());
				double years = Double.parseDouble(textField_2.getText());
				
				double result = KorkoaKorolle.laskeTulos(principalAmount, annualRate, years);
				System.out.println(result);
				
				textField_3.setText(Double.toString(result));
				
				
				
			}
			
			});
		
		
	
	
	
}}
