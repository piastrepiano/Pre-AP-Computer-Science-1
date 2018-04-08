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
        for(int k =1; k < 65; k ++) {
            g.drawLine(x1, y1, x2, height + 10);
            y1 += 10;
            x2 += 15;
        }
        // bottom right corner
        y1 = 10;
        x2 = 990;
        for(int k = 1; k < 65; k ++){
            g.drawLine(width + 10, y1, x2, height + 10);
            y1 += 10;
            x2 -= 15;
        }
        // top right corner
        x1 = 10;
        y1 = 640;
        x2 = 10;
        int y2 = 10;
        for(int k =1; k < 65; k ++){
            g.drawLine(x1, y1, x2, y2);
            y1 -= 10;
            x2 += 15;
        }
        //top left corner
        y1 = 640;
        x2 = 990;
        y2 = 10;
        for(int k =1; k < 65; k ++){
            g.drawLine(width + 10, y1, x2, y2);
            y1 -= 10;
            x2 -= 15;
        }

        //interior rectangle
        width = 600;
        height = 250;
        g.drawRect(200, 200, width, height);
        // bottom left corner
        x1 = 200;
        y1 = 200;
        x2 = 200;
        for(int k =1; k < 43; k ++) {
            g.drawLine(x1, y1, x2, height + 200);
            y1 += 6;
            x2 += 14;
        }
        // bottom right corner
        y1 = 200;
        x2 = 800;
        for(int k = 1; k < 43; k ++){
            g.drawLine(width + 200, y1, x2, height + 200);
            y1 += 6;
            x2 -= 14;
        }
        //top right corner
        y1 = 450;
        x2 = 800;
        y2 = 200;
        for(int k =1; k < 43; k ++) {
            g.drawLine(width + 200, y1, x2, y2);
            y1 -= 6;
            x2 -= 14;
        }
        // top left corner
        x1 = 200;
        y1 = 450;
        x2 = 200;
        y2 = 200;
        for(int k =1; k < 43; k ++) {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 6;
            x2 += 14;
        }
    }
}