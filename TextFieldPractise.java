import java.awt.*;
import java.awt.event.*;
public class TextFieldPractise extends Frame implements ActionListener
{
    Label nm,ag,pass,show,EchoChar;
    TextField tf1,tf2,tf3;
    Button Edit,Stable,show1,EchoChar1;
    TextFieldPractise()
    {
        setBackground(Color.magenta);
        setLayout(null);
        nm = new Label("Name ");
        ag = new Label("Age  ");
        pass = new Label("Password  ");
        
        show = new Label();
        EchoChar = new Label();
        show.setBackground(Color.GREEN);
        EchoChar.setBackground(Color.GREEN);
        
         tf1 = new TextField(30);
         tf2 = new TextField("Age",30);
         tf3 = new TextField();
         tf3.setEchoChar('*');
         tf1.setBackground(Color.darkGray);
         tf2.setBackground(Color.darkGray);
         tf3.setBackground(Color.darkGray);
         Edit = new Button("Edit");
         Stable = new Button("Stable");
         show1 =new Button("Show Selected");
         EchoChar1 = new Button("Echo Char ");

         add(nm);add(ag);add(pass);add(tf1);add(tf2);add(tf3);add(Edit);add(Stable);add(show1);add(show);add(EchoChar);add(EchoChar1);
         Edit.addActionListener(this);
         Stable.addActionListener(this);
         show1.addActionListener(this);
         EchoChar1.addActionListener(this);

         nm.setBounds(40,40,50,30);
         ag.setBounds(40,90,50,30);
         pass.setBounds(40,130,70,30);
         tf1.setBounds(140,40,80,20);
         tf2.setBounds(140,90,80,20);
         tf3.setBounds(140,140,80,20);


         Edit.setBounds(40,180,50,30);
         Stable.setBounds(120,180,50,30);
         show1.setBounds(200,180,100,30);
         EchoChar1.setBounds(330,180,80,30);
         show.setBounds(90,230,80,30);
         EchoChar.setBounds(200,230,80,30);


    }
    public void actionPerformed(ActionEvent ae)
    {
        String btnName = ae.getActionCommand();
        if(btnName.equals("Edit")){
            tf1.setEditable(true);
            tf2.setEditable(true);
            tf3.setEditable(true);
            
        }
        else if(btnName.equals("Stable")){
            tf1.setEditable(false);
            tf2.setEditable(false);
            tf3.setEditable(false);

        }
        else if(btnName.equals("show1")){
            String text = tf2.getSelectedText();
            show.setText(text);

        }
        else if(btnName.equals("EchoChar1")){
            char char1 = tf3.getEchoChar();
            String st = Character.toString(char1);
            EchoChar.setText(st);

        }

    }
    public static void main(String args[])
    {
        TextFieldPractise t = new TextFieldPractise();
        t.setVisible(true);
        t.setTitle("My Frame");
        t.setSize(500,500);
    }

}
