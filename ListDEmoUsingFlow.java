import java.awt.*;
import java.awt.event.*;
class ListDEmoUsingFlow extends Frame implements ActionListener
{
    List li;
    TextField tf1,tf2;
    Button b,b1,b2,b3;
    Label lt;
    ListDEmoUsingFlow()
    {
        setBackground(Color.MAGENTA);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        lt = new Label("                                              ");
        lt.setVisible(true);
        
        lt.setBackground(Color.green);
        li = new List();
        li.add("C Programming");
        li.add("Java ");
        li.add("Python ");
        li.add("Ruby ");
        add(li,BorderLayout.WEST);
        li.setSize(10,10);
        b = new Button("Show Selectled ");
        tf1 = new TextField("Value ");
        tf2 = new TextField("Index ");
        b1 = new Button("Add At Index");
        // setLayout(new FlowLayout(FlowLayout.RIGHT));
        b2 = new Button("Remove "); 
        b3 = new Button("Remove All"); 
        
        
        add(tf1);
        add(tf2);
        add(b);
        add(b1);
        add(b2);
        add(b3);
        // b1.setBounds(0,0,20,20);
        // b2.setBounds(20,20,40,40);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(lt);

    }
    public void actionPerformed(ActionEvent ae)
    {
        
        int index1 = Integer.parseInt(tf2.getText());
        String v = tf1.getText();
        
        if(ae.getSource()==b)
        {
            String str = li.getSelectedItem();
            lt.setText(str);
        }
        else if(ae.getSource()==b1)
        {
            
            li.add(v,index1);
            
        }
        else if(ae.getSource() == b2)
        {
            li.remove(li.getSelectedIndex());

        }
        else if(ae.getActionCommand().equals("Remove All"))
        {
            li.removeAll();

        }

    }
    public static void main(String a[])
    {
        ListDEmoUsingFlow l = new ListDEmoUsingFlow();
        l.setTitle("My Frame ");
        l.setVisible(true);
        l.setSize(300,300);
    }

}