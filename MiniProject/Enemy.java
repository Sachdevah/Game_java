import java.awt.*;
import javax.swing.*;
public class Enemy extends Component
{
    ImageIcon imageIcon;
    int speed =5;
    public Enemy(int x,int y)
    {
        super(x,y);
    }
    public void draw(Graphics2D g2d)        //draw enemy 
    {
        g2d.drawImage(getEnemyImage(),x,y,null);
    }
    
    public void update()        //tells about the movement of enemy on screen 
    {
        x+=speed;
        if(x>655)
        {
            speed=-10;
        }
        if(x<0)
        {
            speed=10;
        }
    }
    public Image getEnemyImage()
    {
        imageIcon = new ImageIcon("enemy.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage();     // transform ImageIcon to Image 
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);   // to adjust the size of Enemy according to the game 
        imageIcon = new ImageIcon(newimg);  // transform it back to ImageIcon
        return imageIcon.getImage();        //returns the ImageIcon
    }
}
