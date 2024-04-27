//inbuild DialogBoxes

import javax.swing.*;
public class DialogBoxesExample extends JFrame //JFrame chai setDefaultCloseOperation(EXIT_ON_CLOSE) KO lagi ho
{
	public DialogBoxesExample()
	{
	//YINIHARU CHAI INBUILD FUNCTION HARU HO
	
	//Show Messsage Dialog Box
	JOptionPane.showMessageDialog(this,"Example of showDialog","title",JOptionPane.ERROR_MESSAGE); //yo chai show garne dialog box ho
	//setDefaultCloseOperation(JOptionPane.DISPOSE_ON_CLOSE); yo chai execute bhako chaina aile
	
	//Input Dialog Box
	String name = JOptionPane.showInputDialog(this,"Enter your Name","Input Box");
	JOptionPane.showMessageDialog(this,name,"title",JOptionPane.INFORMATION_MESSAGE); //yaha chai Ok and cancel aafui aucha
	//second optionho JOptionPane.showMessageDialog(this,name,"title",JOptionPane.INFORMATION_MESSAGE); //yaha chai ok and cancel aaufeina, plain aucha
	
	//Confirmation Diaglod Box
	int choice = JOptionPane.showConfirmDialog(this,"Sure you want to exit","title",JOptionPane.YES_NO_CANCEL_OPTION); //YES_NO_OPTION matrei halda ni huncha
	if(choice == JOptionPane.YES_OPTION)
	{
		JOptionPane.showMessageDialog(this,"You pressed yes"+JOptionPane.YES_OPTION,"title",JOptionPane.INFORMATION_MESSAGE);
	}
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new DialogBoxesExample();
	}
}	