package tmp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Taschenrechner extends JFrame {

	private JPanel contentPane;
	private JTextField tfZaehler;
	private JTextField tfNenner;
	private JTextField tfErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Taschenrechner frame = new Taschenrechner();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	
	private void dividieren() {
		double ergebnis;
		double zaehler = 0.0;
		double nenner = 0.0;
		
		zaehler = Double.parseDouble(tfZaehler.getText());
		nenner = Double.parseDouble(tfNenner.getText());
		ergebnis = zaehler / nenner;
		tfErgebnis.setText("" + ergebnis);
	}
	
	public Taschenrechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfZaehler = new JTextField();
		tfZaehler.setBounds(42, 38, 86, 20);
		contentPane.add(tfZaehler);
		tfZaehler.setColumns(10);
		
		tfNenner = new JTextField();
		tfNenner.setBounds(232, 38, 86, 20);
		contentPane.add(tfNenner);
		tfNenner.setColumns(10);
		
		JLabel lblGeteiltDurch = new JLabel("geteilt durch");
		lblGeteiltDurch.setBounds(138, 41, 84, 14);
		contentPane.add(lblGeteiltDurch);
		
		JLabel lblErgibt = new JLabel("ergibt");
		lblErgibt.setBounds(356, 41, 46, 14);
		contentPane.add(lblErgibt);
		
		tfErgebnis = new JTextField();
		tfErgebnis.setEditable(false);
		tfErgebnis.setBounds(425, 38, 165, 20);
		contentPane.add(tfErgebnis);
		tfErgebnis.setColumns(10);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dividieren();
			}
		});
		btnBerechnen.setBounds(614, 37, 89, 23);
		contentPane.add(btnBerechnen);
	}
}
