package net.demo.swing.sort;

import java.util.Random;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class SelectSort extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2151868107746847194L;
	private JPanel contentPane;
	private JTextArea textGenerateNumber;
	private JTextArea textSortNumber;
	private int[] array = new int[10];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectSort frame = new SelectSort();
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
	public SelectSort() {
		setResizable(false);
		setTitle("Swing\\JFrame - Sort Demostration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textGenerateNumber = new JTextArea();
		textGenerateNumber.setEditable(false);
		textGenerateNumber.setBounds(10, 10, 414, 80);
		contentPane.add(textGenerateNumber);

		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genRandomNumberSeries(e);
			}
		});
		btnGenerate.setBounds(170, 98, 87, 23);
		contentPane.add(btnGenerate);

		textSortNumber = new JTextArea();
		textSortNumber.setEditable(false);
		textSortNumber.setBounds(10, 140, 414, 80);
		contentPane.add(textSortNumber);

		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortNumberSeries(e);
			}
		});
		btnSort.setBounds(170, 228, 87, 23);
		contentPane.add(btnSort);
	}

	/**
	 * @brief Generate a series of random numbers.
	 * @param e
	 */
	protected void genRandomNumberSeries(ActionEvent e) {
		Random random = new Random();
		textGenerateNumber.setText("");
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(99);
			textGenerateNumber.append(array[i] + "  ");
		}
	}
	/**
	 * @brief Sort a series of numbers
	 * @param e
	 */
	protected void sortNumberSeries(ActionEvent e) {
		textSortNumber.setText("");
		String change = textGenerateNumber.getText();
		if(false == change.isEmpty()) {
			for(int i = 0, j = 1; j < array.length; i++, j++) {
				if(array[i] > array[j]) {
					int q = j;
					for(int p = q - 1; q != 0; p--, q--) {
						if(array[p] <= array[q]) {
							break;
						}
						array[p] ^= array[q];
						array[q] ^= array[p];
						array[p] ^= array[q];
					}
				}
		    }
			for(int i = 0; i < array.length; i++) {
				textSortNumber.append(array[i] + "  ");
			}
		}
	}

}
