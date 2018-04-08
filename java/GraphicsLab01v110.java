/*
 * Kim Luong
 * Computer Science Period 3
 * Date: 9/27/2017
 * Assignment: GraphicsLab01
 *  Version: 110 point
 */
import java.awt.*;
import java.applet.*;

public class GraphicsLab01v110 extends Applet {
    public void paint (Graphics g){
        //Draw Cube
        g.setColor(Color.orange);
        g.drawRect(0,0,200,200);
        g.drawRect(50,50,200,200);
        g.drawLine(0,0,50,50);
        g.drawLine(0,200,50,250);
        g.drawLine(200,0,250,50);
        g.drawLine(200,200,250,250);
        //Draw Sphere
        g.setColor(Color.blue);
        //base
        g.drawOval(25,25,200,200);
        //horizontal
        g.drawOval(25,100,200,50);
        g.drawOval(25,75,200,100);
        g.drawOval(25,50,200,150);
        //vertical
        g.drawOval(100,25,50,200);
        g.drawOval(75,25,100,200);
        g.drawOval(50,25,150,200);
        //Draw APCS
        //A
        g.setColor(Color.magenta);
        g.fillRect(25,300,25,125);
        g.fillRect(75,300,25,125);
        g.fillRect(50,300,25,25);
        g.fillRect(50,350,25,25);
        //P
        g.setColor(Color.green);
        g.fillRect(125,300,25,125);
        g.fillRect(150,300,25,25);
        g.fillRect(150,350,25,25);
        g.fillRect(175,300,25,75);
        //C
        g.setColor(Color.cyan);
        g.fillRect(225,300,25,125);
        g.fillRect(250,300,50,25);
        g.fillRect(250,400,50,25);
        //S
        g.setColor(Color.red);
        g.fillRect(325,300,25,65);
        g.fillRect(375,363,25,62);
        g.fillRect(350,300,50,25);
        g.fillRect(325,350,75,25);
        g.fillRect(325,400,50,25);
        //Draw Inscribed/Circumscribed Triangle
        //Circle
        g.setColor(Color.green);
        g.drawOval(400,50,203,203);
        //Triangle
        g.setColor(Color.gray);
        g.drawLine(500,50,423,215);
        g.drawLine(500,50,580,215);
        g.drawLine(423,215,580,215);
        //Mini-Circle
        g.setColor(Color.red);
        g.drawOval(451,115,100,100);
        //Draw Pacmen Flower
        g.setColor(Color.yellow);
        //Top
        g.fillArc(550,255,100,100,135,270);
        //Right
        g.fillArc(615,320,100,100,45,270);
        //Left
        g.fillArc(485,320,100,100,225,270);
        //Down
        g.fillArc(550,385,100,100,315,270);
    }
}