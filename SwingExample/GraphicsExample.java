//yo pani purano question bata
import javax.swing.*;
import java.awt.*;
public class GraphicsExample extends JFrame
{
	public GraphicsExample()
	{
		setTitle("Graphics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g)
	{
		g.setColor(Color.RED); 
		g.fillOval(50,50,100,80); //oval lai fill garcha ,  Circleko lagi g.fillOval(50,50,100,100); (x,y,width,height);
		
		g.setColor(Color.BLUE);
		g.fillRect(200,50,100,100); //rectanglelai fill garcha, square ko lagi g.fillRect(200,50,100,50);
		
		g.drawLine(0,0,400,400); //lineko (x1,y1,x2,y2);
	}
	
	public static void main(String[] args)
	{
		new GraphicsExample();
	}
}