package quizeapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton back , rules;
    JTextField tfname;
    Login(){

        setSize(800,400);
        setLocation(400,200);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(200,100,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(120,125,300,27);
        tfname.setFont(new Font("Times new rohan",Font.BOLD,19));
        add(tfname);

        back = new JButton("Back");
        back.setBounds(120,175,120,25);

        back.addActionListener(this);
        add(back);

        rules = new JButton("Submit");
        rules.setBounds(250,175,120,25);
        rules.addActionListener(this);
        add(rules);
    }
    public static void main(String[] args){
        Login l = new Login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            setVisible(false);
            String name = tfname.getText();
            new Rules(name);
        }else if(e.getSource()== back){
            setVisible(false);
        }else{

        }
    }
}
