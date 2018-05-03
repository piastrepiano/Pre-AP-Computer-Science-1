import java.awt.*;
import java.applet.*;
import java.util.Random;

public class random_lines extends Applet{
    public void paint(Graphics g) {
        Random rndInt = new Random(12345);
        for (int k = 1; k <= 1000; k++) {
            int x1 = rndInt.nextInt(800);
            int x2 = rndInt.nextInt(600);
            int y1 = rndInt.nextInt(800);
            int y2 = rndInt.nextInt(600);
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
