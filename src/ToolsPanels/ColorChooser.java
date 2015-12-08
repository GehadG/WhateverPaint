/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gehad
 */
public class ColorChooser extends javax.swing.JPanel {
    private Color ignorer;
    private Point coord;
    private Robot robot = null;
    private Color color;
    private Color currently;
 
    public ColorChooser() {
        initComponents();
        currently = Color.black;
        ignorer = new Color(214,217,223);
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(ColorChooser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorWheel = new javax.swing.JLabel();
        metaColor = new javax.swing.JPanel();
        currentColor = new javax.swing.JPanel();
        colorStrip = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        colorWheel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/color-picker-wheel.png"))); // NOI18N
        colorWheel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                colorWheelMouseMoved(evt);
            }
        });
        colorWheel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorWheelMouseClicked(evt);
            }
        });

        metaColor.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout metaColorLayout = new javax.swing.GroupLayout(metaColor);
        metaColor.setLayout(metaColorLayout);
        metaColorLayout.setHorizontalGroup(
            metaColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        metaColorLayout.setVerticalGroup(
            metaColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        currentColor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout currentColorLayout = new javax.swing.GroupLayout(currentColor);
        currentColor.setLayout(currentColorLayout);
        currentColorLayout.setHorizontalGroup(
            currentColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        currentColorLayout.setVerticalGroup(
            currentColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        colorStrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/color-picker-strip.png"))); // NOI18N
        colorStrip.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                colorStripMouseMoved(evt);
            }
        });
        colorStrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorStripMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(currentColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(metaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(colorStrip)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(colorWheel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorWheel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(colorStrip)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void colorWheelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorWheelMouseMoved
         coord = MouseInfo.getPointerInfo().getLocation();
         color = robot.getPixelColor(coord.x, coord.y);
         
         if(color.equals(ignorer))
         {
             metaColor.setBackground(currently);
         }
         else{
         metaColor.setBackground(color);
         }
         
    }//GEN-LAST:event_colorWheelMouseMoved

    private void colorWheelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorWheelMouseClicked
         coord = MouseInfo.getPointerInfo().getLocation();
         color = robot.getPixelColor(coord.x, coord.y);
         currently= color;
         Canvas.setColor(currently);
         currentColor.setBackground(currently);
    }//GEN-LAST:event_colorWheelMouseClicked

    private void colorStripMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorStripMouseMoved
         coord = MouseInfo.getPointerInfo().getLocation();
         color = robot.getPixelColor(coord.x, coord.y);
         
         if(color.equals(ignorer))
         {
             metaColor.setBackground(currently);
         }
         else{
         metaColor.setBackground(color);
         }
         
    }//GEN-LAST:event_colorStripMouseMoved

    private void colorStripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorStripMouseClicked
       coord = MouseInfo.getPointerInfo().getLocation();
         color = robot.getPixelColor(coord.x, coord.y);
         currently= color;
         Canvas.setColor(currently);
         currentColor.setBackground(currently);
    }//GEN-LAST:event_colorStripMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorStrip;
    private javax.swing.JLabel colorWheel;
    private javax.swing.JPanel currentColor;
    private javax.swing.JPanel metaColor;
    // End of variables declaration//GEN-END:variables
}