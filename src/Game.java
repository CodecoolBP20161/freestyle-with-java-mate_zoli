import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener{

    private String background = "icons/background2-33.png";
    Timer gameLoopTimer;
    Player p1;
    BulletGenerator bG;


    public Game() throws InterruptedException {
        setFocusable(true); // don't have to  click on it to use
        gameLoopTimer = new Timer(10, this); // every 10 ms we will run through @override
        gameLoopTimer.start();

        p1 = new Player(0,Putty.Height/2);
        bG = new BulletGenerator();

        addKeyListener(new KeyInput(p1));
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g; // converting Graphics to Graphics2D
        g2d.drawImage(getBackgroundImage(),0 ,0, null);
        bG.draw(g2d);
        p1.draw(g2d);

    }

    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }


    @Override
    public void actionPerformed(ActionEvent ee) {
        //System.out.println("fosszar")
        repaint();
        p1.update();
        bG.update();


    }

}