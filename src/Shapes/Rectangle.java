
package Shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

/*
 *
 * @author Gehad
 */
public class Rectangle extends Shapes{
    
    protected Rectangle2D rect = new Rectangle2D.Double();
    public Rectangle() {
        setThisShape(rect);
    }

    @Override
    public void drawShape(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        rect.setRect(Math.min(getWidths(), getxPos()),Math.min(getLengths(), getyPos()),Math.abs(getWidths()-getxPos()),Math.abs(getLengths()-getyPos()));
        g2.draw(rect); 
        
        
    }

    
    
}
