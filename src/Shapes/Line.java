/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 *
 * @author Gehad
 */
public class Line extends Shapes {
 private Line2D line = new Line2D.Double();   

    public Line() {
        setThisShape(line);
    }
    

    @Override
    public void drawShape(Graphics g) {
        
         Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        line.setLine(getxPos(), getyPos(), getWidths(), getLengths());
        g2.draw(line);
        g2.setPaint(getFillColor());
        g2.fill(line);
        if(isSelected())
            drawBound(g);
        
        
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
    public void drawBound(Graphics g) {
        drawBoundPoint(getxPos(), getyPos(), g);
        drawBoundPoint((int)getWidths(), (int)getLengths(), g);
        
        
    }
    @Override
    public void resize(Point p, Resizer r) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
    
    
}
