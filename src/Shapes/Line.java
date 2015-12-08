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
    

    @Override
    public void drawShape(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        line.setLine(getxPos(), getyPos(), getWidths(), getLengths());
        g2.draw(line);
        
    }

    @Override
    public boolean containsPoint(Point p) {
       return line.contains(p);
    }
    
    
    
}
