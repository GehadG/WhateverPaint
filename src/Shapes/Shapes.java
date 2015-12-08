/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Gehad
 */
public abstract class Shapes extends JComponent{
    private int xPos;
    private int yPos;
    private Color color;
    private int penSize;
    private double lengths;
    private double widths;
    private boolean selected=false;
    private Shape thisShape;
    private int mouseDraggedx;
    private int mouseDraggedy;
    private int mousePressedx;
    private int mousePressedy;
    private ArrayList<Rectangle2D> resizePoints= new ArrayList();
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    public int getxPos() {
        return xPos;
    }

    public double getLengths() {
        return lengths;
    }

    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    public double getWidths() {
        return widths;
    }

    public void setWidths(double widths) {
        this.widths = widths;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPenSize() {
        return penSize;
    }

    public void setPenSize(int penSize) {
        this.penSize = penSize;
    }

    public Shape getThisShape() {
        return thisShape;
    }

    public void setThisShape(Shape thisShape) {
        this.thisShape = thisShape;
    }
    
    public abstract void drawShape(Graphics g);
    public  boolean containsPoint(Point p){
       boolean check =thisShape.getBounds2D().contains(p);
        return check;
    }
    public void setPoint(Point p){
        
    }
    
    protected void drawBoundPoint(int x, int y, Graphics g) {
         Graphics2D g2= (Graphics2D) g;
         Rectangle2D boundPoint=new Rectangle2D.Double();
         boundPoint.setRect(x - 3, y - 3, 7,7);
         g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.BLACK);
        g2.draw(boundPoint);
        g2.setStroke(new BasicStroke(0));
        g2.setPaint(Color.white);
        g2.fill(boundPoint);
        resizePoints.add(boundPoint);
       
    }
     public void drawBound(Graphics g)
     { Rectangle2D bound = thisShape.getBounds2D();
         drawBoundPoint((int)bound.getMinX(),(int)bound.getMinY(), g);
         drawBoundPoint((int)bound.getMinX(),(int)bound.getMaxY(), g);
         drawBoundPoint((int)bound.getMaxX(),(int)bound.getMinY(), g);
         drawBoundPoint((int)bound.getMaxX(),(int)bound.getMaxY(), g);
         
     }

    public int getMouseDraggedx() {
        return mouseDraggedx;
    }

    public void setMouseDraggedx(int mouseDraggedx) {
        this.mouseDraggedx = mouseDraggedx;
    }

    public int getMouseDraggedy() {
        return mouseDraggedy;
    }

    public void setMouseDraggedy(int mouseDraggedy) {
        this.mouseDraggedy = mouseDraggedy;
    }

    public int getMousePressedx() {
        return mousePressedx;
    }

    public void setMousePressedx(int mousePressedx) {
        this.mousePressedx = mousePressedx;
    }

    public int getMousePressedy() {
        return mousePressedy;
    }

    public void setMousePressedy(int mousePressedy) {
        this.mousePressedy = mousePressedy;
    }
     
     
  
}
