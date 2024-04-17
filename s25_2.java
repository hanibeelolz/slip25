import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class slip25 extends JFrame
{
JTextField ddl;
JButton create,alter,drop;
JLabel l1;
slip25()
{
    setSize(800,800);
    setTitle("DDL Query");
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    l1=new JLabel("Type Your DDL Query Here:-");
    add(l1);
    ddl=new JTextField(20);
    add(ddl);

    create=new JButton("Create Table");
    add(create);

    alter=new JButton("Alter Table");
    add(alter);

    drop=new JButton("Drop Table");
    add(drop);
ButtonHandler bh = new ButtonHandler();
create.addActionListener(bh);
alter.addActionListener(bh);
 drop.addActionListener(bh);
}
class ButtonHandler implements ActionListener
{
 public void actionPerformed(ActionEvent ae)
{

try
{
Connection con=null;
Class.forName("org.postgresql.Driver");
con =DriverManager.getConnection("jdbc:postgresql://localhost/stud","postgres","");
String sql=ddl.getText();
Statement s= con.createStatement();

s.execute(sql);

ddl.setText("");

}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e);
}
}
}
public static void main(String a[])
{
    new slip25();
}
}
