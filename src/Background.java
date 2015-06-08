import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public class Background
{
    private String image;
    public Background(String pic)
    {
        image = pic;
    }
    public void draw(Graphics g)
    {
        ImageIcon backIcon = new ImageIcon(image);
        Image sprite = backIcon.getImage();
        g.drawImage(sprite,0,0, null);
    }
}