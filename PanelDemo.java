import java.awt.*;
class PanelDemo extends Panel
{
    public static void main(String args[])
    {
        // setLayout(new FlowLayout());
        Frame f = new Frame("My Frame ");
        f.setBackground(Color.green);
        PanelDemo p = new PanelDemo();
        p.setBackground(Color.MAGENTA);
        p.setBounds(20,20,80,50);
        Button b = new Button("Ok");
        p.add(b);
        f.add(p);
        f.pack();
        f.show();
    }

}