import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingExample extends JFrame implements ActionListener //yaha multiple extends garna mildeina tara Listener haru chai multiple implements garna milcha
{
	
	private JTextField t1;
	private JFrame b;
	private JFrame f;
	
	public SwingExample()
	{
		//constructorma initialize garne sabbei
		f = new JFrame ("String Frame");
		t1 = new JTextField(15);
		b = new JButton("Click");
		
		//f.add(t1)..haru chai lekhnu paryo jun pure awtma lekhindeina(extends frame) nagareko karanle tara (extends frame) lekhda chai f. lekhnu parena
		f.add(t1);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //yo EXIT_ON_CLOSE chai awt ma chaina swingma matrei cha hai
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		t1.setText("Hello World");
		//if(ae.getSource() == b)
	}

	public static void main (String[] args)
	{
		SwingExample obj = new SwingExample();
	}
}