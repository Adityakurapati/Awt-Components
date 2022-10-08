import java.awt.*;

class DialogDemo extends Frame
{
    public static void main(String args[])
    {
        DialogDemo f1 = new DialogDemo();
        f1.setVisible(true);
        f1.setTitle("Frame");
        f1.setSize(400,400);

        Dialog db = new Dialog(f1,"Warning",true);
        db.setLayout(new FlowLayout());
        db.setVisible(true);
        db.setSize(500,500);
        Button b = new Button("Ok");
        Button b1 = new Button("Ok");
        Button b2 = new Button("Ok");
        db.add(b);
        db.add(b1);
        db.add(b2);
        f1.add(db);


        // for(int i=0;i<5;i++)
        // {
        //     d1.add(new Button("Bttton "+i));
        // }
        // f1.add(d1);
    }
}