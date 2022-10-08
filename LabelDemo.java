import java.awt.*;

public class LabelDemo extends Frame
{
    LabelDemo()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        Label l1 = new Label();
        Label l2 = new Label("Age ");
        Label l3 = new Label("marks ",Label.CENTER);
        l2.setBackground(Color.orange);
        l1.setText("Name ");
        String str =l2.getText();
        int str2 =l3.getAlignment();
    
        Label l4 = new Label();
        l4.setText(str);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

    }
    public static void main()
    {
        LabelDemo mf = new LabelDemo();
        mf.setVisible(true);
        mf.setTitle("My Frame ");
        mf.setSize(300,300);

    }
}
