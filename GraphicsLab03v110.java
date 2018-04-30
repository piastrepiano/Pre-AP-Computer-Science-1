/*
NAME: Kim Luong
CLASS/PERIOD: Comp Sci Pre-AP 3rd
ASSIGNMENT: Graphics Lab 03
VERSION: 110 point
PURPOSE: The purpose of this program is to demonstrate knowledge of using constructing objects with the new operator
            and use object methods.
+10 requires Math.random instead of rndInt.nextInt
*/

import java.awt.*;
import java.applet.*;
//import java.util.*;

public class GraphicsLab03v110 extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);

        // Draw Random Lines
        // The cell with lines displays 100 random lines.
        //Both ends of the line have random x and y coordinate locations.
        //The lines are also drawn in random colors.
        for (int k = 1; k <= 100; k++) {
            int x1 = ((int)(Math.random() * 390 + 11));
            int x2 = ((int)(Math.random() * 280 + 11));
            int y1 = ((int)(Math.random() * 280 + 11));
            int y2 = ((int)(Math.random() * 256 + 11));
            int red = ((int)(Math.random() * 256));
            int green = ((int)(Math.random() * 256));
            int blue = ((int)(Math.random() * 256));
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw Random Squares
        // The cell with squares displays 100 random squares.
        //The squares need to be drawn at random locations within the cell, and be entirely inside the cell.
        //The squares have a height and width of 50 pixels.
        //The squares are also drawn in random colors.
        for (int k = 1; k <= 100; k++){
            int x = ((int)(Math.random() * 340 + 400));
            int y = ((int)(Math.random() * 240 + 11));
            int red = ((int)(Math.random() * 256));
            int green = ((int)(Math.random() * 256));
            int blue = ((int)(Math.random() * 256));
            g.setColor(new Color(red, green, blue));
            g.fillRect(x, y, 50, 50);
        }

        // Draw Random Circles
        //The cell with circles displays 100 random circles.
        //The circles need to be drawn at random locations within the cell, and be entirely inside the cell.
        //The circles have a random diameter which ranges from 0 to 200 pixels.
        //The circles are also drawn in random colors.
        for (int k =1; k <= 100; k++){
            int x1 = ((int)(Math.random() * 200 + 11));
            int y1 = ((int)(Math.random() * 98 + 300));
            int width = ((int)(Math.random() * 201 + 1));
            int height = ((int)(Math.random() * 201 + 1));
            int red = ((int)(Math.random() * 256));
            int green = ((int)(Math.random() * 256));
            int blue = ((int)(Math.random() * 256));
            g.setColor(new Color(red, green, blue));
            g.drawArc(x1, y1, width, height, 0, 360);
        }

        // Draw 3-D Box
        //The cell with the box uses nothing random.
        //It uses Polygons and the defined colors of red, green, yellow and blue.
        Polygon front = new Polygon();
        front.addPoint(600, 400);
        front.addPoint(600, 500);
        front.addPoint(700, 500);
        front.addPoint(700, 400);
        g.setColor(new Color(255,0,0));
        g.fillPolygon(front);

        Polygon back = new Polygon();
        back.addPoint(550, 350);
        back.addPoint(650, 350);
        back.addPoint(650,400);
        back.addPoint(600,400);
        g.setColor(new Color(255,255,0));
        g.fillPolygon(back);

        Polygon left = new Polygon();
        left.addPoint(550, 350);
        left.addPoint(550, 450);
        left.addPoint(600, 500);
        left.addPoint(600, 400);
        g.setColor(new Color(0, 255, 0));
        g.fillPolygon(left);

        Polygon right = new Polygon();
        right.addPoint(650, 350);
        right.addPoint(700,400);
        right.addPoint(650,400);
        g.setColor(new Color(0, 0, 255));
        g.fillPolygon(right);

    }
}
