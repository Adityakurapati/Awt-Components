import java.awt.*;

public class GridDemo extends Frame {
    GridDemo() {
        setBackground(Color.ORANGE);
        setLayout(new GridLayout(5, 5 ,10,10));
        // for (int i = 1; i < 6; i++) {
        //     for (int j = 1; j < 6; j++) {
        //         add(new Button("B" + i * j));
        //     }
        // }
        for (int i = 1; i < 26; i++) {
            add(new Button("B" +i));
        }
    }

    public static void main(String args[]) {
        GridDemo g = new GridDemo();
        g.setVisible(true);
        g.setTitle("My Grid");
        g.setSize(500, 500);
    }

}
