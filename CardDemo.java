import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CardDemo extends JFrame implements ActionListener
{
    Container c;
    CardLayout cl;
    // JButton prev,next,first,last;
    CardDemo()
    {
        Panel p = new Panel();
        BorderLayout b = new BorderLayout();
        setBackground(Color.MAGENTA);
        cl = new CardLayout(30,30);
        setLayout(b);
        p.setLayout(cl);
        c = getContentPane();
        JButton b1 = new JButton("Python");
        JButton b2 = new JButton("Java");
        JButton b3 = new JButton("CSS");
        JButton b4 = new JButton("Html");
        JButton b5 = new JButton("Jscript");
        // JButton prev = new JButton("Previous");
        // JButton next = new JButton("Next");
        // JButton first = new JButton("first");
        // JButton last = new JButton("last");
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
        // add(prev,BorderLayout.WEST);
        // add(next,BorderLayout.EAST);
        // add(first,BorderLayout.NORTH);
        // add(last,BorderLayout.SOUTH);


       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        // prev.addActionListener(this);
        // next.addActionListener(this);
        // first.addActionListener(this);
        // last.addActionListener(this);

        add(p,BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent ae)
    {
        cl.next(c);
        // String str= ae.getActionCommand();
        // if(str.equals("prev"))
        // {
        //     cl.previous(c);
        // }
        // else if(str.equals("next"))
        // {
        //     cl.next(c);
        // }
        // else if(ae.getSource()==first)
        // {
        //     cl.first(c);
        // }
        // else if(ae.getSource()==last){
        //     cl.last(c);
        // }

    }
    public static void main(String args[])
    {
        CardDemo cd = new CardDemo();
        cd.setTitle("My Frame");
        cd.setVisible(true);
        cd.setSize(500,500);
    }
}