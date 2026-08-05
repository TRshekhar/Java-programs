import java.awt.*;
import java.awt.event.*;
public class AWTExample extends Frame implements ActionListener
{
AWTExample()
{
Label l = new Label("Employee id:"); // creating a Label
Button b = new Button("Submit"); // creating a Button
TextField t = new TextField(); // creating a TextField
l.setBounds(20, 80, 80, 30);
t.setBounds(100, 80, 80, 30);
b.setBounds(100, 120, 80, 30);
add(b); // adding components into frame
add(l);
add(t);
setSize(400,300); // frame size 300 width and 300 height
setTitle("Employee info"); // setting the title of frame
setLayout(null); // no layout
setVisible(true); // setting visibility of frame
}
public static void main(String args[])
{
AWTExample awt_obj = new AWTExample();
}
}