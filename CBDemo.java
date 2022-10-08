import java.awt.*;
import java.awt.event.*;

class CBDemo extends Frame implements ItemListener
{
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;
    Label l1;

    CBDemo(String title)
    {
        super(title);
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        cbg = new CheckboxGroup();
        c1 = new Checkbox("India",true,cbg);
        c2 = new Checkbox("America",true,cbg);
        c3 = new Checkbox("Us",true,cbg);
        c4 = new Checkbox("UK",true,cbg);

        l1 = new Label();

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l1);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        // c1.getState();
        // Checkbox r= cbg.getSelectedCheckbox();
        // String str = r.getLabel;
        // l1.setText("You Have Selcted "+str );


        l1.setText("You Have Selcted "+cbg.getSelectedCheckbox().getLabel());


    }
    public static void main(String[] args) 
    {
        CBDemo cb = new CBDemo("CheckBox Texting ");
        cb.setVisible(true);
        cb.setSize(500,500);

    }
    

}