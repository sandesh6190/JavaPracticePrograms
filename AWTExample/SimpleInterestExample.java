//12 Marks
import java.awt.*;
import java.awt.event.*;
class SimpleInterestExample extends Frame implements ActionListener
{
	private TextField t1,t2,t3;
	private Label l1,l2,l3,l4;
	private Button b;
	
	//Constructor
	public SimpleInterestExample()
	{
		t1 = new TextField(15);
		t2 = new TextField(15);
		t3 = new TextField(15);
		
		l1=new Label("Principle");
		l2=new Label("Time");
		l3=new Label("Rate");
		l4=new Label("Result will be stored here");
		b=new Button("Calculate");
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(b);
		
		//yo AddActionListener() call hunesath talako ActionPerformed method call bhayera execute garcha
		b.addActionListener(this); 
		// yo chai caption ho
		setTitle("SI Calculator");  
		setVisible(true);
		setSize(700,700);
		
		setLayout(new FlowLayout());
		
		//yo chai WindowAdapter use garera euta matrei eventlai override garya ho, yadi implements garya bhaye sabbei event override garnu parthyo
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		float p,t,r,si;
		//data stringma aaucha teslai float athawa double ma convert garya ho
		p=Float.parseFloat(t1.getText());
		t=Float.parseFloat(t2.getText());
		r=Float.parseFloat(t3.getText());
		
		si=(p*t*r)/100;
		l4.setText("Simple Interest: "+si);
	}
	
	public static void main(String[] args)
	{
		SimpleInterestExample obj = new SimpleInterestExample();
	}
}


