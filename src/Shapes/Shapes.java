/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
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
    
    public abstract void drawShape(Graphics g);
    public abstract boolean containsPoint(Point p);
    public void setPoint(Point p){
        
    }
  
}
