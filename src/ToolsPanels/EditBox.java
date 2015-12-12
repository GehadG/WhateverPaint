/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import Tools.Filler;
import Tools.Mover;
import Tools.Picker;

import Shapes.Shapes;
import Tools.Eraser;
import UndoRedoManager.Manager;
import UndoRedoManager.ScreenShot;
import WhateverPaint.MainWindow;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JButton;

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
        erase = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 40, 40));
        setMaximumSize(new java.awt.Dimension(210, 47));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(210, 47));

        fill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Paint-Bucket-32.png"))); // NOI18N
        fill.setToolTipText("Fill");
        fill.setBorder(null);
        fill.setContentAreaFilled(false);
        fill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });

        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/return13.png"))); // NOI18N
        undo.setContentAreaFilled(false);
        undo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/redo.png"))); // NOI18N
        redo.setContentAreaFilled(false);
        redo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        picker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Color Picker-32.png"))); // NOI18N
        picker.setToolTipText("Color Picker");
        picker.setContentAreaFilled(false);
        picker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        picker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickerActionPerformed(evt);
            }
        });

        move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/graphic-design (1).png"))); // NOI18N
        move.setToolTipText("Move");
        move.setContentAreaFilled(false);
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        erase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Data-Erase-32.png"))); // NOI18N
        erase.setContentAreaFilled(false);
        erase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonReleased(evt);
            }
        });
        erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fill, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(picker, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(picker, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
         System.out.println(Manager.undoStack.size());
         Manager.redoStack.push(temp);
         redo.setEnabled(true);
        
         Canvas.prevShapes=(temp.getShapes());
         
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

    private void buttonReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReleased
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.release(Button);
    }//GEN-LAST:event_buttonReleased

    private void fillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillMousePressed
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.press(Button);
    }//GEN-LAST:event_fillMousePressed

    private void fillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillMouseExited
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.exit(Button);
    }//GEN-LAST:event_fillMouseExited

    private void eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseActionPerformed
      Canvas.setShape(new Eraser());
        MainWindow.old=erase; 
    }//GEN-LAST:event_eraseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton erase;
    private javax.swing.JButton fill;
    private javax.swing.JButton move;
    private javax.swing.JButton picker;
    public static javax.swing.JButton redo;
    public static javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
