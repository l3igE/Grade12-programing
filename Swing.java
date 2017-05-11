/**
 * Created by 1LESLIEERI on 01/05/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing {
   public JLabel jlHeading1,jlHeading2,jlHeading3, jlHeading4;
   public JTextField jtfTextField1,jtfTextField2,jtfTextField3,jtfTextField4,jtfTextField5;
    public JTextField jtfAnswer;
    public JButton jbCalc;
    public static void main (String[] args) {new Swing();}

public Swing(){
        String sAnswer = "";
        JFrame frame = new JFrame (); // Declare the object
        JPanel contents = new JPanel ();
        jlHeading1 = new JLabel ("What is your First name?");
        jlHeading2 = new JLabel ("What is your Last name?");
        jlHeading3 = new JLabel ("What is your birth date (yyyy/mm/dd)");
        jlHeading4 = new JLabel ("Your Age is");
        jtfTextField1 = new JTextField (20);
        jtfTextField2 = new JTextField (20);
        jtfTextField3 = new JTextField (5);
        jtfTextField4 = new JTextField (5);
        jtfTextField5 = new JTextField (5);
        jtfAnswer = new JTextField(20);
        jtfAnswer.setEditable(false);
        jbCalc = new JButton ("Calculate");
        jtfAnswer.setText(sAnswer);

        contents.add (jlHeading1);
        contents.add (jtfTextField1);
        contents.add (jlHeading2);
        contents.add (jtfTextField2);
        contents.add (jlHeading3);
        contents.add (jtfTextField3);
        contents.add (jtfTextField4);
        contents.add (jtfTextField5);
        contents.add (jlHeading4);
        contents.add (jtfAnswer);
        contents.add(jbCalc);
        ClickListener cl = new ClickListener();
        jbCalc.addActionListener(cl);
        frame.setContentPane (contents);


        frame.setTitle ("What's your name?");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLocation (200, 100);
        frame.setSize (250, 350);
        frame.setVisible (true);



    }
    private class ClickListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource () == jbCalc)
            {
                double dYear = 0, dMonth = 0, dDay = 0;
                String snum1 = "", snum2 = "",snum3 ="";
                snum1 = jtfTextField3.getText ();
                dYear = Double.parseDouble (snum1);

                snum2 = jtfTextField4.getText ();
                dMonth = Double.parseDouble (snum2);

                snum3 = jtfTextField5.getText ();
                dDay = Double.parseDouble (snum3);


            }

        }

    }
    }
