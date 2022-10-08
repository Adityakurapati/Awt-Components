import java.awt.*;
import java.awt.event.*;
public class FileDemo extends Frame implements ActionListener
{
    Button b1,b2;

    FileDemo()
    {
        setLayout(new FlowLayout());
        b1 = new Button("Open File ");
        b2 = new Button("Save File ");
        add(b1);add(b2);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            FileDialog open = new FileDialog(this,"Open",FileDialog.LOAD);
            open.setVisible(true);
        }
        else{
            FileDialog save = new FileDialog(this,"Open",FileDialog.SAVE);
            save.setVisible(true);
        }


    }
    public static void main(String a[])
    {
        

    }
}
