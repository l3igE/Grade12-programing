/**
 * Created by 1LESLIEERI on 05/05/2017.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


    public class swing_example extends JFrame
    {
        public JTextField jfNum1, jfNum2, jfAnswer;
        public JButton jbCalc, jbExit;
        public JCheckBox jcboxadd, jcboxsub, jcboxmul, jcboxdiv;

        public static void main (String[] args)
        {
            new swing_example ();
        }




        public swing_example ()
        {
            JFrame frame = new JFrame ("Simple Calculator");
            frame.setLocation (100, 125);
            frame.setSize (230, 250);
            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            frame.setVisible (true);

            //JPanel panel1 = new JPanel();
            //panel1.setLocation(10,5);
            //panel1.setSize(180,420);
            //panel1.setToolTipText("The Calculator");
            //panel1.setLayout(new GridBagLayout());

            JLabel jlFirstNum = new JLabel ("First Number:");
            JLabel jlSecondNum = new JLabel ("Second Number:");
            JLabel jlOperator = new JLabel ("Operator:");

            jcboxadd = new JCheckBox ("Add");
            jcboxsub = new JCheckBox ("Subtract");
            jcboxmul = new JCheckBox ("Multiply");
            jcboxdiv = new JCheckBox ("Divide");

            jfNum1 = new JTextField (10);
            jfNum2 = new JTextField (10);
            jfAnswer = new JTextField (15);
            jfAnswer.setEditable (false);

            jbCalc = new JButton ("Calculate");
            jbExit = new JButton ("Exit");
            ClickListener cl = new ClickListener();
            jbCalc.addActionListener(cl);
            jbExit.addActionListener(cl);

            Box box1 = Box.createVerticalBox ();
            Box box2 = Box.createVerticalBox ();
            Box box3 = Box.createVerticalBox ();
            Box box4 = Box.createHorizontalBox ();

            box1.add (jlFirstNum);
            box1.add (jfNum1);

            box2.add (jlOperator);
            box2.add (jcboxadd);
            box2.add (jcboxsub);
            box2.add (jcboxmul);
            box2.add (jcboxdiv);

            box3.add (jlSecondNum);
            box3.add (jfNum2);
            box3.add (jfAnswer);

            box4.add (jbCalc);
            box4.add (Box.createHorizontalStrut (20));
            box4.add (jbExit);


        /*
        panel1.add(jlFirstNum);
        panel1.add(jtNum1);
        panel1.add(jlOperator);
        panel1.add(jcboxadd);
        panel1.add(jcboxsub);
        panel1.add(jcboxmul);
        panel1.add(jcboxdiv);
        panel1.add(jlSecondNum);
        panel1.add(jtNum2);
        panel1.add(jbCalc);
        panel1.add(jbExit);
        */

            //panel2.setLocation(26,5);
            //panel2.setSize(200,300);
            //panel2.setToolTipText("Average Calculator");

            frame.setContentPane (box1);
            frame.getContentPane ().add (box2);
            frame.getContentPane ().add (box3);
            frame.getContentPane ().add (box4);
            frame.setVisible (true);

        } // FrameCalculator method


        private class ClickListener implements ActionListener
        {
            public void actionPerformed (ActionEvent e)
            {
                if (e.getSource () == jbCalc)
                {
                    double dnum1 = 0, dnum2 = 0;
                    String snum1 = "", snum2 = "";
                    snum1 = jfNum1.getText ();
                    dnum1 = Double.parseDouble (snum1);

                    snum2 = jfNum2.getText ();
                    dnum2 = Double.parseDouble (snum2);

                    jfAnswer.setText (" ");
                    if (jcboxadd.isSelected ())
                        jfAnswer.setText (" " + dnum1 + " + " + dnum2 + " = " + (dnum1 + dnum2));
                    if (jcboxsub.isSelected ())
                        jfAnswer.setText (" " + dnum1 + " - " + dnum2 + " = " + (dnum1 - dnum2));
                    if (jcboxmul.isSelected ())
                        jfAnswer.setText (" " + dnum1 + " * " + dnum2 + " = " + (dnum1 * dnum2));
                    if (jcboxdiv.isSelected ())
                        jfAnswer.setText (" " + dnum1 + " / " + dnum2 + " = " + (dnum1 / dnum2));

                }
                if (e.getSource () == jbExit)
                {
                    System.exit(0);
                }
            }

        }
    } // FrameCalculator class


