import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Game extends JPanel implements ActionListener
{
    Timer gameTimer;
    Component p;
    Component e;
    multipleCoins mc;
    public Game(JFrame f)
    {
        gameTimer=new Timer(10,this);   //timer to refresh screen in every 10ms
        gameTimer.start();
        p=new Player(100,100);          //creating a new player
        e=new Enemy(200,200);           //creating a new enemy
        mc=new multipleCoins();
        f.addKeyListener(new KeyListener()      //adding keyListener for the movement of the player
        {
            public void keyTyped(KeyEvent evnt) {
    
            }
            public void keyPressed(KeyEvent evnt) {
                p.keyPressed(evnt);     
                
            }
            public void keyReleased(KeyEvent evnt) {
                p.keyReleased(evnt);
            }
        });
    }
    public void paint(Graphics g)           //Draws the contents of the screen
    {
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        p.draw(g2d);
        e.draw(g2d);
        mc.draw(g2d);
    }
    public void actionPerformed(ActionEvent l)      //for refreshing the screen 
    {
        repaint();
        p.update();
        e.update();
        mc.update();
    }
    
}
