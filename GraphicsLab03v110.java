/*
    The cell with lines displays 100 random lines.
Both ends of the line have random x and y coordinate locations.
The lines are also drawn in random colors.

The cell with squares displays 100 random squares.
The squares need to be drawn at random locations within the cell, and be entirely inside the cell.
The squares have a height and width of 50 pixels.
The squares are also drawn in random colors.

The cell with circles displays 100 random circles.
The circles need to be drawn at random locations within the cell, and be entirely inside the cell.
The circles have a random diameter which ranges from 0 to 200 pixels.
The circles are also drawn in random colors.

The random colors used for the first 3 cells are created by having 3 random values from 0 to 255 which represent the red, green, and blue values for the random color.

The cell with the box uses nothing random.
It uses Polygons and the defined colors of red, green, yellow and blue.
 */

import java.awt.*;
import java.applet.*;
import java.util.*;

public class GraphicsLab03v110 extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);

        //Random rndInt = new Random(1234);

        // Draw Random Lines
        Random rndInt = new Random(12345);
        for (int k = 1; k <= 100; k++) {
            int x1 = (rndInt.nextInt( 400) + 10);
            int x2 = (rndInt.nextInt(400) + 10);
            int y1 = (rndInt.nextInt(280) + 10);
            int y2 = (rndInt.nextInt(280) + 10);
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw Random Squares
        for (int k = 1; k <= 100; k++){
            int x = (rndInt.nextInt(340) + 400);
            int y = (rndInt.nextInt(240) + 10);
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));
            g.fillRect(x, y, 50, 50);
        }

        // Draw Random Circles
        for (int k =1; k <= 100; k++){
            int x1 = (rndInt.nextInt(199) + 10);
            int y1 = (rndInt.nextInt(90) + 300);
            int width = (rndInt.nextInt(200) + 1);
            int height = (rndInt.nextInt(200) + 1);
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));
            g.fillArc(x1, y1, width, height, 0, 360);
        }

        // Draw 3-D Box

    }
}
