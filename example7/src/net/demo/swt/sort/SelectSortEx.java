package net.demo.swt.sort;

import java.util.Random;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SelectSortEx extends Shell {
	private Text textGenerateNumber;
	private Text textSortNumber;
	private int[] array = new int[10];

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Display display = Display.getDefault();
			SelectSortEx shell = new SelectSortEx(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public SelectSortEx(Display display) {
		super(display, SWT.CLOSE | SWT.MIN | SWT.TITLE);

		textGenerateNumber = new Text(this, SWT.BORDER);
		textGenerateNumber.setEditable(false);
		textGenerateNumber.setBounds(10, 10, 414, 80);

		Button btnGenerate = new Button(this, SWT.NONE);
		btnGenerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				genRandomNumberSeries(e);
			}
		});
		btnGenerate.setBounds(180, 96, 78, 25);
		btnGenerate.setText("Generate");

		textSortNumber = new Text(this, SWT.BORDER);
		textSortNumber.setEditable(false);
		textSortNumber.setBounds(10, 136, 414, 80);

		Button btnSort = new Button(this, SWT.NONE);
		btnSort.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sortNumberSeries(e);
			}
		});
		btnSort.setBounds(180, 222, 78, 25);
		btnSort.setText("Sort");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT\\Shell - Sort Demostration");
		setSize(450, 300);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	/**
	 * @brief Generate a series of random numbers.
	 * @param e
	 */
	protected void genRandomNumberSeries(SelectionEvent e) {
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
	protected void sortNumberSeries(SelectionEvent e) {
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
