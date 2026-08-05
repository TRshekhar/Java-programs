import java.awt.*;
import java.awt.event.*;
public class addawt extends Frame implements ActionListener
{
TextField tf1,tf2,tf3;
Button b,b1;
Label l1,l2,l3;
addawt()
{
l1=new Label("first number");
l1.setBounds(30,50,80,30);
add(l1);
tf1=new TextField();
tf1.setBounds(150,50,80,30);
add(tf1);
l2=new Label("second number");
l2.setBounds(30,90,100,30);
add(l2);
tf2=new TextField();
tf2.setBounds(150,90,80,30);
add(tf2);
l3=new Label("The Result is ");
l3.setBounds(30,130,80,30);
add(l3);
tf3=new TextField();
tf3.setBounds(150,130,80,30);
add(tf3);
b = new Button("ADD");
b.setBounds(30,170,80,30);
add(b);
b1 = new Button("Reset");

b1.setBounds(150,170,80,30);
add(b1); // adding button into frame
b.addActionListener(this);
b1.addActionListener(this);
setSize(300,300); // frame size 300 width and 300 height
setTitle("This is our basic AWT example"); // setting the title of Frame
setLayout(null); // no layout manager
setVisible(true); // now frame will be visible, by default it is not visible
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=a+b;
tf3.setText(String.valueOf(c));
}
else if(e.getSource()==b1)
{
tf1.setText(" ");
tf2.setText(" ");
tf3.setText(" ");

}
}
public static void main(String args[])
{
addawt f = new addawt();
}
}