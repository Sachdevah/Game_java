import java.awt.image.*;
import java.awt.Graphics.*;
import java.awt.*;
import javax.swing.*;
public class Coin extends Component
{
    ImageIcon imageIcon;
    public Coin(int x,int y)
    {
        super(x,y);
    }
    public void update()
    {
    
    }
    public void draw(Graphics2D g2d)    //draw coin
    {
        g2d.drawImage(getCoinImage(),x,y,null);
    }
    public Image getCoinImage()
    {
        imageIcon = new ImageIcon("coin.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform ImageIcon to Image
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // to adjust the size of Enemy according to the game  
        imageIcon = new ImageIcon(newimg);  // transform it back to ImageIcon
        return imageIcon.getImage();    //returns the ImageIcon
    }
}
