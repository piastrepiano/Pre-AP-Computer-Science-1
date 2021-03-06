/*
    Using a Graphics Applet, create an object and its methods to draw a vehicle of your choice.
    It may be terrestrial, aerial, nautical, extraterrestrial, etc.
    Be sure to use the One Task, One Module rule.
 */

import java.awt.*;
import java.applet.*;

public class vehicle_class_identifier extends Applet{
    public void paint(Graphics g){
        Vehicle.drawWheels(g);
        Vehicle.drawBody(g);
        Vehicle.drawHead(g);
        Vehicle.drawDoor(g);
    }
}

class Vehicle{
    static void drawWheels(Graphics g){
        g.setColor(Color.black);
        g.fillOval(350, 400, 75,75);
        g.fillOval(425, 400, 75, 75);
        g.fillOval(675, 400, 75, 75);
        g.fillOval(750, 400, 75, 75);
        g.fillOval(915, 400, 75, 75);
    }

    static void drawBody(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(350, 200, 500, 200);
        g.setColor(Color.lightGray);
        g.drawLine(350, 300, 800, 300);
    }

    static void drawHead(Graphics g){
        g.setColor(Color.red);
        g.fillRoundRect(800, 175, 100, 230, 25, 50);
        g.fillRoundRect(880, 250, 75, 155, 40, 50);
        g.fillRoundRect(950, 300, 50, 105, 25, 50);
        g.fillRect(830, 300, 150, 105);
    }

    static void drawDoor(Graphics g){
        g.setColor(Color.lightGray);
        g.fillRoundRect(820, 280, 80, 125, 25, 50);
    }
}