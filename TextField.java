import java.awt.*;
class LabelDemo extends Frame
{
    LabelDemo()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        Button b = new Button("Ok");
        add(b);
        TextField tf1 = new TextField("User name",10);
        add(tf1);
        
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

    public static void main(String a[])
    {
        LabelDemo l = new LabelDemo();
        l.setTitle("MyFrame");
        l.setVisible(true);
        l.setSize(500,500);
    }
}

// set path="C:/Program Files/Java/jdk1.8.0_202/bin"
