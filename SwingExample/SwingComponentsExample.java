import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingComponentsExample extends JFrame implements ActionListener
{
	private JLabel l1;
	private JRadioButton r1,r2;// yaha radiobutton declare gariyo
	private ButtonGroup group; // ra yaha radiobuttonlai group gariyo yo garnei parcha
	private JCheckBox c1,c2,c3;
	private JPasswordField p1;
	private JComboBox cb1;
	
	public SwingComponentsExample()
	{
		//reference variable haru banako
		l1 = new JLabel("Gender");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		group = new ButtonGroup(); //buttongroupko pani reference variable banayeko ho
		c1 = new JCheckBox("Apple");
		c2 = new JCheckBox("Mango");
		c3 = new JCheckBox("Orange");
		p1 = new JPasswordField('*');
		String[] options = {"Nepal", "India", "China"}; //yaha 10,20,30 integer type halda pani as a string nei halnu parcha boru pachi integer ma convert garda huncha actionPerformed methodma
		cb1 = new JComboBox<String>(options);
		
		//Frame ma add garya ho
		group.add(r1);group.add(r2); //yo buttongrouplai add garya
		add(c1);add(c2);add(c3);
		add(l1);add(r1);add(r2); //yo add haru JFrameko method ho
		add(p1);
		add(cb1);
		
		//set garya size,visible,layout haru
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Yo chai frame close garna ko lagi ho awtma windowslistener bata garincha
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		//second option for setLayout
		//setLayout(null);
		//ani mathi reference variable banauda 
		//l1.setBounds(100,100,200,200); yasai gari radiobutton haru sab garda huncha customized tarikale
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public static void main(String[] args)
	{
		new SwingComponentsExample();
	}
}