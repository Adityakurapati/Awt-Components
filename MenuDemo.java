import java.awt.*;
import java.awt.event.*;
class MenuDemo extends Frame implements ActionListener
{
    MenuItem mt12,mt13;
    MenuDemo()
    {
        // setLayout(new FlowLayout(FlowLayout.CENTER));
        MenuBar mbr = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("View");
        MenuItem mt11 = new MenuItem("New ");
        mt12 = new MenuItem("Open");
        mt13 = new MenuItem("Save");
        MenuItem mt14 = new MenuItem("Save As");
        m1.add(mt11);m1.add(mt12);m1.add(mt13);m1.add(mt14);
        MenuItem mt21 = new MenuItem("Copy");
        MenuItem mt22 = new MenuItem("Cut");
        MenuItem mt23 = new MenuItem("Paste");
        m2.add(mt21);m2.add(mt22);m2.add(mt23);
        Menu mt31 = new Menu("Zoom ");
        MenuItem mt311 = new MenuItem("Zoom In");
        MenuItem mt312 = new MenuItem("Zoom out");
        MenuItem mt313 = new MenuItem("Restore");
        mt31.add(mt311); mt31.add(mt312); mt31.add(mt313);
        CheckboxMenuItem mt32 = new CheckboxMenuItem("Status ");
        m3.add(mt31);
        m3.add(mt32);
        mbr.add(m1);
        mbr.add(m2);
        mbr.add(m3);
        setMenuBar(mbr);
        TextArea ta = new TextArea("",50,80,Scrollbar.VERTICAL);
        ta.setBackground(Color.MAGENTA);
        Font f = new Font("Arial New",Font.BOLD,18);
        ta.setFont(f);
        add(ta);
        mt12.addActionListener(this);
        mt13.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("Open"))
        {
            FileDialog fb = new FileDialog(this,"Open",FileDialog.LOAD);
            fb.setVisible(true);
            fb.setSize(300,300);
        }
        else{
            FileDialog fb = new FileDialog(this,"Open",FileDialog.SAVE);
            fb.setVisible(true);
            fb.setSize(300,300);
        }
    }
    public static void main(String a[])
    {
        MenuDemo m = new MenuDemo();
        m.setVisible(true);
        m.setTitle("Notepad ");
        m.setSize(500,500);
    }
}