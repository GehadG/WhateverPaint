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

    private Polygon triangle;

    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        int x1=getxPos();
        int x2=x1-(int)getWidths();
        int y1=getyPos();
        int y2=y1+(int)getLengths();
        int y3= y2;
        int x3= x1+(int)getWidths();
        
        g2.setStroke(new BasicStroke(getPenSize()));
        triangle=new Polygon(new int[]{x1,x2,x3},new int[]{y1,y2,y3},3);
        g2.draw(triangle);
    }

    @Override
    public boolean containsPoint(Point p) {
        return triangle.contains(p);
    }
}
