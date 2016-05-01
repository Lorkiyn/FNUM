package KinoGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class KinoGUIOut extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JSeparator separator;
	/**
	 * Create the frame.
	 */
	public KinoGUIOut(int row, int chair) {
		setTitle("Kino");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 190, 414, 230);
		contentPane.add(table);
		
		separator = new JSeparator();
		separator.setBounds(10, 177, 414, 2);
		contentPane.add(separator);
	}
}
