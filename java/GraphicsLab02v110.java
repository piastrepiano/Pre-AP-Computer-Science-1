import java.awt.*;
import java.applet.*;

public class Graphics_locations extends Applet {
    public void paint(Graphics g) {

    }

Class draw{ 
        public static void abandoned_house (Graphics g){
    }
        public static void base (Graphics g){
        //bg color
        g.setColor(Color.green);
        g.fillRect(10, 10, 1000, 600);
        //color of house
        Color brown = new Color(100, 61, 1);
        g.setColor(brown);
        //base
        g.fillRect(300, 300, 500, 310);
        //top
        g.setColor(Color.gray);
        Polygon top = new Polygon();
        top.addPoint(330, 100);
        top.addPoint(770, 100);
        top.addPoint(830, 300);
        top.addPoint(270, 300);
        g.fillPolygon(top);
    }

        public static void roof_lines {
            //lines roof
            g.setColor(Color.darkGray);
            g.drawPolygon(top);
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

            int x1_1 = 770;
            int x2_2 = 830;
            for (int k = 1; k <= 7; k++) {
                g.drawLine(x1_1, 100, x2_2, 300);
                x1_1 -= 30;
                x2_2 -= 30;
            }
        }
    }
    
}
//draw string 2 ints and a string x, y, literal string
