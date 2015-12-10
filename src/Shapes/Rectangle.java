
package Shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

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
        g2.setPaint(getFillColor());
        g2.fill(rect);
        if(isSelected())
            drawBound(g2);
        
        
    }

    @Override
    public Mover move(Point p,Mover m) {
        int baseX=m.getxPos();
        int baseY=m.getyPos();
        int dx = (int) (p.getX() - baseX);
        int dy = (int) (p.getY() - baseY);
        setxPos(getxPos()+dx);
                    setyPos(getyPos()+dy);
                    setWidths(getWidths()+dx);
                    setLengths(getLengths()+dy);
                  
                    m.setxPos(baseX+dx);
                    m.setyPos(baseY+dy);
                    return m;
        
    }

    @Override
    public void resize(Point p, Resizer r) {
        ArrayList<Rectangle2D> rs = getResizePoints();
        for(int i=0;i<rs.size();i++)
        {
            if(rs.get(i).contains(p))
            {
                if(i==0)
                {
                    setxPos((int) p.getX());
                    setyPos((int) p.getY());
                }
                else if(i==1)
                {
                    setxPos((int) p.getX());
                    
                    setLengths(p.getY());
                }
                else if(i==2)
                {
                    setyPos((int) p.getY());
                    
                    setWidths(p.getX());
                }
                else 
                {
                    setWidths((int) p.getX());
                    setLengths((int) p.getY());
                    
                }
            }
        }
        
    }

   
    
    
}
