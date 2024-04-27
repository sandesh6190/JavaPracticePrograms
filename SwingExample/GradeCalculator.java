import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame implements ActionListener {
	// for displaying inputtype data
	private JLabel l1, l2, l3, l4, l5, l6;
	private JTextField t1, t2, t3, t4, t5;
	private JButton b1;

	// for displayin calculated data
	private JLabel l7, l8, l9, l10, l11, l12, l13;

	public GradeCalculator() {
		super("Grade Calculator");

		// reference variable
		// for displaying inputtype data
		l1 = new JLabel("Name: ");
		l2 = new JLabel("Class: ");
		l3 = new JLabel(" Enter Marks: ");
		l4 = new JLabel("Java: ");
		l5 = new JLabel("E-Commerce: ");
		l6 = new JLabel("SPM: ");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(15);
		t5 = new JTextField(15);
		b1 = new JButton("Calculate");

		// adding actionlistener while clicking button
		b1.addActionListener(this);

		// adding components into a JFrame
		// for displaying inputtype components
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(t5);
		// for displaying results
		add(l7);
		add(l8);
		add(l9);
		add(l10);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(800, 800);
		setResizable(false); // JFrameko method ho yesle frame lai ghatauna badauna dideina cursorle
	}

	public void actionPerformed(ActionEvent e) // yo method chai button thiche pachi matrei call huncha
	{
		// reference variable for displaying calculated data
		l7 = new JLabel("Name:");
		l8 = new JLabel();
		l9 = new JLabel("Total Marks: ");
		l10 = new JLabel();
		l8.setText(t1.getText());
		float java = Float.parseFloat(t3.getText());
		float ecommerce = Float.parseFloat(t4.getText());
		float spm = Float.parseFloat(t5.getText());
		float t_marks = java + ecommerce + spm;
		l10.setText("= " + t_marks); // = bhanne string sanga t_marks lai tessari rakhda tyo wholelai string mancha
										// javale
	}

	public static void main(String[] args) {
		new GradeCalculator();
	}
}