import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUI 
{
	Chiffrieren Chiffrieren = new Chiffrieren();
	private JFrame frame;
	private JTextField key;

	/**
	 * Launch the application.
	 */
	public void Haupt()
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
		
	}
	

	/**
	 * Create the application.
	 */
	public GUI() 
	{
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea input = new JTextArea();
		input.setForeground(Color.BLACK);
		input.setBounds(0, 31, 300, 80);
		input.setBackground(Color.LIGHT_GRAY);
		input.setWrapStyleWord(true);
		input.setLineWrap(true);
		frame.getContentPane().add(input);
		
		key = new JTextField();
		key.setForeground(Color.RED);
		key.setBackground(Color.WHITE);
		key.setBounds(38, 193, 184, 35);
		frame.getContentPane().add(key);
		key.setColumns(10);
		
		JTextArea output = new JTextArea();
		output.setEditable(false);
		output.setWrapStyleWord(true);
		output.setLineWrap(true);
		output.setBackground(Color.LIGHT_GRAY);
		output.setBounds(418, 31, 300, 80);
		frame.getContentPane().add(output);
		
		JLabel LabelEingabe = new JLabel("Texteingabe");
		LabelEingabe.setBackground(Color.WHITE);
		LabelEingabe.setBounds(80, 0, 94, 35);
		frame.getContentPane().add(LabelEingabe);
		
		JLabel LableAusgabe = new JLabel("Textausgabe");
		LableAusgabe.setBounds(535, 0, 142, 35);
		frame.getContentPane().add(LableAusgabe);
		
		JLabel LableKey = new JLabel("Key eingeben:");
		LableKey.setHorizontalAlignment(SwingConstants.CENTER);
		LableKey.setBounds(74, 172, 100, 20);
		frame.getContentPane().add(LableKey);
		
		JButton encryptButton = new JButton("Encrypt");
		encryptButton.setBounds(367, 193, 115, 35);
		frame.getContentPane().add(encryptButton);
		
		JButton decryptButton = new JButton("Decrypt");
		decryptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		decryptButton.setBounds(560, 193, 115, 35);
		frame.getContentPane().add(decryptButton);
		
		
		
			
		
		encryptButton.addActionListener(new ActionListener()
		{

			 public void actionPerformed(ActionEvent evt)
			 {
				 	int schlüssel = Integer.parseInt(key.getText());
					
				 	String inputtext = "";
					inputtext = input.getText();
					output.setText(Chiffrieren.chiffrierenCA(inputtext, schlüssel));
					input.setText("");
									
																				
					JOptionPane.showMessageDialog(null, "Verschlüsselung erfolgreich!", "Erfolg!", JOptionPane.INFORMATION_MESSAGE);
			 }
		});
		
		
		decryptButton.addActionListener(new ActionListener()
		{


			public void actionPerformed(ActionEvent evt)
			 {
				 	
				int schlüssel = Integer.parseInt(key.getText());
				
			 	String inputtext = "";
				inputtext = input.getText();
				output.setText(Chiffrieren.dechiffrierenCA(inputtext, schlüssel));
				input.setText("");
								
																			
				JOptionPane.showMessageDialog(null, "Entschlüsselung erfolgreich!", "Erfolg!", JOptionPane.INFORMATION_MESSAGE);			
					
					
					
					
			 }
		});
	
	
		
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
	



