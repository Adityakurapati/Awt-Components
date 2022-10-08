import java.awt.*;
import java.awt.event.*;
class ColorChange extends Frame implements ActionListener
{
    Checkbox c1,c2,c3,c4;
    Label l1;
    CheckboxGroup cbg;
    Button b1;
    ColorChange()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        l1 = new Label();
        cbg = new CheckboxGroup();
        c1 = new Checkbox("India",false,cbg);
        c2 = new Checkbox("America",false,cbg);
        c3 = new Checkbox("Us",false,cbg);
        c4 = new Checkbox("Uk",false,cbg);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        // add(cbg);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        // Checkbox result = cbg.getSelectedCheckbox().
        // String str = result.getLabel;
        // l1.setText(""+str);
        l1.setText(" You Have  Selected "+ cbg.getSelectedCheckbox().getLabel());

    }
}
class MyClass {
    public static void main(String[] args) 
    {
        ColorChange myobj = new ColorChange();
        myobj.setTitle("CheckBox");
        myobj.setVisible(true);
        myobj.setSize(500,500);
        
    }


}