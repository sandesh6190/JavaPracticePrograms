import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class JPanelExample extends JFrame
{
	JPanel p1,p2;
	Border b;
	JTextArea jt;
	JScrollPane scroll; //scrollbar banauna lai 
	
	public JPanelExample()
	{
		setLayout(null); //yo chai firstmai gardeko ramro yo program ma
	
		//reference varaible
		p1 = new JPanel();
		p2 = new JPanel();
		jt = new JTextArea(5,6);
		scroll = new JScrollPane(jt); //scroll bhitra jt halna gareko
		
		//TextField baddeina input lamo huda
		jt.setLineWrap(true); //text matrei wrap huncha eatile bhannale string bichma kattiyera tala jharcha
		jt.setWrapStyleWord(true); //word nei wrap huncha eatile bhannale string bichma kattideina sidhei word nei tala jharcha
		
		
		//position and size of panel
		p1.setBounds(50,50,200,300);
		p2.setBounds(300,50,200,300);
		jt.setBounds(0,0,100,100);
		
		//adding panels on frame
		add(p1);add(p2);p1.add(jt);add(scroll);
		
		b = BorderFactory.createLineBorder(Color.RED,2); 
		//second option Border b = BorderFactory.createLineBorder(Color.RED,2); 
		
		p1.setBorder(b);
		p2.setBorder(b);
		setSize(800,800); //frameko size
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new JPanelExample();
	}
}