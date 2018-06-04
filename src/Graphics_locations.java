import java.awt.*;
import java.applet.*;

public class house extends Applet{
    public void paint(Graphics g){
        draw.draw_house(g);
    }
}

class draw{
    public static boolean one = true;

    public static void draw_house(Graphics g){
        if(one){
            bg(g);
            base(g);
            roof_lines(g);
            bottom_decor(g);
            one = false;
        }
        else{
            new_bg(g);
            new_base(g);
            roof_lines(g);
            bottom_decor(g);
        }
    }

    public static void bg (Graphics g) {
        Color darker_sky = new Color(30, 144, 255);
        g.setColor(darker_sky);
        g.fillRect(10, 10, 1000, 500);
        g.setColor(Color.green);
        g.fillRect(10, 500, 1000, 110);
    }

    public static void new_bg (Graphics g) {
        Color light_sky = new Color(0, 191, 255);
        g.setColor(light_sky);
        g.fillRect(10, 10, 1000, 500);
        g.setColor(Color.green);
        g.fillRect(10, 500, 1000, 110);
    }


    public static void base (Graphics g) {
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

    public static void new_base (Graphics g){
        //color of house
        Color white = new Color(220, 220, 220);
        g.setColor(white);
        //bottom
        g.fillRect(300, 300, 500, 310);
        //top
        g.setColor(Color.lightGray);
        Polygon top = new Polygon();
        top.addPoint(330, 100);
        top.addPoint(770, 100);
        top.addPoint(830, 300);
        top.addPoint(270, 300);
        g.fillPolygon(top);
        g.setColor(Color.gray);
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
        Color dark_brown = new Color(81, 49, 1);
        g.setColor(dark_brown);

        int x1 = 330;
        int y1 = 455;
        int w = 30;
        int h = 30;
        for (int k = 1; k <= 5; k++) {
            g.fillRect(x1, y1, w, h);
            x1 -= 5;
            y1 += 30;
            w += 10;
        }

        Color stairs = new Color(157, 95, 2);
        g.setColor(stairs);
        x1 = 330;
        y1 = 455;
        w = 30;
        for (int k = 1; k <= 5; k++) {
            g.fillRect(x1, y1, w, 10);
            x1 -= 5;
            y1 += 30;
            w += 10;
        }

        g.setColor(Color.black);
        g.drawRect(499, 304, 101, 151);
        Color door = new Color(165,42,42);
        g.setColor(door);
        g.fillRect(500, 305, 100, 150);
        g.setColor(Color.black);
        g.fillArc(580, 375, 10, 10, 0, 360);
    }
}
//draw string 2 ints and a string x, y, literal string*/
