import java.awt.*;
import java.awt.geom.*;

public class ReceptacleView {
   private Color color = Color.BLUE;
   private Rectangle2D.Double shape = null;
   private Receptacle c;
  
   public ReceptacleView(Receptacle container){
      c = container;
      Vector2D dlCorner = c.getDLcorner();
      Vector2D urCorner = c.getURcorner();
      shape = new Rectangle2D.Double(dlCorner.getX(),dlCorner.getY(), 
                                    urCorner.getX()-dlCorner.getX(), urCorner.getY()-dlCorner.getY());
   }
   public void draw(Graphics2D g) {
      Vector2D dlCorner = c.getDLcorner();
      Vector2D urCorner = c.getURcorner();
      shape.setFrame(dlCorner.getX(),dlCorner.getY(),urCorner.getX()-dlCorner.getX(),
                     urCorner.getY()-dlCorner.getY());
      g.setColor(color);
      g.draw(shape);
   }
}