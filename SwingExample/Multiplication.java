
//2015ko 3
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multiplication extends JFrame implements ActionListener {
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3, t4;
	private JButton b1, b2;

	public Multiplication() {
		l1 = new JLabel("Enter First Number: ");
		l1.setBounds(50, 50, 100, 30); // (x,y,width,height)
		l2 = new JLabel("Enter Second Number: ");
		l2.setBounds(50, 90, 100, 30);
		l3 = new JLabel("Result: ");
		l3.setBounds(50, 130, 100, 30);

		t1 = new JTextField(15);
		t1.setBounds(160, 50, 100, 30);
		t2 = new JTextField(15);
		t2.setBounds(160, 90, 100, 30);
		t3 = new JTextField(15);
		t3.setBounds(160, 130, 100, 30);

		b1 = new JButton("Multi");
		b1.setBounds(80, 170, 80, 30);
		b2 = new JButton("Exit");
		b2.setBounds(170, 170, 60, 30);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);

		// buttonclharulai ActionListener add garya
		b1.addActionListener(this);
		b2.addActionListener(this); // Exit buttonle kam garirako chaina

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(null); // setLayout(new FlowLayout()) garda huncha examma setBounds nagarikina
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {
			float x = Float.parseFloat(t1.getText()); // t1ma aako string value lai floatma convert gareko
			float y = Float.parseFloat(t2.getText());
			float z = x * y;

			String s = Float.toString(z); // aako Float resultlai stringma convert garne

			t3.setText(s);
			t3.setEnabled(false); // userle UIma aako resultlai edit garna paiyena
		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Multiplication();
	}
}