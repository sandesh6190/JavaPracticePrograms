import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //event handleko lagi matrei ho awt chaiyeko
class DialogBoxExample implements ActionListener
{
	private JDialog d;
	private JButton b;
	private JTextField t1;
	private JFrame f;
	
	public DialogBoxExample()
	{
		//reference variable haru banako
		 f = new JFrame("Dialog Box"); //yaha sabbei kura garda f. chahincha kina bhane JFrame lai extends nagarera object banako ho
		 t1 = new JTextField(15);
		 b = new JButton("Click");
		 
		 
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Yo chai frame close garna ko lagi ho awtma windowslistener bata garincha
		 
		 //Frame ma add garya ho
		 f.add(t1);f.add(b);
		 
		 //set garya size,visible,layout haru
		 b.addActionListener(this);
		 f.setSize(400,400);
		 f.setVisible(true);
		 f.setLayout(new FlowLayout());
		 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		d = new JDialog(f,"Message",true); //parent,Caption,
		JLabel l1 = new JLabel();
		l1.setText(t1.getText());
		d.add(l1);
		
		d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		d.setSize(300,200);
		d.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		DialogBoxExample obj= new DialogBoxExample();
	}
}