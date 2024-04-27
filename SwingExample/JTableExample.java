import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class JTableExample extends JFrame
{
	JTable jt;
	JScrollPane jsp; 
	public JTableExample()
	{
		String Data[][]={{"101","Amit","90000"},{"102","Bikash","50000"},{"103","Karan","40000"}}; //multidimensional array
		String Column[] = {"ID", "Name", "Salary"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt = new JTable(Data,Column); //agadiko data pichhadiko tableko column name
		
		jsp = new JScrollPane(jt); //jtlai scrollpane ma add gariyo aba scrollpane lai chai frame ma add garne
		jsp.setBounds(10,10,300,50);
		add(jsp); //scrollpane lai chai framema add garya
		
		setLayout(null);  //second option setLayout(new FlowLayout()); tara yesma tablele purai frame occupy garcha
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new JTableExample();
	}
}