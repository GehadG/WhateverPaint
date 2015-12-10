/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Shapes.Line;
import Shapes.FreeHand;
import Shapes.IsocelesTriangle;
import Shapes.Mover;
import Shapes.Rectangle;
import Shapes.Resizer;
import Shapes.RightTriangle;
import Shapes.Shapes;
import WhateverPaint.MainWindow;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import Shapes.Selector;
        

/**
 *
 * @author Gehad
 */
public class Canvas extends JPanel implements MouseListener,MouseMotionListener{
    
    private static Shapes s = new FreeHand();
 

    public static void setShape(Shapes s) {
        Canvas.s = s;
    }
    public static ArrayList<Shapes> prevShapes = new ArrayList();
    
    
    private static int stroke;
    private static Color color = Color.BLACK;
    public Canvas() {
        setBackground(color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
     
    }


    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Shapes ss:prevShapes)
        {
            ss.drawShape(g);
        }
        
          s.drawShape(g);
       

    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Selector.disposeSelection();
        if(s instanceof Selector)
        {
            ((Selector)s).select(e.getPoint());
        }
      repaint();
       
    }
private int x,y;
    @Override
    public void mousePressed(MouseEvent e) {
      s.setxPos(e.getX());
      s.setyPos(e.getY());
      s.setColor(color);
      s.setPenSize(stroke);
      
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(!(s instanceof Selector)&&!(s instanceof Mover)&&!(s instanceof Resizer))
        {
      prevShapes.add(s);
        
    }
        else
        {
            
            repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        MainWindow.setPosition("Mouse Position :"+e.getX()+","+e.getY());
        if(s instanceof FreeHand)
        {s.setPoint(e.getPoint());
         
        
        }
        else if(s instanceof Mover)
        {Mover temp= new Mover();
           for(Shapes s2: prevShapes)
           {    if(s2.isSelected())
               temp=s2.move(e.getPoint(),(Mover) s);
           }
           s=temp;
        }
        else if(s instanceof Resizer)
        {
            for(Shapes s2:prevShapes)
            {
                if(s2.isSelected())
                    s2.resize(e.getPoint(), (Resizer) s);
            }
        }
          else if (s instanceof Line) {
            s.setWidths(e.getX());
            s.setLengths(e.getY() );
           
        }
          else if(s instanceof RightTriangle|| s instanceof IsocelesTriangle){
              s.setWidths(e.getX()-s.getxPos());
            s.setLengths(e.getY()-s.getyPos() ); 
          }
          
        else {
            s.setWidths(e.getX() );
            s.setLengths(e.getY() );
   
        }
       
           repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        MainWindow.setPosition("Mouse Position :"+e.getX()+","+e.getY());
        
    }

    

    public static void setStroke(int stroke) {
        Canvas.stroke = stroke;
    }

    public static void setColor(Color color) {
        Canvas.color = color;
    }

    public static ArrayList<Shapes> getPrevShapes() {
        return prevShapes;
    }

    public static void setPrevShapes(ArrayList<Shapes> prevShapes) {
        Canvas.prevShapes = prevShapes;
    }

    
    
}
