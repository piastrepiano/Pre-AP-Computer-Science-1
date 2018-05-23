import java.awt.*;
import java.applet.*;

public class Graphics_locations extends Applet{
    public void paint(Graphics g){
        draw.abandoned_house(g);
    }
}

class draw{
    public static void abandoned_house(Graphics g){
        //bg color
        g.setColor(Color.green);
        g.fillRect(10,10, 1000,600);
        //color of house
        Color brown = new Color(100, 61, 1);
        g.setColor(brown);
        //base
        g.fillRect(300, 300, 500, 310);
        //top
        g.setColor(Color.gray);
        Polygon top = new Polygon();
        top.addPoint(330,100);
        top.addPoint(770,100);
        top.addPoint(830, 300);
        top.addPoint(270, 300);
        g.fillPolygon(top);
        //lines roof
        g.setColor(Color.darkGray);
        g.drawPolygon(top);
        g.drawLine(325, 120, 775, 120);
        g.drawLine(320, 140, 780, 140);
        g.drawLine(310, 170, 790, 170);
        g.drawLine(300, 200, 800, 200);
        g.drawLine(290, 230, 810, 230);
        g.drawLine(280, 260, 820, 260);

    }
}
//draw string 2 ints and a string x, y, literal string
