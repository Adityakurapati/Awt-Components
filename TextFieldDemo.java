import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo extends Frame implements ActionListener
{
    Label l1;
    Button b1,b2,b3,b4;
    TextField myt;
    TextFieldDemo()
    {
        // FlowLayout f = new FlowLayout();
        setLayout(null);
        myt = new TextField();
        b1 = new Button("Ok");
        b2 = new Button("Orange");
        b3 = new Button("Green");
        b4 = new Button("Grey");
        
        add(myt);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        l1 = new Label();
        add(l1);

        myt.setBounds(50,50,50,20);
        b1.setBounds(50,120,50,20);
        b2.setBounds(120,120,50,20);
        b3.setBounds(190,120,50,20);
        b4.setBounds(260,120,50,20);
        l1.setBounds(330,160,50,20);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        // TextField tf1 = new TextField("User name");
        // add(tf1);

        // Label l1 = new Label("Hii");
        // add(l1);
        /*
        label l1 = new label("India");
        label l2 = new label("UK");
        label l3 = new label();
        l3.setText("US");
        add(l1);
        add(l2);
        add(l3);
        */
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("Ok")){
        String input = myt.getText();
           l1.setText(input);
        }
        else if(str.equals("Orange"))
        {
            setBackground(Color.orange);

        }
        else if(str.equals("Green"))
        {
            setBackground(Color.GREEN);
        }
        else if(str.equals("Grey"))
        {
            setBackground(Color.GRAY);
        }
    }

    public static void main(String a[])
    {
        TextFieldDemo l = new TextFieldDemo();
        l.setTitle("MyFrame");
        l.setVisible(true);
        l.setSize(500,500);
    }
}

// set path="C:/Program Files/Java/jdk1.8.0_202/bin"
