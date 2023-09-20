package quizeapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name ;
    JButton back , start;
    Rules(String name){
        this.name = name;
        setSize(800,400);
        setLocation(400,200);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel txt = new JLabel("No rules just fuck it up " + name +" Good night");
        txt.setBounds(200,100,300,20);
        txt.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        txt.setForeground(new Color(30,144,254));
        add(txt);

        back = new JButton("Back");
        back.setBounds(120,175,120,25);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(250,175,120,25);
        start.addActionListener(this);
        add(start);


    }
    public static void main(String[] args){
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== start){

        }else if(e.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
}
