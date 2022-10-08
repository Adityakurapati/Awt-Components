import java.awt.*;
import java.awt.event.*;

public class Records extends Frame implements ActionListener
{
    String nm,ag,mn,pan,adar,cty,gn;
    TextField name,mobile_no,city,Aadhar_card,pan_card,age;
    Label heading,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
    Checkbox male,female,others;
    Button submit,clear;
    CheckboxGroup checkboxGroup;

    Records()
    {
         checkboxGroup = new CheckboxGroup();
        setBackground(Color.orange);
        // Font f = new Font("Arial Black",Font.BOLD,18);
        setFont(new Font("Arial Black",Font.BOLD,18));
        setLayout(null);
        
        // 1st Block
        heading = new Label("*** Records *** ");
        heading.setFont(new Font("Times New Romen",Font.BOLD,40));
        l1 = new Label("Name ");
        l2 = new Label("Age ");
        l3 = new Label("Mobile No.");
        l4 = new Label("Gender ");
        l5 = new Label("City ");
        l6 = new Label("Aadhar No.");
        l7 = new Label("Pan No.");

        name = new TextField("");
        age = new TextField(30);
        mobile_no = new TextField(10);
        city = new TextField();
        Aadhar_card = new TextField();
        pan_card = new TextField();

        male = new Checkbox("Male",false,checkboxGroup);
        female = new Checkbox("Female",false,checkboxGroup);
        others = new Checkbox("Others",false,checkboxGroup);

        submit =  new Button("Submit");
        clear = new Button("Clear");
        

        add(heading);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);


        add(name);
        add(age);
        add(male);
        add(female);
        add(others);
        add(mobile_no);
        add(city);
        add(Aadhar_card);
        add(pan_card);
        add(submit);
        add(clear);

        heading.setBounds(200,70,300,40);
        l1.setBounds(50,150,100,30);
        l2.setBounds(50,200,100,30);
        l3.setBounds(50,250,100,30);
        l4.setBounds(50,300,100,30);
        l5.setBounds(50,350,100,30);
        l6.setBounds(50,400,100,30);
        l7.setBounds(50,450,100,30);
        
        name.setBounds(300,150,300,30);
        age.setBounds(300,200,300,30);
        mobile_no.setBounds(300,250,300,30);
        mobile_no.setEchoChar('*');
        male.setBounds(300,300,80,30);
        female.setBounds(400,300,80,30);
        others.setBounds(500,300,80,30);
        city.setBounds(300,350,300,30);
        Aadhar_card.setBounds(300,400,300,30);
        pan_card.setBounds(300,450,300,30);
        submit.setBounds(150,530,150,30);
        clear.setBounds(320,530,150,30);
        submit.setBackground(Color.LIGHT_GRAY);
        clear.setBackground(Color.LIGHT_GRAY);



        // 2nd Block 
        

        l8 = new Label("Name ");
        l9 = new Label("Age");
        l10 = new Label("Mobile No.");
        l11 = new Label("Gender ");
        l12 = new Label("City ");
        l13 = new Label("Aadhar No.");
        l14 = new Label("Pan No.");
        
        l15 = new Label();
        l16 = new Label();
        l17 = new Label();
        l18 = new Label();
        l19 = new Label();
        l20 = new Label();
        l21 = new Label();


        add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);add(l14); 
        add(l15);add(l16);add(l17);add(l18);add(l19);add(l20);add(l21);

        l8.setBounds(50,600,100,30);
        l9.setBounds(170,600,100,30);
        l10.setBounds(290,600,100,30);
        l11.setBounds(410,600,100,30);
        l12.setBounds(530,600,100,30);
        l13.setBounds(650,600,100,30);
        l14.setBounds(770,600,100,30);

        l15.setBounds(50,650,100,30);
        l16.setBounds(170,650,100,30);
        l17.setBounds(290,650,100,30);
        l18.setBounds(410,650,100,30);
        l19.setBounds(530,650,100,30);
        l20.setBounds(650,650,100,30);
        l21.setBounds(770,650,100,30);

    
        submit.addActionListener(this);
        clear.addActionListener(this);

        Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL);
        sb.setBounds(900,20,20,1000);
        add(sb);
        
}
   
    public void actionPerformed(ActionEvent ae)
    {
        // String str = ae.getActionCommand();

        if(ae.getSource()==submit)
        {

            // nm += name.getText();      nulladitya...
            // to replace old with new Text
            // Name = > Name Aditya +
        nm = name.getText();
        l15.setText(nm);

        ag = age.getText();
        l16.setText(" " + ag);

        mn = mobile_no.getText();
        l17.setText(" " + mn);

        
        // Checkbox r = MyGroup.getSelectedCheckbox();
        // gn = r.getLabel();
        // l18.setText(gn);
        l18.setText(" " + checkboxGroup.getSelectedCheckbox().getLabel());
        
        cty = city.getText();
        l19.setText(cty);

        adar = Aadhar_card.getText();
        l20.setText(" " + adar);

        pan = pan_card.getText();
        l21.setText(" " + pan);

        }
        else if(ae.getSource()==clear)
        {
            name.setText("");
            age.setText("");
            mobile_no.setText("");
            // name.setText("");
            city.setText("");
            Aadhar_card.setText("");
            pan_card.setText("");
            l15.setText("");
            l16.setText("");
            l17.setText("");
            l18.setText("");
            l19.setText("");
            l20.setText("");
            l21.setText("");

        }

        

    }
    
    public static void main(String args[])
    {
        Records person1 = new Records();
        person1.setTitle("Records ");
        person1.setVisible(true);
        person1.setSize(920,800);
    }

    
}

