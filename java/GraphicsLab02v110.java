import java.awt.*;
import java.applet.*;

public class GraphicsLab02v110 extends Applet{
    public void paint(Graphics g){
        //exterior rectangle
        int width = 980;
        int height = 630;
        g.drawRect(10,10, width,height);

        // bottom left corner
        int x1 = 10;
        int y1 = 10;
        int x2 = 10;
        for(int k =1; k < 44; k ++) {
            g.drawLine(x1, y1, x2, height + 10);
            y1 += 15;
            x2 += 20;
        }
        // bottom right corner
        y1 = 10;
        x2 = 990;
        for(int k = 1; k < 44; k ++){
            g.drawLine(width + 10, y1, x2, height + 10);
            y1 += 15;
            x2 -= 20;
        }
        // top right corner
        x1 = 10;
        y1 = 640;
        x2 = 10;
        int y2 = 10;
        for(int k =1; k < 44; k ++){
            g.drawLine(x1, y1, x2, y2);
            y1 -= 15;
            x2 += 20;
        }
        //top left corner
        y1 = 640;
        x2 = 990;
        y2 = 10;
        for(int k =1; k < 44; k ++){
            g.drawLine(width + 10, y1, x2, y2);
            y1 -= 15;
            x2 -= 20;
        }

        //interior rectangle
        width = 620;
        height = 270;
        g.drawRect(190, 190, width, height);
        // bottom left corner
        x1 = 190;
        y1 = 190;
        x2 = 190;
        for(int k =1; k < 26; k ++) {
            g.drawLine(x1, y1, x2, height + 190);
            y1 += 11;
            x2 += 19;
        }
        // bottom right corner
        y1 = 190;
        x2 = 810;
        for(int k = 1; k < 26; k ++){
            g.drawLine(width + 190, y1, x2, height + 190);
            y1 += 11;
            x2 -= 19;
        }
        //top right corner
        y1 = 460;
        x2 = 810;
        y2 = 190;
        for(int k =1; k < 26; k ++) {
            g.drawLine(width + 190, y1, x2, y2);
            y1 -= 11;
            x2 -= 19;
        }
        // top left corner
        x1 = 190;
        y1 = 460;
        x2 = 190;
        y2 = 190;
        for(int k =1; k < 26; k ++) {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 11;
            x2 += 19;
        }
    }
}
