/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Shapes.Selector;
import Shapes.Square;
import Shapes.Circle;
import Shapes.RightTriangle;
import Shapes.Line;
import Shapes.FreeHand;
import Shapes.Ellipse;
import Shapes.Rectangle;
import Shapes.IsocelesTriangle;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Gehad
 */
public class ToolBoxs extends javax.swing.JPanel {

public   JButton old;
    public ToolBoxs() {
        initComponents();
        Hashtable<Integer,JLabel> labels = new Hashtable();
        labels.put(0,new JLabel("0"));
        labels.put(10,new JLabel("10"));
        labels.put(20,new JLabel("20"));
        stroker.setLabelTable(labels);
        stroker.setValue(0);
        old=freeHand;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rect = new javax.swing.JButton();
        ellipse = new javax.swing.JButton();
        circle = new javax.swing.JButton();
        freeHand = new javax.swing.JButton();
        line = new javax.swing.JButton();
        isoTrig = new javax.swing.JButton();
        rightTrig = new javax.swing.JButton();
        stroker = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        sqButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(205, 164));
        setMinimumSize(new java.awt.Dimension(205, 164));
        setPreferredSize(new java.awt.Dimension(205, 164));

        rect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-rectangle.png"))); // NOI18N
        rect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectActionPerformed(evt);
            }
        });

        ellipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-ellipse.png"))); // NOI18N
        ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellipseActionPerformed(evt);
            }
        });

        circle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-circle.png"))); // NOI18N
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        freeHand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-freehand.png"))); // NOI18N
        freeHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeHandActionPerformed(evt);
            }
        });

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-line.png"))); // NOI18N
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });

        isoTrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-triangle3.png"))); // NOI18N
        isoTrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isoTrigActionPerformed(evt);
            }
        });

        rightTrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-triangle.png"))); // NOI18N
        rightTrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTrigActionPerformed(evt);
            }
        });

        stroker.setMaximum(20);
        stroker.setMinorTickSpacing(1);
        stroker.setPaintLabels(true);
        stroker.setPaintTicks(true);
        stroker.setSnapToTicks(true);
        stroker.setToolTipText("Brush Size");
        stroker.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                strokerStateChanged(evt);
            }
        });

        jLabel1.setText("Brush Size");

        jLabel2.setText("Tool Box");

        selectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/select-rectangular.png"))); // NOI18N
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        sqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/draw-square.png"))); // NOI18N
        sqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rect, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rightTrig, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(isoTrig, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(freeHand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(stroker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rect)
                            .addComponent(ellipse)
                            .addComponent(circle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rightTrig)
                            .addComponent(isoTrig)
                            .addComponent(line)
                            .addComponent(freeHand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stroker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sqButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectActionPerformed
        Canvas.setShape(new Rectangle());
        old=rect;
    }//GEN-LAST:event_rectActionPerformed

    private void ellipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseActionPerformed
        Canvas.setShape(new Ellipse());
        old=ellipse;
    }//GEN-LAST:event_ellipseActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        Canvas.setShape(new Circle());
        old=circle;
    }//GEN-LAST:event_circleActionPerformed

    private void freeHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeHandActionPerformed
        Canvas.setShape(new FreeHand());
        old = freeHand;
    }//GEN-LAST:event_freeHandActionPerformed

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
        Canvas.setShape(new Line());
        old = line;
    }//GEN-LAST:event_lineActionPerformed

    private void isoTrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isoTrigActionPerformed
        Canvas.setShape(new IsocelesTriangle());
        old = isoTrig;
    }//GEN-LAST:event_isoTrigActionPerformed

    private void rightTrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTrigActionPerformed
        Canvas.setShape(new RightTriangle());
        old=rightTrig;
    }//GEN-LAST:event_rightTrigActionPerformed

    private void strokerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_strokerStateChanged
        Canvas.setStroke(stroker.getValue()+1);
    }//GEN-LAST:event_strokerStateChanged

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        Canvas.setShape(new Selector());
       
        old=selectButton;
    }//GEN-LAST:event_selectButtonActionPerformed

    private void sqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqButtonActionPerformed
        Canvas.setShape(new Square());
        
        old=sqButton;
    }//GEN-LAST:event_sqButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circle;
    private javax.swing.JButton ellipse;
    private javax.swing.JButton freeHand;
    private javax.swing.JButton isoTrig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton line;
    private javax.swing.JButton rect;
    private javax.swing.JButton rightTrig;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton sqButton;
    private javax.swing.JSlider stroker;
    // End of variables declaration//GEN-END:variables
}
