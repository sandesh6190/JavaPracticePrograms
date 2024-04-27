import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*; //second option import java.awt.FlowLayout

public class JTreeExample extends JFrame
{
	//declaration
	DefaultMutableTreeNode style;
	DefaultMutableTreeNode font;
	DefaultMutableTreeNode color;
	DefaultMutableTreeNode small;
	DefaultMutableTreeNode medium;
	DefaultMutableTreeNode large;
	DefaultMutableTreeNode red;
	DefaultMutableTreeNode green;
	DefaultMutableTreeNode blue;
	public JTreeExample()
	{
		//creating reference variable
		style = new DefaultMutableTreeNode("style");
		font = new DefaultMutableTreeNode("font");
		color = new DefaultMutableTreeNode("color");
		small = new DefaultMutableTreeNode("style");
		medium = new DefaultMutableTreeNode("medium");
		large = new DefaultMutableTreeNode("large");
		red = new DefaultMutableTreeNode("red");
		green = new DefaultMutableTreeNode("green");
		blue = new DefaultMutableTreeNode("blue");
		
		//adding node on a rootnode as per required on questions
		style.add(font);style.add(color);
		
		font.add(small);font.add(medium);font.add(large);
		
		color.add(red);color.add(green);color.add(blue);
		
		JTree jt = new JTree(style); //root nodelai matrei pass garne
		add(jt); //jtlai framema add garya JFrame extends gareko le f.lekhnu parena
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); //yo chai awt ko class ho
		setVisible(true);
		setSize(400,400);
		
	}
	
	public static void main(String[] args)
	{
		new JTreeExample();
	}
}

