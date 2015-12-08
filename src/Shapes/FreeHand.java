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
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;


/**
 *
 * @author Gehad
 */
public class FreeHand extends Shapes {
    private ArrayList<Point> points = new ArrayList();
    private int minX=1000;
    private int minY=1000;
    private int maxX=0;
    private int maxY=0;
   
    @Override
    public void drawShape(Graphics g) {
        
       Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(getPenSize()));
        
           if(points.size()>1)
           {
               for(int i=0;i<points.size()-1;i++)
               {
                   g2.drawLine((int)points.get(i).getX(),(int) points.get(i).getY(),(int)points.get(i+1).getX(),(int) points.get(i+1).getY());
                   if((int)points.get(i).getX()>=maxX)
                   {
                       maxX=(int)points.get(i).getX();
                   }
                   if((int)points.get(i).getY()>=maxY)
                   {
                       maxY=(int)points.get(i).getY();
                   }
                   if((int)points.get(i).getX()<minX)
                   {
                       minX=(int)points.get(i).getX();
                   }
                   if((int)points.get(i).getY()<minY)
                   {
                       minY=(int)points.get(i).getY();
                   }
               }
           }
          Rectangle2D bound = new Rectangle2D.Double();
          bound.setFrame(minX, minY, maxX-minX, maxY-minY);
          setThisShape(bound);
          
        
        
    }

    @Override
    public void setPoint(Point p) {
        points.add(p);
        
    }

   
    
    
    
}
