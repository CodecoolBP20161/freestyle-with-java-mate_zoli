import javax.swing.*;
import java.awt.*;

public class Bullets extends GlobalPosition{

    private String image = "/Cultures-Star-Of-David-icon.png";
    int speed = 5;

    public Bullets(int x, int y) {

        super(x, y);
    }

    public void update() {

        x -= speed;

        if(x < 0) {
            x = Putty.Width;
        }
    }

    public Rectangle getBBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void draw(Graphics2D g2d) {

        g2d.drawImage(getBulletImage(),x, y, null);
    }

    public Image getBulletImage() {
        ImageIcon i =  new ImageIcon(getClass().getResource(image));
        return i.getImage();
    }
}