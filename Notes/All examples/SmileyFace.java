
import java.awt.*;
import java.applet.*;

class SmileyFace extends Applet
{
   public void paint(Graphics g)
   {
      g.setColor(Color.red);
      g.drawOval(85,45,75,75); // the face
      g.setColor(Color.blue);
      g.drawOval(100,65,10,10); // the right eye
      g.drawOval(135,65,10,10); // the left eye
      g.drawArc(102,85,40,25,-0,-180); // the mouth
      g.drawString("Smiley Face",90,155);
   }
}

