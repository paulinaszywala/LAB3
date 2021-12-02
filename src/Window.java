import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame implements KeyListener, MouseListener {

    Canva canva;
    JLabel label;
    ImageIcon oval;
    ImageIcon square;


    public Window(){

        this.setVisible(true);
        this.setTitle("Canva");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.pack();
        this.addMouseListener(this);
        this.addKeyListener(this);

        oval = new ImageIcon("oval.png");
        square = new ImageIcon("square.png");

        label = new JLabel();
        label.addKeyListener(this);

        label.setIcon(oval);

        this.add(label);
        label.setVisible(false);

        //this.setLocationRelativeTo(null);


        /*JPanel canva = new JPanel();
        canva.setBackground(Color.BLUE);
        this.add(canva);*/

       // canva = new Canva();
        //this.add(canva);

    }



    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()){
            case 'o': label.setIcon(oval);
                break;
            case 's': label.setIcon(square);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        label.setVisible(true);
        label.setLocation(e.getX(),e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
