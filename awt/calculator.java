import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener
{
    TextField tf1, tf2, tf3;
    Button Add, subtract, multiple, qutient, reset;
    calculator()
    {
        setSize(500,700);
        setTitle("Calculator");

        Label number1 = new Label("First Number: ");
        number1.setBounds(20,80,120,40);
        add(number1);

        tf1 = new TextField();
        tf1.setBounds(140,80,150,40);
        add(tf1);

        Label number2 = new Label("Second Number: ");
        number2.setBounds(20,120,120,40);
        add(number2);

        tf2 = new TextField();
        tf2.setBounds(140,120,150,40);
        add(tf2);

        Label result = new Label("Result:");
        result.setBounds(20,160,120,40);
        add(result);

        tf3 = new TextField();
        tf3.setBounds(140,160,150,40);
        add(tf3);

        Add = new Button("+");
        Add.setBounds(20,200,25,50);
        add(Add);

        subtract = new Button("-");
        subtract.setBounds(50,200,25,50);
        add(subtract);

        multiple = new Button("x");
        multiple.setBounds(80,200,25,50);
        add(multiple);

        qutient = new Button("/");
        qutient.setBounds(110,200,25,50);
        add(qutient);

        reset = new Button("A/C");
        reset.setBounds(140,200,50,50);
        add(reset);

        Add.addActionListener(this);
        subtract.addActionListener(this);
        multiple.addActionListener(this);
        qutient.addActionListener(this);
        reset.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        if(e.getSource()==Add){
            int c = a+b;
            tf3.setText(String.valueOf(c));
        } else if(e.getSource()==subtract){
            int c = a-b;
            tf3.setText(String.valueOf(c));
        } else if(e.getSource()==multiple){
            int c = a*b;
            tf3.setText(String.valueOf(c));
        } else if(e.getSource()==qutient){
            if(b!=0){
                int c = a/b;
                tf3.setText(String.valueOf(c));
            }else{
                tf3.setText(String.valueOf(a+" cannot divide by 0"));
            }
        } else if(e.getSource()==reset){
            tf1.setText(String.valueOf(""));
            tf2.setText(String.valueOf(""));
            tf3.setText(String.valueOf(""));
        }
    }
    public static void main(String[] args)
    {
        new calculator();
    }
}