import java.awt.*;

public class RunFace
{
   public static void main(String[] args)
   {
      Frame frame = new Frame();
      SmileyFace face = new SmileyFace();
      frame.setSize(260,200);
      frame.setBackground(Color.yellow);
      frame.add(face);
      frame.setVisible(true);
   }
}
