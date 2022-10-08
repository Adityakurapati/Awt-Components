import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaDemo2 extends JFrame implements ActionListener
{
    CardLayout cd;
    Container c;
    JButton prev,next;
    TextAreaDemo2()
    {
        cd  = new CardLayout();
        BorderLayout b = new BorderLayout();
        setLayout(b);
        c  = getContentPane();
        // setLayout(new FlowLayout(FlowLayout.LEFT));
        TextArea tt = new TextArea();
        Panel p = new Panel();
        JLabel jb1 = new JLabel("Jack ");
        // JButton jb1 = new JButton("Jack ");
        JButton jb2 = new JButton("Queen ");
        JButton jb3 = new JButton("Killer ");
        prev = new JButton("Previous ");
        next = new JButton("Next ");
        c.add(jb1);c.add(jb2);c.add(jb3);
        // p.add(jb1);p.add(jb2);p.add(jb3);
       // add(p,BorderLayout.CENTER);
        p.setBackground(Color.magenta);
        // add(jb1,BorderLayout.CENTER);
        // add(jb2,BorderLayout.CENTER);
        // add(jb3,BorderLayout.CENTER);
        add(prev,BorderLayout.WEST);
        add(next,BorderLayout.EAST);
        
        p.setLayout(cd);
        // jb1.setLayout(cd);
        // jb2.setLayout(cd);
        // jb3.setLayout(cd);
        prev.addActionListener(this);
        next.addActionListener(this);  
    }
    public void actionPerformed(ActionEvent ae)
    {
        // cd.next(c);
        if(ae.getSource()==prev)
        {
            cd.previous(c);
        }
        else if(ae.getSource()==next)
        {
            cd.next(c);
        }
    }
    public static void main(String a[])
    {
        TextAreaDemo2 t2 = new TextAreaDemo2();
        t2.setVisible(true);
        t2.setSize(300,300);
        t2.setTitle("Text Area");

    }
}