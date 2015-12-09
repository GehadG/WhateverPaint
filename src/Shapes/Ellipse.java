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
import java.awt.geom.Ellipse2D;


/**
 *
 * @author Gehad
 */
public class Ellipse extends Shapes {
    protected Ellipse2D ellipse = new Ellipse2D.Double();

    public Ellipse() {
        setThisShape(ellipse);
    }
    
    
    
    

    @Override
    public void drawShape(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        ellipse.setFrame(Math.min(getWidths(), getxPos()),Math.min(getLengths(), getyPos()),Math.abs(getWidths()-getxPos()),Math.abs(getLengths()-getyPos()));
        g2.draw(ellipse);
        
    }

    
    
}
