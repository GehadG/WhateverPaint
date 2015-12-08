package Shapes;


import Shapes.Shapes;
import ToolsPanels.Canvas;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gehad
 */
public class Selector extends Shapes {
 private Rectangle2D rect = new Rectangle2D.Double();
    @Override
    public void drawShape(Graphics g) {
        float dash1[] = { 10.0f };
        BasicStroke dashed = new BasicStroke(3.0f,
      BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
        Graphics2D g2 = (Graphics2D) g;
        g2.setComposite(AlphaComposite.SrcOver.derive(0.1f));
       
        g2.setStroke(dashed);
        rect.setRect(getxPos(), getyPos(), getWidths(), getLengths());
        g2.draw(rect); 
         g2.setColor(new Color(0,191,243));
         g2.fill(rect);
         g2.setComposite(AlphaComposite.SrcOver);
        
    }
    public void select()
    {Rectangle2D checker = new Rectangle2D.Double();
        for(Shapes s: Canvas.prevShapes)
        {
           checker=s.getThisShape().getBounds2D();
           if(rect.contains(checker))
               s.setSelected(true);
           else
               s.setSelected(false);
           
            System.out.println(s.isSelected());
            
        }
    }
    
}
