import java.awt.*;
import java.applet.*;
import java.util.Random;

public class random_shapes extends Applet{
    public void paint(Graphics g)
    {
        Random rndInt = new Random(12345);
        for (int k = 1; k <= 1000; k++) {
            //coordinates
            int a = rndInt.nextInt(400);
            int b = rndInt.nextInt(70);
            int c = rndInt.nextInt(550);
            int d = rndInt.nextInt(200);
            int e = rndInt.nextInt(500);
            int f = rndInt.nextInt(350);
            int h = rndInt.nextInt(300);
            int j = rndInt.nextInt(250);

            //random color
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));

            //draw polygon
            Polygon penta = new Polygon();
            penta.addPoint(a,b);
            penta.addPoint(c,d);
            penta.addPoint(e,f);
            penta.addPoint(h,f);
            penta.addPoint(j,d);
            g.fillPolygon(penta);

        }
    }
}
