import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){

        this.setVisible(true);
        this.setTitle("Canva");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel canva = new JPanel();
        canva.setBackground(Color.BLUE);
        this.add(canva);

    }


}
