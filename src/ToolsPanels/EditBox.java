/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Tools.Filler;
import Tools.Mover;
import Tools.Picker;
import Shapes.Rectangle;
import Shapes.Shapes;
import UndoRedoManager.Manager;
import UndoRedoManager.ScreenShot;
import WhateverPaint.MainWindow;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Gehad
 */
public class EditBox extends javax.swing.JPanel {
   private Stack <Shapes> redoo;
    private Shapes temp1;
    private Shapes temp2;
    private int flag1=0;
    private int flag2=0;
    private ArrayList<Shapes> prevShapes2 = new ArrayList();
    private Canvas cc;
    public EditBox() {
        initComponents();
       
        this.redoo = new Stack();
        redo.setEnabled(false);
        undo.setEnabled(false);
    }
    public void setCanvas(Canvas c)
    {
        cc=c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fill = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        picker = new javax.swing.JButton();
        move = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 40, 40));
        setMaximumSize(new java.awt.Dimension(135, 80));

        fill.setBackground(null);
        fill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fill-color.png"))); // NOI18N
        fill.setBorder(null);
        fill.setOpaque(false);
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });

        undo.setBackground(null);
        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit-undo.png"))); // NOI18N
        undo.setOpaque(false);
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setBackground(null);
        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit-redo.png"))); // NOI18N
        redo.setOpaque(false);
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        picker.setBackground(null);
        picker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/color-picker.png"))); // NOI18N
        picker.setOpaque(false);
        picker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickerActionPerformed(evt);
            }
        });

        move.setBackground(null);
        move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/transform-move.png"))); // NOI18N
        move.setOpaque(false);
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(fill, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
Canvas.setShape(new Filler());
        MainWindow.old=fill;  
         for(Shapes s: Canvas.prevShapes)
        {
            if(s.isSelected())
                s.setFillColor(ColorBoxes.bgColor.getBackground());
        }
        cc.repaint();
    }//GEN-LAST:event_fillActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
     if(Manager.undoStack.isEmpty()==false)
     {
         ScreenShot temp = Manager.undoStack.pop();
         Manager.redoStack.push(temp);
         redo.setEnabled(true);
        
         Canvas.prevShapes.addAll(temp.getShapes());
         System.out.println(temp.getShapes().size());
        Canvas.intersects.clear();
         Canvas.intersects = temp.getIntersections();
         if(Manager.undoStack.isEmpty())
             undo.setEnabled(false);
     }
     cc.repaint();
     
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        if(Manager.redoStack.isEmpty()==false)
     {undo.setEnabled(true);
         ScreenShot temp = Manager.redoStack.pop();
         Manager.undoStack.push(temp);
         Canvas.prevShapes= temp.getShapes();
         Canvas.intersects = temp.getIntersections();
         if(Manager.redoStack.isEmpty())
             redo.setEnabled(false);
     }
     cc.repaint();
    }//GEN-LAST:event_redoActionPerformed

    private void pickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickerActionPerformed
       Canvas.setShape(new Picker());
        MainWindow.old=picker; 
    }//GEN-LAST:event_pickerActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
     Canvas.setShape(new Mover());
        MainWindow.old=move; 
    }//GEN-LAST:event_moveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fill;
    private javax.swing.JButton move;
    private javax.swing.JButton picker;
    public static javax.swing.JButton redo;
    public static javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
