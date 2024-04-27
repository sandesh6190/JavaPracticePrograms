//yesma chai problem aairako cha
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingExample extends JFrame implements ActionListener, MouseListener //yaha multiple extends garna mildeina tara Listener haru chai multiple implements garna milcha
{
	
	private JTextField t1;
	private JFrame b;
	private JFrame b1;
	private JFrame f;
	
	private JPasswordField p1; //for password
	public SwingExample()
	{
		//constructorma initialize garne sabbei
		f = new JFrame ("String Frame");
		t1 = new JTextField(15);
		b = new JButton("Click");
		b1 = new JButton("Click");
		p1.new JPasswordField(20);
		p1.setEchoChar('$'); //password ma use huncha
		
		
		//f.add(t1)..haru chai lekhnu paryo jun pure awtma lekhindeina(extends frame) nagareko karanle tara (extends frame) lekhda chai f. lekhnu parena
		add(t1);
		add(b);
		add(b1);
		add(p1);
		b.addActionListener(this);
		b1.addActionListener(this);		//yo register garya ani matrei tala actionPerformed bhanne method call huncha
		t1.addMouseListener(this); //yo register garya ani matrei tala MouseListener ko method haru call huncha
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //yo EXIT_ON_CLOSE chai awt ma chaina swingma matrei cha hai
		setSize(400,400);
		setLayout(new FlowLayout());
		
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		// yo chai multiple button huda if laune ani . getSource method use garne
		if(ae.getSource() == b)
		{
			t1.setText("Hello World");
		}
		
		else
		{
			t1.setText("Hello BCA VII");
		}
			
	}
	
	public void mouseReleased(MouseEvent e)
	{
		
	}
	
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		t1.setBackground(COLOR.WHITE);
	}
	public void mouseEntered(MouseEvent e)
	{
		t1.setBackground(COLOR.RED);
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public static void main (String[] args)
	{
		SwingExample obj = new SwingExample();
	}
}