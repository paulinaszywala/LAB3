import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame implements KeyListener {

    Canva canva;

    public Window(){

        this.setVisible(true);
        this.setTitle("Canva");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*JPanel canva = new JPanel();
        canva.setBackground(Color.BLUE);
        this.add(canva);*/

        canva = new Canva();
        this.add(canva);




    }


    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar())
        {
            case 'k':
            {
            
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
