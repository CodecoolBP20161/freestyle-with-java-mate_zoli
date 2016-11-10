import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class BulletGenerator {

    static ArrayList<Bullets> b = new ArrayList<Bullets>();
    Bullets TempBullet;

    public BulletGenerator() throws InterruptedException {

        Random rand = new Random();

        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));
        addBullets(new Bullets(rand.nextInt(Putty.Width), rand.nextInt(Putty.Height)));


    }


    public void draw(Graphics2D g2d) {
        for (int i = 0; i < b.size(); i++) {
            TempBullet = b.get(i);
            TempBullet.draw(g2d);
        }
    }

    public void update() {
        for (int i = 0; i < b.size(); i++) {
            TempBullet = b.get(i);
            TempBullet.update();
        }
    }


    public void addBullets(Bullets bullet) {
        b.add(bullet);
    }



    public static ArrayList<Bullets> getBulletBounds() {
        return b;
    }
}