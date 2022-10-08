import java.awt.*;
class ButtonDemo extends Frame 
{
    ButtonDemo()
    {
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT,100,100);

        
        setLayout(f);
        // setTitle("My Frame");
        // setSize(200,200);
        // setVisible(true);
        setBackground(Color.orange);
        Button b = new Button("Ok");
        Button b1 = new Button("Cancel");
        Button b2 = new Button();

        Label l1 = new Label();
        l1.setText(b.getLabel());
        b1.setLabel("Cancel");
        b2.setLabel("Retry");
        b2.setBackground(Color.green);

        add(b);add(b1);add(b2);
    }
    public static void main(String args[])
    {
        // ButtonDemo f1 = new ButtonDemo("My Frame ");
        ButtonDemo f1 = new ButtonDemo();
        f1.setTitle("My Frame");             // to accces  
        f1.setSize(800,800);
        f1.setVisible(true);

    }
}