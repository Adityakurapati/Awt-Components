import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2,tf3;
    Button b1,b2,b3,b4;

    Calculator()
    {
        setBackground(Color.MAGENTA);
        setLayout(null);
        Font f1 = new Font("Times New Romen",Font.BOLD|Font.ITALIC,40);
        Font f2 = new Font("Times New Romen",Font.BOLD,18);

        l1 = new Label("Calculator ");
        l1.setFont(f1);
        setFont(f2);
        // setBackground(Color.green);

        l2 = new Label("Number 1 :");
        l3 = new Label("Number 2 :");

        tf1 = new TextField(30);
        tf2 = new TextField(30);
        tf3 = new TextField();

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");

        add(b1);add(b2);add(b3);add(b4);
        add(l1);add(l2);add(l3);
        add(tf1);add(tf2);add(tf3);


        l1.setBounds(150,50,400,100);
        l2.setBounds(50,140,100,40);
        l3.setBounds(50,200,100,40);
        tf1.setBounds(250,140,100,40);
        tf2.setBounds(250,200,100,40);
        b1.setBounds(50,280,60,40);
        b2.setBounds(130,280,60,40);
        b3.setBounds(210,280,60,40);
        b4.setBounds(290,280,60,40);
        tf3.setBounds(120,360,130,30);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


    }
    public void actionPerformed(ActionEvent ae)
    {
        int a= Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        String value;
        if(ae.getSource()==b1)
        {
            value = Integer.toString(a + b);
            tf3.setText(value);
        }
        else if(ae.getSource()==b1)
        {
            value = Integer.toString(a - b);
            tf3.setText(value);

        }
        else if(ae.getSource()==b1)
        {
            value = Integer.toString(a * b);
            tf3.setText(value);

        }
        else if(ae.getSource()==b1)
        {
            value = Integer.toString(a / b);
            tf3.setText(value);
        }
    }
    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();
        cal.setTitle("Calculator");
        cal.setSize(400,500);
        cal.setVisible(true);
        
    }

}