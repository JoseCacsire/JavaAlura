import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.management.modelmbean.ModelMBean;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MiConversorMonedas {

	private JFrame frame;
	private JTextField txt;
	private JComboBox cbo;
	private JButton btn;
	private JLabel lbl;

	// mi codigo
	public enum Moneda {
		solesDolar, solesEuro, solesLibra, dolarSoles, euroSoles, libraSoles,
	}

	// mi codigo
	public double dolar = 2;
	public double euro = 3;
	public double libra = 4;

	public double valorImput = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiConversorMonedas window = new MiConversorMonedas();
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
	public MiConversorMonedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt = new JTextField();
		txt.setBounds(46, 30, 146, 26);
		frame.getContentPane().add(txt);
		txt.setColumns(10);

		lbl = new JLabel("00:00");
		lbl.setBounds(224, 33, 111, 20);
		frame.getContentPane().add(lbl);

		// Utilizando el metodo values para que me devuelva un array de la clase
		// moneda(enum)
		// Y se muestre en el ComboBox
		cbo = new JComboBox<Moneda>();
		cbo.setModel(new DefaultComboBoxModel<>(Moneda.values()));
		cbo.setBounds(46, 95, 146, 26);
		frame.getContentPane().add(cbo);

		// Evento del boton
		btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Convertir();
			}
		});
		btn.setBounds(224, 94, 115, 29);
		frame.getContentPane().add(btn);
	}

	protected void Convertir() {

		if (validar(txt.getText())) {

			// Obteniendo el valor seleccionado del combo box,pero para eso tengo
			// que hacer el casteo
			Moneda moneda = (Moneda) cbo.getSelectedItem();

			switch (moneda) {

			case solesDolar:
				solesAMoneda(dolar);
				break;
			case solesEuro:
				solesAMoneda(euro);
				break;
			case solesLibra:
				solesAMoneda(libra);
				break;
			case dolarSoles:
				monedaASoles(dolar);
				break;
			case euroSoles:
				monedaASoles(euro);
				break;
			case libraSoles:
				monedaASoles(libra);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + moneda);
			}
		}
	}

	private void monedaASoles(double moneda) {
		double res = valorImput * moneda;
		//lbl.setText(redondear(res));
		lbl.setText(Double.toString(Math.round(res * 100.0) / 100.0));
	}

	private void solesAMoneda(double moneda) {
		double res = valorImput / moneda;
		//Priemra opción
		lbl.setText(redondear(res));
		//Segunda opcíón
		//lbl.setText(Double.toString(Math.round(res * 100.0) / 100.0));
	}

	private String redondear(double valor) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		return df.format(valor);
	}

	public boolean validar(String texto) {
		try {
			double x = Double.parseDouble(texto);
			if (x > 0) {
				valorImput = x;
				return true;
			} else {
				lbl.setText("Ingresa un valor entero positivo");
				return false;
			}
		} catch (NumberFormatException e) {
			lbl.setText("Ingresa un valor numérico válido");
			return false;
		}
	}
}
