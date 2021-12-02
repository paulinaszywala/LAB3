import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements KeyListener, MouseListener, ActionListener {

    JLabel label;
    JPanel panel;
    JButton button, reset;
    ImageIcon oval;
    ImageIcon square;


    public Window(){

        this.setTitle("Canva");
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setBounds(90,35,600,400);
        panel.setLayout(new FlowLayout());
        panel.setFocusable(true);
        this.add(panel);


        oval = new ImageIcon("oval.png");
        square = new ImageIcon("square.png");

        label = new JLabel();
        label.addKeyListener(this);
        label.addMouseListener(this);

        label.setIcon(oval);
        panel.add(label);
        label.setVisible(false);


        panel.addMouseListener(this);
        panel.addKeyListener(this);

        button = new JButton("Kliknij tutaj");
        button.setBounds(140,500,100,50);
        this.add(button);
        button.addMouseListener(this);
        button.addActionListener(this);

        reset = new JButton("Reset");
        reset.setBounds(550,500,100,50);
        this.add(reset);
        reset.addActionListener(this);


        this.setVisible(true);

    }



    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyChar()){
            case 'o': label.setIcon(oval);
                break;
            case 's': label.setIcon(square);
        }
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

    button.setLocation(button.getX()-10, button.getY()-10);




    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == reset)
        {
            button.setBounds(140,500,100,50);
            label.setVisible(false);
        }
        if(source == button)
        {
            button.setBounds(0,0,100,50);

        }

    }
}
