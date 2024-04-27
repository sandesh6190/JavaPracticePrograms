import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTableExampleDynamic extends JFrame implements ActionListener {
    JTable jt;
    JScrollPane jsp;

    JLabel l1;
    JLabel l2;
    JTextField t1;
    JTextField t2;
    JButton b;

    public JTableExampleDynamic() {
        l1 = new JLabel("Name: ");
        l2 = new JLabel("Age: ");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b = new JButton("Add");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        b.addActionListener(this);

        setLayout(new FlowLayout()); // second option setLayout(new FlowLayout()); tara yesma tablele purai frame
        // occupy garcha
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String strName = t1.getText();
        String strAge = t2.getText();
        String Data[][] = { new String[] { strName, strAge } }; // multidimensional array
        String Column[] = { "Name", "Age" };

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt = new JTable(Data, Column); // agadiko data pichhadiko tableko column name

        jsp = new JScrollPane(jt); // jtlai scrollpane ma add gariyo aba scrollpane lai chai frame ma add garne
        jsp.setBounds(10, 90, 300, 50);
        // add(jt);
        add(jsp); // scrollpane lai chai framema add garyab
    }

    public static void main(String[] args) {
        new JTableExampleDynamic();
    }
}