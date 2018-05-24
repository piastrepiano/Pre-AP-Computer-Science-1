import java.awt.*;
import java.applet.*;

public class Graphics_locations extends Applet{
    public void paint(Graphics g){
        draw.base(g);
        draw.roof_lines(g);
        draw.bottom_decor(g);
    }
}

class draw{
    public static void base (Graphics g) {
        //bg color
        g.setColor(Color.green);
        g.fillRect(10, 10, 1000, 600);
        //color of house
        Color brown = new Color(100, 61, 1);
        g.setColor(brown);
        //bottom
        g.fillRect(300, 300, 500, 310);
        //top
        g.setColor(Color.gray);
        Polygon top = new Polygon();
        top.addPoint(330, 100);
        top.addPoint(770, 100);
        top.addPoint(830, 300);
        top.addPoint(270, 300);
        g.fillPolygon(top);
        g.setColor(Color.darkGray);
        g.drawPolygon(top);
    }

    public static void roof_lines(Graphics g) {
        g.drawLine(325, 120, 775, 120);
        g.drawLine(320, 140, 780, 140);
        g.drawLine(310, 170, 790, 170);
        g.drawLine(300, 200, 800, 200);
        g.drawLine(290, 230, 810, 230);
        g.drawLine(280, 260, 820, 260);

        int x1 = 330;
        int x2 = 270;
        for (int k = 1; k <= 7; k++) {
            g.drawLine(x1, 100, x2, 300);
            x1 += 30;
            x2 += 30;
        }

        x1 = 770;
        x2 = 830;
        for (int k = 1; k <= 7; k++) {
            g.drawLine(x1, 100, x2, 300);
            x1 -= 30;
            x2 -= 30;
        }

        g.drawLine(540, 100, 490, 300);
        g.drawLine(560, 100, 610, 300);
        g.drawLine(550, 100, 530, 300);
        g.drawLine(550, 100, 570, 300);
        //floor line bottom
        g.drawLine(300, 455, 800, 455);
    }

    public static void bottom_decor(Graphics g){
        int x1 = 330;
        int y1 = 455;
        int w = 30;
        for (int k = 1; k <= 5; k++) {
            g.fillRect(x1, y1, w, 10);
            x1 -= 5;
            y1 += 30;
            w += 10;
        }

        x1 = 330;
        y1 = 455;
        int y2 = y1 + 30;
        for (int k = 1; k <= 5; k++) {
            g.drawLine(x1, y1, x1, y2);
            x1 -= 5;
            y1 += 30;
            y2 += 30;
        }

        x1 = 360;
        y1 = 455;
        y2 = y1 + 30;
        for (int k = 1; k <= 5; k++){
            g.drawLine(x1,  y1, x1, y2);
            x1 += 5;
            y1 += 30;
            y2 += 30;
        }


    }
}
//draw string 2 ints and a string x, y, literal string*/
