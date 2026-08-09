import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class userInterface extends ActionEvent implements ActionListener{
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
        // Create a label
        JTextField label = new JTextField();
        label.setText("I am Label");
        // label.setBounds(50, 50, 100, 30);
        // label.setBorder(TitledBorder);

        // Create a Textfield
        JTextField t1 = new JTextField();
        t1.setText("Amount here");
        // t1.setBounds(100, 150, 100, 50);

        // Create a button
        JButton withdowButton = new JButton("Withdrow");
        // withdowButton.setBounds(50, 700, 100, 300);
        JButton deposiButton = new JButton("Deposit");
        // deposiButton.setBounds(200, 700, 100, 300);
        JButton checkBalanceButton = new JButton("CheckBalance");
        // checkBalanceButton.setBounds(350, 700, 100, 30);
        
        // Add action listener to the button
        withdowButton.addActionListener(this);
        // withdowButton.addActionListener(e -> label.setText("Withdowl Clicked!"));
        deposiButton.addActionListener(e -> label.setText("Deposit Clicked!"));
        checkBalanceButton.addActionListener(e -> label.setText("checkBalance Clicked!"));
        
        // Add components to the panel
        panel.add(label, gbc);
        gbc.gridx = 2;
        // gbc.gridy = 1;
        panel.add(t1,gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(withdowButton, gbc);
        gbc.gridy = 2;
        panel.add(deposiButton, gbc);
        gbc.gridy = 3;
        panel.add(checkBalanceButton, gbc);
        gbc.gridy = 4;

        //Logic 
        public void actioPerformed(ActionEvent e){
            ATM atm1 = new ATM();
            String amo = t1.getText();
            int amount =  Integer.parseInt(amo);
            

            if(e.getSource()==withdowButton){
                atm1.withDrow(amount);
                label.setText("Money has been sucessfuly withdrowl!\n"+"Avbilable Balance : "+atm1.checkBalance()+"\nWithdrawn Amount : "+amount);
            }else if(e.getSource()==deposiButton){

            }
        }
        
        // Add panel to the frame
        frame.add(panel);
        
        // Set the frame visibility
        frame.setVisible(true);
    }
}
