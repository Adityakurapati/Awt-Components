import java.awt.*;
import java.awt.event.*;
class P1 extends Panel{
    P1()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Button b1 = new Button("East Btn ");
        add(b1);
    }
}
class P2 extends Panel{
    P2()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
    Button b2 = new Button("West Btn");
    add(b2);
    }
}
class P3 extends Panel{
    P3()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Button b3 = new Button("South Btn ");
        add(b3);
    }

}
class P4 extends Panel
{
    P4()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Button b4 = new Button("North Btn");
        add(b4);
    }
}

class Panel_ClosingBtn implements ActionListener,WindowListener{
    Frame f;
    Panel p5;
    Button bb1,bb2,bb3,bb4;
    public void paint(Graphics g)
    {
        g.drawString("hello",50,50);
    }
    Panel_ClosingBtn()
    {
        
        f = new Frame("My Frame");
        f.setBackground(Color.green);
        f.setVisible(true);
        p5 = new Panel();
        f.setLayout(new BorderLayout());
        f.setSize(300,300);
        bb1 = new Button("show East ");
        bb2 = new Button("Show West ");
        bb3 = new Button("Show South ");
        bb4 = new Button("Show North ");
        p5.add(bb1);
        p5.add(bb2);
        p5.add(bb3);
        p5.add(bb4); 
        p5.setBackground(Color.MAGENTA);
        p5.setVisible(true);
        f.add(p5,BorderLayout.CENTER);
        bb1.addActionListener(this);
        bb2.addActionListener(this);
        bb3.addActionListener(this);
        bb4.addActionListener(this);
        f.addWindowListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bb1)
        {
            P1 obj1 = new P1();
            f.add(obj1,BorderLayout.EAST);
            
        }
        else if(ae.getSource()==bb2)
        {
            P2 obj2 = new P2();
            f.add(obj2,BorderLayout.WEST);
            // P2.setBackground(Color.green);
        }
        else if(ae.getSource()==bb3)
        {
            P3 obj3 = new P3();
            f.add(obj3,BorderLayout.SOUTH);
        }

        else if(ae.getSource()==bb4)
        {
            P4 obj4 = new P4();
            f.add(obj4,BorderLayout.NORTH);
        }
    }
    public void windowClosing(WindowEvent we)
    {
        f.dispose();
    }
    public void windowDeactivated(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowClosed(WindowEvent we){}
    public void windowOpened(WindowEvent we){}
    public void windowIconified(WindowEvent we){}
    public void windowDeiconified(WindowEvent we){}



    public static void main(String args[])
    {
        Panel_ClosingBtn pp = new Panel_ClosingBtn();
    }
}