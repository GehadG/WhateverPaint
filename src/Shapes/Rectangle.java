
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

    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        rect.setRect(getxPos(), getyPos(), getWidths(), getLengths());
        g2.draw(rect);    
    }

    @Override
    public boolean containsPoint(Point p) {
        return rect.contains(p);
    }
    
}
