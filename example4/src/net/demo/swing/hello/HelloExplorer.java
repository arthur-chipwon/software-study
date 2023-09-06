package net.demo.swing.hello;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class HelloExplorer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8730578320718512280L;
	private JPanel contentPane;
	private JLabel contentLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloExplorer frame = new HelloExplorer();
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
	public HelloExplorer() {
		setTitle("Swing\\JFrame - Say Hello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentLabel = new JLabel("");
		contentLabel.setText("Hello, explorer!");
		contentLabel.setHorizontalAlignment(JLabel.CENTER);
		contentLabel.setVerticalAlignment(JLabel.CENTER);
		add(contentLabel);
	}

}
