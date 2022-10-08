import java.awt.*;

public class Db extends Frame {
    public static void main(String args[])
    {
        Db f = new Db();
        f.setVisible(true);
        f.setSize(500,500);
        f.setTitle("MY Frame ");
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        Dialog d = new Dialog(f,true);
        d.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        d.add(new Button("Done"));
        d.add(new Button("Retry"));
        d.setVisible(true);
        d.setSize(200,200);
        d.dispose();

    }

}
