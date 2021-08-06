package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ques  extends JFrame implements  ActionListener{
    
    JButton next,submit,LifeLine;
    public static int count=0;
    public static int timer= 15;
    public static int ans_given=0;// checkbox
    public  static int score=0;
    JLabel qno, question;
    ButtonGroup option;
    JRadioButton opt1,opt2,opt3,opt4;
    
    String q[][]=new String[10][5];
    String pa[][]= new String[10][1];
    String crrans[][]= new String[10][2];
    
    String username;
    Ques(String username)
    {
        this.username= username;
        setBounds(50,50,1450,700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Quiz/icons/quiz1.png"));
        JLabel l1= new JLabel(i1);
        l1.setBounds(0,0,1400,300);
        add(l1);
        
       qno= new JLabel("");
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setBounds(100, 350, 50, 30);
        add(qno);
        
         question= new JLabel("");
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        question.setBounds(150, 350, 900, 30);
        add(question);
        
        q[0][0]="Which is used to find and fix bugs in thw java Program.?";//0
q[0][1]="JVM";
q[0][2]="JDB";
q[0][3]="JDK";
q[0][4]="JRE";

q[1][0]="What is the return type of the hashcode() method in the object class?";//1
q[1][1]="int";
q[1][2]="object";
q[1][3]="long";
q[1][4]="void";

q[2][0]="Which package contains the Random class.?";//2
q[2][1]="java.util package";
q[2][2]="java.lang package";
q[2][3]="java. awt package";
q[2][4]="java.io package";


q[3][0]="An interface with no fields or methods is known as.?";//3
q[3][1]="Runnable Interface";
q[3][2]="Abstract Interface";
q[3][3]="Marker Interface";
q[3][4]="CharSequence Interface";

q[4][0]=" In which memory a string is stored, when we create a string using new operator?";//4
q[4][1]="Stack";
q[4][2]="String Memory";
q[4][3]="Random Storage Space";
q[4][4]="Heap Memory";

q[5][0]="Which of the following is a marker interface.?";//5
q[5][1]="Runable interface";
q[5][2]="Remote interface";
q[5][3]="Readable interface";
q[5][4]="Result interface";

q[6][0]="Which keyboard is used for accessing the features of a package.?";//6
q[6][1]="import";
q[6][2]="package";
q[6][3]="extends";
q[6][4]="export";

q[7][0]="In java , JAR stands for?";//7
q[7][1]="Java Archive Runner";
q[7][2]="Java Archive";
q[7][3]="Java Application Resource";
q[7][4]="Java  Applicatoion Runner";



q[8][0]="Which  of the following is a multable class in java.?";//8
q[8][1]="java.lang.StringBuilder";
q[8][2]="java.lang.short";
q[8][3]="java.lang.Byte";
q[8][4]="java.lang.String";


q[9][0]="Which  of the foolowing option leads to the portability and security of java.?";//9
q[9][1]="Bytecode executed by JVM";
q[9][2]="The applet makes the java code secure and portable";
q[9][3]="Use of exception handling";
q[9][4]="Dynamic binding between objects.";



      crrans[0][1]="JOB";
      crrans[1][1]="int";
      crrans[2][1]="java.util package";
      crrans[3][1]="Marker Interface";
      crrans[4][1]="Heap Memory";
      crrans[5][1]="Remote interface";
      crrans[6][1]="import";
      crrans[7][1]="Java Archive";
      crrans[8][1]="java.lang.StringBuilder";
      crrans[9][1]="Bytecode executed by JVM";

        
        
       opt1= new JRadioButton(" ");
        opt1.setBounds(170,450,700,30);
         opt1.setFont(new Font("Dialog",Font.PLAIN,20));
         opt1.setBackground(Color.WHITE);
        add(opt1);
        
       opt2= new JRadioButton(" ");
        opt2.setBounds(170,500,700,30);
         opt2.setFont(new Font("Dialog",Font.PLAIN,20));
         opt2.setBackground(Color.WHITE);
        add(opt2);
        
     opt3= new JRadioButton(" ");
        opt3.setBounds(170,550,700,30);
         opt3.setFont(new Font("Dialog",Font.PLAIN,20));
         opt3.setBackground(Color.WHITE);
        add(opt3);
        
 opt4= new JRadioButton(" ");
        opt4.setBounds(170,600,700,30);
         opt4.setFont(new Font("Dialog",Font.PLAIN,20));
         opt4.setBackground(Color.WHITE);
        add(opt4);
        
     option =new ButtonGroup();
        option.add(opt1);
          option.add(opt2);
            option.add(opt3);
              option.add(opt4);
              
              next= new JButton("Next");
              next.setFont(new Font("Tahoma", Font.PLAIN,22));
              next.setBackground(Color.BLUE);
              next.setForeground(Color.WHITE);
              next.addActionListener(this);
              next.setBounds(1100,450, 200, 40);
              add(next);
              
              LifeLine= new JButton("50-50 Lifeline");
             LifeLine.setFont(new Font("Tahoma", Font.PLAIN,22));
              LifeLine.setBackground(Color.BLUE);
              LifeLine.setForeground(Color.WHITE);
             LifeLine.setBounds(1100,520, 200, 40);
             LifeLine.addActionListener(this);
              add(LifeLine);
              
            submit= new JButton("Submitt");
            submit.setFont(new Font("Tahoma", Font.PLAIN,22));
            submit.setEnabled(false);
             submit.setBackground(Color.BLUE);
             submit.setForeground(Color.WHITE);
             submit.addActionListener(this);
             submit.setBounds(1100,590, 200, 40);
              add(submit);
              
              
              start(0);
    }

    private Ques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==next)
        {
            repaint(); // internally call paint function
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1; // given the answer by person
            if(option.getSelection()== null)
            {
                pa[count][0]="";
            }
            else {
                
               pa[count][0]=option.getSelection().getActionCommand();
            }
            if(count==8)
               {
                   next.setEnabled(false);
                   submit.setEnabled(true);
               }
            
           count++;
           start(count);
        }    
            else if(ae.getSource()== submit){
        ans_given=1;
                if(option.getSelection()== null)
            {
                pa[count][0]="";
            }
            else {
                
               pa[count][0]=option.getSelection().getActionCommand();
            } 
               
               for(int i =0; i<pa.length;i++)
               {
                   if(pa[i][0].equals(crrans[i][1]))
                           {
                               score+=10;
                           }else{
                       score+=0;
                   }
               }
               this.setVisible(false);
               new Score(username, score).setVisible(true);
                
            }else if(ae.getSource()== LifeLine)
            {
                if(count==2|| count ==4 || count ==6 || count ==8  || count ==9)
                    opt2.setEnabled(false);
                            opt3.setEnabled(false);
            }else{
               opt1.setEnabled(false);
               opt4.setEnabled(false);
            }
        LifeLine.setEnabled(false);
    }

        
    
    public void paint(Graphics g) // paint is taking sa object in graphic class as a argument
    {
        super.paint(g);
       String  time ="Time left -" + timer + " seconds";
       g.setColor(Color.RED);
       g.setFont(new Font("Tahoma",Font.BOLD,20));
       g.drawString(time, 1100, 400);
       
        if(timer>0)
        {
            g.drawString(time, 1100,400);// ist argument take a width and second argument take a position
        }else
        {
            g.drawString(" Times Up", 1100,400);
        }
       
       timer--;
       
       try
       {
           Thread.sleep(1000);
           
           repaint();
       }catch(Exception e){
       e.printStackTrace();
       }
           if(ans_given==1)
       {
           ans_given=0;
           timer =15;
       }
           else if(timer<0){ // time out and person not clicked next btn
               timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
               if(count==8)
               {
                   next.setEnabled(false);
                   submit.setEnabled(true);
               }
               if(count==9)
               {
                   if(option.getSelection()== null)
            {
                pa[count][0]="";
            }
            else {
                
               pa[count][0]=option.getSelection().getActionCommand();
            } 
               
               for(int i =0; i<pa.length;i++)
               {
                   if(pa[i][0].equals(crrans[i][1]))
                           {
                               score+=10;
                           }else{
                       score+=0;
                   }
               }
               this.setVisible(false);
                new Score(username,score).setVisible(true);
           }else{
                           if(option.getSelection()== null)
            {
                pa[count][0]="";
            }
            else {
                
               pa[count][0]=option.getSelection().getActionCommand();
            } 
                           count++;
                           start(count);
               }
    }
    }
    
    public void start(int count)
            
    {
        qno.setText("" + (count+1)  + ".");
        question.setText(q[count][0]);
        
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
           opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
           opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
           opt4.setActionCommand(q[count][4]);
        option.clearSelection();
        
        
    }
    
    public static void main(String [] args)
    {
        new Ques().setVisible(true);
    }
}
