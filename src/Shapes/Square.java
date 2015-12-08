/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;


/**
 *
 * @author Gehad
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }
    
    
    @Override
    public void drawShape(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        
        rect.setRect(getxPos(), getyPos(), getWidths(), getWidths());
        g2.draw(rect);
        
        
    }
    
}
