import java.awt.*;
import java.applet.*;

public class Java0407 extends Applet
{
    public void paint(Graphics g)
    {
        g.drawArc(50,50,100,100,0,180);
        g.fillArc(200, 50,100, 100,0,270);
    }
}