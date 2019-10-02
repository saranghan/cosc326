package animation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Component;
import javax.swing.JLabel;

public class IntroPage extends JFrame{

	private JFrame frame;
	private JButton button2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroPage window = new IntroPage();
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
	public IntroPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					TwoPageTwo dataM = new TwoPageTwo();
					dataM.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
		});
		button2.setBounds(211, 171, 117, 29);
		frame.getContentPane().add(button2);
		
		JLabel label1 = new JLabel("Hello, what would you like to know?");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(73, 30, 234, 53);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/image1.png")).getImage();
		label2.setIcon(new ImageIcon(img));
		label2.setBounds(38, 95, 133, 135);
		frame.getContentPane().add(label2);
		
		JButton button = new JButton("1");
		/*
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					PacketEncap packetE = new PacketEncap();
					packetE.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
				}
			
		});
		*/
		button.setBounds(211, 123, 117, 29);
		frame.getContentPane().add(button);
	}
}