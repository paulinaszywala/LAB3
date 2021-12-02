import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame implements KeyListener, MouseListener {

    JLabel label;
    JPanel panel;
    JButton button;

    ImageIcon oval;
    ImageIcon square;



    public Window(){

        this.setVisible(true);

        this.setTitle("Canva");
        this.setPreferredSize(new Dimension(600,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //panel = new JPanel();
        //panel.setBackground(Color.pink);
        //panel.setBounds(40,35,500,500);
        //panel.setLayout(new FlowLayout());
        //this.add(panel);

        this.setPreferredSize(new Dimension(600,600));

        oval = new ImageIcon("oval.png");
        square = new ImageIcon("square.png");

        label = new JLabel();
        label.addKeyListener(this);

        label.setIcon(oval);
        this.add(label);
        label.setVisible(false);

        this.pack();
        this.addMouseListener(this);
        this.addKeyListener(this);

        button = new JButton("Kliknij tutaj");
        button.setBounds(230,500,100,50);
        this.add(button);
        button.addMouseListener(this);



        //this.setLocationRelativeTo(null);



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

        label.setVisible(true);
        label.setLocation(e.getX(),e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {



            button.setLocation(button.getX()-10, button.getY()-10);


    }

    @Override
    public void mouseExited(MouseEvent e) {



    }
}
