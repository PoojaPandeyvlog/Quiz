package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        public class Rules extends JFrame implements ActionListener{
            JButton b1,b2;
            String username;
            Rules( String username)
            {
                this.username=username;
                setBounds(400,100,700,600);
                getContentPane().setBackground(Color.WHITE);
                   setLayout(null);
                JLabel l1= new JLabel("Welcome "  + username + " to Quiz ");
                l1.setForeground(Color.BLUE);
                l1.setFont(new Font(" Times New Roman", Font.BOLD,30));
                 l1.setBounds(50,20,715,30);
                add(l1);
                
                JLabel l2=new JLabel("");
                l2.setFont(new Font("Times New Roman",Font.PLAIN,20));
                l2.setBounds(20,90,600,350);
                l2.setText(
                        "<html>"+
"1.Give only one answer." +  " <br><br>"  +
"2.All Questions are Compulsory." +  " <br><br>" +
"3.One Time give Only one answer." +  "<br><br> " +
"4.If you give two answer at a time then marks are not count." +  "<br><br>" +
"<html>"
                );
                add(l2);
                
                 b1= new JButton("Back");
                b1.setBounds(250, 500,100,30);
                b1.setBackground(Color.BLUE);
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                add(b1);
                
                b2= new JButton("Start");
                b2.setBounds(400, 500,100,30);
                b2.setBackground(Color.BLUE);
                b2.setForeground(Color.WHITE);
                b2.addActionListener(this);
                add(b2);
                setVisible(true);
            }
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource()==b1){
                    this.setVisible(false);
                    new Quiz().setVisible(true);
                }else if(ae.getSource()==b2)
                {
                    this.setVisible(false);
                    new Ques(username).setVisible(true);// Ques create a new class
                }
            }

            public static void main(String [] args)
            {
                new Rules(" ");
            }

}
