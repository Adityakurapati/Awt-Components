import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ChoiseBoxDemo extends JFrame implements ItemListener
{
    Choice cb;
    ChoiseBoxDemo()
    {
    setLayout(new FlowLayout());
      cb= new Choice();
     cb.add("c ");
     cb.add("Java ");
     cb.add("Python ");
     cb.add("javaScript ");
     add(cb);
     cb.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str = cb.getSelectedItem();
        JOptionPane.showMessageDialog(this, "You Have Selected "+str);
    }
    public static void main(String a[])
    {
        ChoiseBoxDemo c = new ChoiseBoxDemo();
        c.setTitle("My Frame");
        c.setVisible(true);
        c.setSize(400,400);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}