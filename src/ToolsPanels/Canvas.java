/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Shapes.Line;
import Shapes.FreeHand;
import Shapes.Rectangle;
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

/**
 *
 * @author Gehad
 */
public class Canvas extends JPanel implements MouseListener,MouseMotionListener{
    
    private static Shapes s = new Rectangle();
Point coord;
      Robot robot = null;

    public static void setShape(Shapes s) {
        Canvas.s = s;
    }
    private ArrayList<Shapes> prevShapes = new ArrayList();
   
    private static int stroke;
    private static Color color;
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
       
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
      s.setxPos(e.getX());
      s.setyPos(e.getY());
      s.setColor(color);
      s.setPenSize(stroke);
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      prevShapes.add(s);
        
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
          else if (s instanceof Line) {
            s.setWidths(e.getX());
            s.setLengths(e.getY() );
           
        }
        else {
            s.setWidths(e.getX() - s.getxPos());
            s.setLengths(e.getY() - s.getyPos());
   
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

    
    
}
