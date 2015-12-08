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
import java.awt.Polygon;

/**
 *
 * @author Gehad
 */
public class IsocelesTriangle extends Shapes {
private int x1,x2,x3,y1,y2,y3;
    private Polygon triangle;

    public IsocelesTriangle() {
        setThisShape(triangle);
    }
    

    @Override
    public void drawShape(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
         x1=getxPos();
         x2=x1-(int)getWidths();
         y1=getyPos();
         y2=y1+(int)getLengths();
         y3= y2;
         x3= x1+(int)getWidths();
        
        g2.setStroke(new BasicStroke(getPenSize()));
        triangle=new Polygon(new int[]{x1,x2,x3},new int[]{y1,y2,y3},3);
        g2.draw(triangle);
        
    }
 @Override
    public void drawBound(Graphics g) {
        drawBoundPoint(x1, y1, g);
        drawBoundPoint(x2, y2, g);
        drawBoundPoint(x3, y3, g);

    }
}
