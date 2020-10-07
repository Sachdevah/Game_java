import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Player extends Component
{
    ImageIcon imageIcon;
    int velx=0;
    int vely=0;
    public Player(int x,int y)
    {
        super(x,y);
    }
    public void update()        //don't let the player move outside the frame
    {
        x+=velx;
        y+=vely;
        if(x<0)
        {
            x=0;
        }
        if(y<0)
        {
            y=0;
        }
        if(x>655)
        {
            x=655;
        }
        if(y>430)
        {
            y=430;
        }
        
    }
    public void draw(Graphics2D g2d)        //Draws the image of player
    {
        g2d.drawImage(getPlayerImage(),x,y,null);
    }
    public Image getPlayerImage()
    {
        imageIcon = new ImageIcon("img.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform ImageIcon to Image
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); //to adjust the size of Enemy according to the game 
        imageIcon = new ImageIcon(newimg);  // transform it back to ImageIcon
        return imageIcon.getImage();//returns the ImageIcon
    }
    public void keyPressed(KeyEvent e)      //moves the player according to the key pressed by user
    {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT)
        {
            velx=10;
        }
        else if(key==KeyEvent.VK_LEFT)
        {
            velx=-10;
        }
        else if(key==KeyEvent.VK_UP)
        {
            vely=-10;
        }
        else if(key==KeyEvent.VK_DOWN)
        {
            vely=10;
        }
    }
    public void keyReleased(KeyEvent e)     //stops the movement of the player when keys are released
    {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT)
        {
            velx=0;
        }
        else if(key==KeyEvent.VK_LEFT)
        {
            velx=0;
        }
        else if(key==KeyEvent.VK_UP)
        {
            vely=0;
        }
        else if(key==KeyEvent.VK_DOWN)
        {
            vely=0;
        }
    
    }
}
