package KinoGui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

public class KinoGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitle;
	private JTextField textFieldRow;
	private JLabel lblRow;
	private JLabel lblChair;
	private JTextField textFieldChair;
	private JButton btnGo;
	private JSeparator separator;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KinoGUI frame = new KinoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KinoGUI() {
		setTitle("Kino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTitle = new JLabel("Gr\u00F6\u00DFe des Kinosaals");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 225, 20);
		contentPane.add(lblTitle);


		lblRow = new JLabel("Reihen:");
		lblRow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRow.setBounds(10, 52, 105, 14);
		contentPane.add(lblRow);

		lblChair = new JLabel("Sitze pro Reihe:");
		lblChair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChair.setBounds(10, 81, 105, 14);
		contentPane.add(lblChair);
		
		textFieldRow = new JTextField();
		textFieldRow.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != ',')) {
					e.consume();

				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		textFieldRow.setBounds(125, 50, 110, 20);
		contentPane.add(textFieldRow);
		textFieldRow.setColumns(10);

		textFieldChair = new JTextField();
		textFieldChair.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != ',')) {
					e.consume();

				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		textFieldChair.setColumns(10);
		textFieldChair.setBounds(125, 79, 110, 20);
		contentPane.add(textFieldChair);

		btnGo = new JButton("Anzeigen");
		btnGo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					JFrame frame = new KinoGUIOut(Integer.parseInt(textFieldRow.getText()), Integer.parseInt(textFieldChair.getText()));
					frame.setVisible(true);
					
				} catch (NumberFormatException e) {
					exception("Bitte geben Sie die Größe des Kinosaals an.    ");
				}
			}
			
		});
		btnGo.setBounds(10, 106, 224, 54);
		contentPane.add(btnGo);
		
		separator = new JSeparator();
		separator.setBounds(10, 39, 225, 2);
		contentPane.add(separator);
	}
	
	private void exception(String text) {
		JOptionPane.showMessageDialog(this, text, "Eingabefehler", JOptionPane.ERROR_MESSAGE);
	}
}
