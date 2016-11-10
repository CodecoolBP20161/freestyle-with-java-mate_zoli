import javax.swing.JFrame;


public class Putty {
    public static final int Width = 1000;
    public static final int Height = 500;
    public static final String Title = "Putty";

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame(Title);
        frame.pack();
        frame.setSize(Width,Height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Game());
        frame.setVisible(true);

    }

}

