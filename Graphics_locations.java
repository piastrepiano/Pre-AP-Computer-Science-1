import java.awt.*;
import java.applet.*;

public class Graphics_locations extends Applet{
    public void paint(Graphics g){
        draw.start(g);
    }
}

class draw{
    public static void start(Graphics g){
        Color violet = new Color(25, 25, 112);
        //bg
        g.setColor(violet);
        g.fillRect(10,10, 1000,600);
        //moon
        g.setColor(Color.white);
        g.fillArc(725, 50, 150, 150, 0, 360);
        //clouds 1
        g.setColor(Color.lightGray);
        g.fillArc(650, 125,75, 75, 0, 360);
        g.fillArc(700, 125, 75, 75, 0, 360);
        g.fillArc(615, 160, 75, 75, 0, 360);
        g.fillArc(650, 185, 75, 75, 0, 360);
        g.fillArc(700, 185, 75, 75, 0, 360);
        g.fillArc(735, 160, 75, 75, 0, 360);
        g.fillArc(675, 160, 75, 75, 0, 360);
        //clouds 2
        g.fillArc(825, 125,75, 75, 0, 360);
        g.fillArc(875, 125, 75, 75, 0, 360);
        g.fillArc(790, 160, 75, 75, 0, 360);
        g.fillArc(825, 185, 75, 75, 0, 360);
        g.fillArc(875, 185, 75, 75, 0, 360);
        g.fillArc(910, 160, 75, 75, 0, 360);
        g.fillArc(850, 160, 75, 75, 0, 360);
        
        /*
        // a darker shade of blue bottom part (21, 21, 94)
        
            tree color(98, 78, 44)
            darker tree color(83, 49, 24)
            
            Random rndInt = new Random(12345);
        for (int k = 1; k <= 10; k++) {
            x1 = ((int)(Math.random() * 15 + 1000));
            int w = ((int)(Math.random() * 30 + 50));
            g.fillRect(x1, 255, w, 385);
        for (int k = 1; k <= 10; k++) {
            x1 = ((int)(Math.random() * 15 + 1000));
            int w = ((int)(Math.random() * 30 + 50));
            g.fillRect(x1, 270, w, 385);
        */
    }
}
