import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Player extends  GlobalPosition{

    private String playerimage = "icons/Cartman-Hitler-zoomed-icon.png";

    int velY = 0;

    private ArrayList<Bullets> b = BulletGenerator.getBulletBounds();

    public Player(int x, int y) {
        super(x, y);
    }

    public void update() {

        y += velY;

        if(y < 1) {
            y = 1;
        }

        if(y > Putty.Height - 150) { // our sprite is 126*126
            y = Putty.Height - 150;
        }

        Collision();
    }

    public void Collision() {
        for (int i = 0; i < b.size(); i++) {
            if(getBounds().intersects(b.get(i).getBBounds())) {

                System.out.println("Collision");
            }
        }

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            velY -= 5;
        } else if (key == KeyEvent.VK_DOWN) {
            velY += 5;
        }


    }

    public void keyReleased (KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            velY = 0;
        } else if (key == KeyEvent.VK_DOWN) {
            velY = 0;
        }

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 128, 128);
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getPlayerImage(), x, y, null);
    }

    public Image getPlayerImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }
}

