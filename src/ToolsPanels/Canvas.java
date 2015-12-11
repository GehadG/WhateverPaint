/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Shapes.Filler;
import Shapes.Line;
import Shapes.FreeHand;
import Shapes.IsocelesTriangle;
import Shapes.Mover;
import Shapes.Picker;
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
        

/**
 *
 * @author Gehad
 */
public class Canvas extends JPanel implements MouseListener,MouseMotionListener,KeyListener{
    
    private static Shapes s = new FreeHand();
    public static boolean whichColor=false;

    public static void setShape(Shapes s) {
        Canvas.s = s;
    }
    public static ArrayList<Shapes> prevShapes = new ArrayList();
    private boolean flag=false;
    
    private static int stroke;
    private static Color color = Color.BLACK;
    private static Color bgColor= new Color(255, 255, 255, 0);
    private Color transparent= new Color(255, 255, 255, 0);
    public Canvas() {
        setBackground(color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
            
        
     
    }

    public static void setBgColor(Color bgColor) {
        Canvas.bgColor = bgColor;
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
        flag=false;
      s.setxPos(e.getX());
      s.setyPos(e.getY());
      s.setColor(color);
      s.setPenSize(stroke);
      
       if(s instanceof Filler)
        {
            for(Shapes ss:prevShapes)
            {
                if(ss.containsPoint(e.getPoint()))
                {   
                    ss.setFillColor(bgColor);
                }
                
            }
            repaint();
        }
       else if(s instanceof Picker)
       {
            try {
                Robot robot =new Robot();
                color = robot.getPixelColor(e.getXOnScreen(), e.getYOnScreen());
                ColorBoxes.penColor.setBackground(color);
            } catch (AWTException ex) {
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
      
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
        if(flag&&!(s instanceof Selector)&&!(s instanceof Mover)&&!(s instanceof Resizer)&&!(s instanceof Filler)&&!(s instanceof Picker))
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
        flag=true;
        MainWindow.setPosition("Mouse Position :"+e.getX()+","+e.getY());
        if(s instanceof FreeHand)
        {s.setPoint(e.getPoint());
         
        
        }
        
        else if(s instanceof Mover)
        {Mover temp= new Mover();
        
           for(Shapes s2: prevShapes)
           {    if(s2.isSelected()||s2.containsPoint(e.getPoint())){
               temp=s2.move(e.getPoint(),(Mover) s);
               
           }
           
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

    @Override
    public void keyTyped(KeyEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
 // System.out.println("Pressed " + e.getKeyCode());
        if(e.getKeyCode()==127)
        {ArrayList<Shapes> temp= new ArrayList();
            for(Shapes ss:prevShapes)
            {
                if(!ss.isSelected()){
                    
                    temp.add(ss);
                }
                
                
            }
            prevShapes=temp;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
