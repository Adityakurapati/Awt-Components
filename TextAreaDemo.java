import java.awt.*;
class TextAreaDemo extends Frame
{
    TextAreaDemo()
    {
        setLayout(null);
        Label l1 = new Label("Message");
        TextArea ta1 = new TextArea("Cooment",5,5,Scrollbar.VERTICAL);
        
        add(l1);
        add(ta1);

        l1.setBounds(40,40,50,30);
        ta1.setBounds(40,100,300,50);
    }
    public static void main(String a[])
    {
        TextAreaDemo T = new TextAreaDemo();
        T.setVisible(true);
        T.setTitle("My Frame");
        T.setSize(500,500);


    }

}