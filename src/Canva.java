import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canva extends JPanel implements MouseListener, KeyListener {

    JLabel label;
    ImageIcon oval;
    ImageIcon square;

    public Canva(){

        this.setBackground(Color.PINK);
        this.setPreferredSize(new Dimension(500,500));





    }




    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()){
            case 'o': label.setIcon(oval);
            break;
            case 'k': label.setIcon(square);
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




    }

    @Override
    public void mousePressed(MouseEvent e) {

        this.add(label);
        label.setLocation(e.getX(),e.getY());

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
