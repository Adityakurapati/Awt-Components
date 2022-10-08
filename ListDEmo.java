import java.awt.*;
import java.awt.event.*;
class ListDEmo extends Frame implements ActionListener
{
    List li;
    TextField tf1,tf2;
    Button b,b1,b2;

    ListDEmo()
    {
        setLayout(new BorderLayout(5,5));
        li = new List();
        li.add("C Programming");
        li.add("Java ");
        li.add("Python ");
        li.add("Ruby ");
        add(li,BorderLayout.WEST);
        li.setSize(10,10);
        b = new Button("Show Selectled ");
        add(b,BorderLayout.SOUTH);
        tf1 = new TextField("Value ");
        tf2 = new TextField("Index ");
        b1 = new Button("Add At Index");
        b2 = new Button("Remove "); 
        
        add(tf1,BorderLayout.NORTH);
        add(tf2,BorderLayout.CENTER);
        add(b1,BorderLayout.EAST);
        b1.setBounds(0,0,20,20);
        b2.setBounds(20,20,40,40);
        add(b2,BorderLayout.EAST);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Label lt = new Label();
        int index1 = Integer.parseInt(tf2.getText());
        String v = tf1.getText();
        
        if(ae.getSource()==b)
        {
            String str = li.getSelectedItem();
            add(lt,BorderLayout.CENTER);
            lt.setText(str);
        }
        else if(ae.getSource()==b1)
        {
            
            li.add(v,index1);
            
        }
        else if(ae.getSource() == b2)
        {
            li.remove(index1);

        }

    }
    public static void main(String a[])
    {
        ListDEmo l = new ListDEmo();
        l.setTitle("My Frame ");
        l.setVisible(true);
        l.setSize(300,300);
    }

}